package BackJun.Grid1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MeetingRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		Pair[] arr = new Pair[length];
		PriorityQueue<Pair> que = new PriorityQueue<Pair>();
		int cnt = 0;
		int lastNum = 0;
		
		for(int i=0; i<length; i++) {
			Pair p = new Pair();
			p.x = sc.nextInt();
			p.y = sc.nextInt();
			que.add(p);
		}
		
		while(!que.isEmpty()) {
			Pair p = que.poll();
			if(lastNum <= p.x) {
				cnt++;
				lastNum = p.y;
			}
		}
		
		System.out.println(cnt);
		
	}

}

class Pair implements Comparable<Pair> {
	int x = 0;
	int y = 0;
	
	@Override
	public int compareTo(Pair p) {
		// TODO Auto-generated method stub
		
		if(this.y == p.y) 
			return this.x - p.x;
		else
			return this.y -p.y;
	}
	
	
}




