package org.joonzis.game;

import java.util.Random;
import java.util.Scanner;

public class Zero {
	public static void main(String[] args) {
		System.out.println("***********");
		System.out.println("  제로 게임   ");
		System.out.println("***********");
		System.out.print("참가 인원 >> ");
		Scanner sc = new Scanner(System.in);		// 참가 인원
		
		
		Random ran = new Random();
		int count1 = 0;
		int playerNum = 5;
		while(true) {
			++count1;
			if(count1==11) {
				break;
			}else {
				System.out.println(count1 + "번째 도전");
				System.out.print("하나 둘 >> ");
				int num = sc.nextInt();
				if(num > playerNum) {
					System.out.println("참가 인원보다 큰 숫자는 입력할 수 없습니다.");
					System.out.println("-------------");
				}else {
					int computer = ran.nextInt(playerNum+1);
					System.out.println("일어난 수 >> " + computer);
					System.out.println("남은 사람 수 >> " + playerNum);
					System.out.println("-------------");
					
					if(num==computer) {
						System.out.println("맞췄다!");
						playerNum -= 1;
						if(playerNum==1) {
							System.out.println("----------");
							System.out.println("축하합니다!");
							break;
						}
					}else {
						System.out.println("틀렸습니다.");
						System.out.println();
					}
				}
			}
		}
		
		
	}
}
