package BackJun.DivideConque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumArray_11728_v2 {

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
	Mergesort
	*/
	static int arr1[];
	static int arr2[];
	static int arr[];
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] splits = br.readLine().split(" ");
		arr1 = new int[Integer.valueOf(splits[0])];
		arr2 = new int[Integer.valueOf(splits[1])];
		arr = new int[arr1.length+arr2.length];
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
		
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		sort(0,arr.length);
		
		
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		
	}
	
	
	private static void sort(int start, int end) {
		if(start == end)
			return;
		
		int mid = (start+end)/2;
		sort(start,mid);
		sort(mid+1,end);
		
		merge(start,end);
		
	}
	
	private static void merge(int start, int end) {
		int[] tempArr = new int[end-start+1];
		int mid = (start+end)/2;
		int i = start;
		int j = mid+1;
		int k=0;
		
		while(i<=mid && j<end) {
			if(arr[i] < arr[j])
				tempArr[k++] = arr[j++];
			else
				tempArr[k++] = arr[i++];
		}
		
		while(i<=mid)
			tempArr[k++] = arr[i++];
		while(j<end)
			tempArr[k++] = arr[j++];
		
		for(i=start; i<end; i++) {
			arr[i] = tempArr[i-start];
		}		
	}
	
}
