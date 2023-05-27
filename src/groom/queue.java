package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.*;

public class queue {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i < N; i++) {
			String inp = br.readLine();
			StringTokenizer st2 = new StringTokenizer(inp);
			String com = st2.nextToken();
			if (com.equals("push")) {
				if(queue.size() == K){
					System.out.println("Overflow");
				}
				else{
					queue.offer(Integer.parseInt(st2.nextToken()));
				}

			} else {
				if (!queue.isEmpty()) {
					System.out.println(queue.poll());
				} else {
					System.out.println("Underflow");
				}
			}
		}


	}
	}
