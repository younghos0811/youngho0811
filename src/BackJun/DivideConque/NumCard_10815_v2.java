package BackJun.DivideConque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class NumCard_10815_v2 {
	
/*
분류 : Divide & Conquer

문제:
	숫자 카드는 정수 하나가 적혀져 있는 카드이다. 
	상근이는 숫자 카드 N개를 가지고 있다. 숫자 M개가 주어졌을 때, 이 숫자가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.

입력:
	첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N (1 ≤ N ≤ 500,000)이가 주어진다.

	둘째 줄에는 숫자 카드에 적혀있는 숫자가 주어진다. 숫자 카드에 적혀있는 숫자는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
	두 숫자 카드에 같은 숫자가 적혀있는 경우는 없다.

	셋째 줄에는 M (1 ≤ M ≤ 500,000)이 주어진다.

 	넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 숫자가 주어지며, 이 숫자는 공백으로 구분되어져 있다. 
 	이숫자도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다

출력:
	첫째 줄에 입력으로 주어진 M개의 숫자에 대해서, 각 숫자가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.


예제 입력:
	5
	6 3 2 10 -10
	8
	10 9 -5 2 3 4 5 -10
예제 출력: 
	1 0 0 1 1 0 0 1
	
풀이방법:
	Divde&Conqure을 이용
 
*/	
	
	static int[] myArr ;
	static int myArrLength;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int myCnt = Integer.valueOf(br.readLine());
		int cnt = 0;
		int i=0; 
		StringBuilder sb = new StringBuilder();
		myArr = new int[myCnt];
		myArrLength = myCnt;
		/* 카드값 바인딩 루프*/
		for(String s : br.readLine().split(" ")) {
			myArr[i] = Integer.valueOf(s);
			i++;
		}
		
		Arrays.sort(myArr);	//배열 정렬
		cnt = Integer.valueOf(br.readLine());
		/*카드값 존재여부 체크 루프*/
		for(String s : br.readLine().split(" ")) {
			sb.append(getContainNum(Integer.valueOf(s)) + " ");
		}
		
		System.out.println(sb.toString());
	}
	
	private static int getContainNum(int val) {
		int mid = 0;
		int left = 0;
		int right = myArrLength -1;
		
		while(left <= right) {
			mid = (left+right)/2;
			
			if(myArr[mid] == val)
				return 1;
			
			if(myArr[mid] > val) {
				right = mid -1;
			}
			else {
				left = mid+1;
			}
		}
		
		return 0;
	}
}
