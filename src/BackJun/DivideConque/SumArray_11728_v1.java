package BackJun.DivideConque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumArray_11728_v1 {

/*
분류 : Divide & Conquer

문제 :
정렬되어있는 두 배열 A와 B가 주어진다. 두 배열을 합친 다음 정렬해서 출력하는 프로그램을 작성하시오.

입력 :
첫째 줄에 배열 A의 크기 N, 배열 B의 크기 M이 주어진다. (1 ≤ N, M ≤ 1,000,000)

둘째 줄에는 배열 A의 내용이, 셋째 줄에는 배열 B의 내용이 주어진다. 배열에 들어있는 수는 절대값이 109보다 작거나 같은 정수이다.

출력 :
첫째 줄에 두 배열을 합친 후 정렬한 결과를 출력한다.

예제 입력 1:
2 2
3 5
2 9
예제 출력 :
2 3 5 9

예제 입력 2:
2 1
4 7
1
예제 출력 :
1 4 7


예제 입력 3:
4 3
2 3 5 9
1 4 7

예제 출력 :
1 2 3 4 5 7 9
	
풀이방법:
	우선 풀이
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] splits = br.readLine().split(" ");
		int[] arr1 = new int[Integer.valueOf(splits[0])];
		int[] arr2 = new int[Integer.valueOf(splits[1])];
		
//		String stub =  br.readLine();
		int[] arr = new int[arr1.length+arr2.length];
		int i=0;
		
		splits = br.readLine().split(" ");
		for(String s : splits) {
			arr[i] = Integer.valueOf(s);
			i++;
		}
		
		splits = br.readLine().split(" ");
		for(String s : splits) {
			arr[i] = Integer.valueOf(s);
			i++;
		}
		
		Arrays.sort(arr);
		
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		
	}
	
}
