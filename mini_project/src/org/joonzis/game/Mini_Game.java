package org.joonzis.game;

import java.util.Random;
import java.util.Scanner;

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}
public class Mini_Game {
	public static void main(String[] args) {
		System.out.println("--------------------");
		System.out.println("      미니 게임      ");
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 제로 게임");
		System.out.println("2. 가위 바위 보");
		System.out.println("3. 오목");
		System.out.println("플레이 할 게임 >> ");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("***********");
			System.out.println("  제로 게임   ");
			System.out.println("***********");
			System.out.print("참가 인원 >> ");
			int playerNum = sc.nextInt();
			
			Random ran = new Random();
			
			while(true) {
				System.out.print("하나 둘 >> ");
				int num = sc.nextInt();
				if(num > playerNum) {
					System.out.println("참가 인원보다 큰 숫자는 입력할 수 없습니다.");
					System.out.println("-------------");
				}else {
					int computer = ran.nextInt(playerNum+1);
					System.out.println("일어난 수 >> " + computer);
					System.out.println("-------------");
				
					if(num==computer) {
						System.out.println("맞췄다!");
						playerNum -= 1;
						if(playerNum==1) {
							System.out.println("----------");
							System.out.println("졌다!");
							break;
						}
					}
				}
			}
		}else if(choice == 2) {
			System.out.println("*************");
			System.out.println("  가위 바위 보  ");
			System.out.println("*************");
			
			System.out.println("RULE:" + "\t1-가위\n" + "\t2-바위\n" + "\t3-보\n" + "\t4-종료");
			
			Random ran = new Random();
			
			while(true) {
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
					System.out.println("잘못 입력하셨습니다.(Only 1~4)");
				}
				
				System.out.println("나 >> " + player + "\t상대 >> " + com);
				
				int result = player - com;
				if(result == 1 || result == -2) {
					System.out.println("이겼다.");
					System.out.println("----------");
				}else if(result == 2 || result ==-1) {
					System.out.println("졌다.");
					System.out.println("----------");
				}else if(result == 0) {
					System.out.println("비겼다.");
					System.out.println("----------");
				}
			}
		}else if(choice == 3) {
			System.out.println("***********");
			System.out.println("    오목    ");
			System.out.println("***********");
			
			int arr[][] = new int[20][20];
		
		for(int i=0; i<20; i++) {
			System.out.println();
			for(int j=0; j<20; j++) {
				System.out.print("ㅁ ");
			}
		}
		
		while(true) {
			try {
				System.out.println();
				System.out.print("플레이어 1 (행) >> ");
				int player11 = sc.nextInt();
				System.out.print("플레이어 1 (열) >> ");
				int player12 = sc.nextInt();
				
				int p1 = 1;
				arr[player11-1][player12-1] = p1;
				
				for(int i=0; i<20; i++) {
					for(int j=0; j<20; j++) {
						if(arr[i][j] == p1) {
							System.out.print("● ");
						}else if(arr[i][j] == 0) {
							System.out.print("□ ");
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
				arr[player21-1][player22-1] = p2;
				
				for(int i=0; i<20; i++) {
					for(int j=0; j<20; j++) {
						if(arr[i][j] == p2) {
							System.out.print("X ");
						}else if(arr[i][j] == p1){
							System.out.print("● ");
						}else if(arr[i][j] == 0) {
							System.out.print("□ ");
						}
					}
					System.out.println();
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("오목판 범위를 벗어났습니다.");
			}
		}
	}
}
}