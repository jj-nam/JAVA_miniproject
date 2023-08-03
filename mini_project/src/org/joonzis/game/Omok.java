package org.joonzis.game;

import java.util.Scanner;

public class Omok {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***********");
		System.out.println("    오목    ");
		System.out.println("***********");
		
		int arr[][] = new int[5][5];
		
		for(int i=0; i<5; i++) {
			System.out.println();
			for(int j=0; j<5; j++) {
					System.out.print("ㅁ ");
				}
			}
		
		while(true) {
			System.out.println();
			System.out.print("플레이어 1 (행) >> ");
			int player11 = sc.nextInt();
			System.out.print("플레이어 1 (열) >> ");
			int player12 = sc.nextInt();
			
			int p1 = 1;
			arr[player11][player12] = p1;
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(arr[i][j] == p1) {
						System.out.print("O ");
					}else if(arr[i][j] == 0) {
						System.out.print("ㅁ ");
					}else {
						System.out.print("X ");
					}
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.print("플레이어 2 (행) >> ");
			int player21 = sc.nextInt();
			System.out.print("플레이어 2 (열) >> ");
			int player22 = sc.nextInt();
			
			int p2 = 2;
			arr[player21][player22] = p2;
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(arr[i][j] == p2) {
						System.out.print("X ");
					}else if(arr[i][j] == p1){
						System.out.print("O ");
					}else if(arr[i][j] == 0) {
						System.out.print("ㅁ ");
					}
				}
				System.out.println();
			}
		}
	}
}
