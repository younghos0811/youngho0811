package BackJun;


import java.util.Scanner;

public class Dongjeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int result = sc.nextInt();
		int[] arr = new int[cnt];
		int solution = 0;
		
		for(int i=0; i<cnt; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int currentIndex=cnt-1;
		while(result != 0) {
			int thisNum = arr[currentIndex];
			
			if(result < thisNum) {
				currentIndex --;
			}
			else {
				solution += result/thisNum;
				result %= thisNum;
			}
		}
		

		System.out.println(solution);
		
		
	}

}
