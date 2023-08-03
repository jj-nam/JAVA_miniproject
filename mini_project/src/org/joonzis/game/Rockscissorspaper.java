package org.joonzis.game;

import java.util.Random;
import java.util.Scanner;

public class Rockscissorspaper {
	public static void main(String[] args) {
		System.out.println("*************");
		System.out.println("  가위 바위 보  ");
		System.out.println("*************");
		int count = 0;
		System.out.println("RULE:" + "\t1-가위\n" + "\t2-바위\n" + "\t3-보\n" + "\t4-종료");
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		while(true) {
			try {
				System.out.print("가위 바위 >> ");
				int player = sc.nextInt();
				int com = ran.nextInt(3)+1; 
				if(player == 1) {
					System.out.println("가위");
				}else if(player == 2) {
					System.out.println("바위");
				}else if(player == 3) {
					System.out.println("보");
				}else if(player == 4) {
					System.out.println("종료합니다.");
					break;
				}else {
					throw new Exception();
				}
				
				System.out.println("나 >> " + player + "\t상대 >> " + com);
				
				int result = player - com;
				if(result == 1 || result == -2) {
					System.out.println("이겼다.");
					System.out.println("----------");
					break;
				}else if(result == 2 || result ==-1) {
					System.out.println("졌다.");
					System.out.println("----------");
					break;
				}else if(result == 0) {
					System.out.println("비겼다.");
					System.out.println("----------");
					count++;
					if(count==3) {
						break;
					}
				}
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다.(Only 1~4)");
				sc.next();
			}
		}
		
	}
}
