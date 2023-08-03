package org.joonzis.game;

import java.util.Random;
import java.util.Scanner;

public class practice {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	void exit() {
		System.out.println("<<게임을 종료합니다>>");
		sc.close();
		System.exit(0);
	}
	
	void zero_game() {
		int count1 = 0;
		int playerNum = 5;
		while(true) {
			try {
				++count1;
				if(count1==11) {
					break;
				}else {
					System.out.println(count1 + "번째 도전");
					System.out.print("하나 둘 >> ");
					int num = sc.nextInt();
					if(num > playerNum) {
						System.out.println("참가 인원보다 큰 숫자는 입력할 수 없습니다.");
//						throw new Exception();
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
				System.out.println("카페 직원 : 주문하신 음료 나왔습니다.");
				Thread.sleep(1000);
				System.out.println("(음료는 받는 중 뒤에서 누가 어깨를 툭툭 친다)");
				System.out.println("강사 & 원장 : 잡았다 요놈");
				exit();
			} catch (Exception e) {
				e.printStackTrace();
//				System.out.println("잘못 입력하셨습니다.");
//				sc.next();
			}
				
		}
			
	}
	
	void cafe() {
		
		try {
			Thread.sleep(1000);
			System.out.println("******* 이동중 *******");
			Thread.sleep(1000);
			System.out.println("******* 이동중 *******");
			Thread.sleep(500);
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("커피는 MAXIM 카페 직원님이 나타났다.");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("카페 직원 : 어서오세요. 주문하시겠어요?");
			Thread.sleep(500);
			System.out.println("나 : 아이스 아메리카노 하나 주세요.");
			Thread.sleep(500);
		} catch (Exception e) {
		}
			while(true) {
				try {
					System.out.println("카페 직원 : 저희가 오픈 이벤트로 게임을 하는데 이기시면 무료로 드려요. 하시겠어요? (y/n)");
					String playyn = sc.next();
					if(playyn.equalsIgnoreCase("y")) {
						System.out.println("나 : 네 할게요. 혹시 음료 변경 해도 되나요?");
						Thread.sleep(500);
						System.out.println("카페 직원 : (거지새끼인가) 거...거럼요. 가능하죠.");
						Thread.sleep(500);
						System.out.println("카페 직원 : 제로 게임인데 기회는 10번! 맞추실때마다 1명씩 줄어들고 5명에서 1명으로 만드시면 됩니다.");
						System.out.println("카페 직원 : 쉽죠? 이해 되셨다면 시작할게요. 참고로 실수로 잘못 불러도 횟수는 차감이에요");
						Thread.sleep(1500);
						zero_game();
					}else if(playyn.equalsIgnoreCase("n")) {
						System.out.println("나 : 아니요. 바빠서요. 그냥 주세요.");
						Thread.sleep(1000);
						System.out.println("--a few minutes later--");
						Thread.sleep(1000);
						System.out.println("카페 직원 : 주문하신 음료 나왔습니다.");
						Thread.sleep(1000);
						System.out.println("음료를 챙겨서 성공적으로 런친다.");
						System.out.println("(튀는 상황에서 음료라니 여유롭네)");
						exit();
					}
				} catch (Exception e) {
					System.out.println("잘못 입력했습니다");
					sc.next();
				}
			}
	}
	public static void main(String[] args) {
		Room game = new Room();
		game.cafe();
	}
}
