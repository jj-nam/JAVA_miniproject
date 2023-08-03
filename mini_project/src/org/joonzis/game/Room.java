package org.joonzis.game;

import java.util.Random;
import java.util.Scanner;

class NoLargeNum extends Exception {
	public NoLargeNum(String msg) {
		super(msg);
	}
}

public class Room {
	Scanner sc = new Scanner(System.in);
	String[] room = { "강의실", "화장실", "테라스", "데스크", "1층 카페" };
	Random ran = new Random();

	void start() {
		try {
			System.out.println("나 : 나는 코딩 쪽으로 미래를 꿈꾸며 구트 아카데미에 왔다.");
			Thread.sleep(1500);
			System.out.println("나 : 하지만 한달 정도 다닌 지금....");
			Thread.sleep(1500);
			System.out.println("나 : 이상함을 느껴 탈출하기로 하였다.");
			System.out.println();
			Thread.sleep(1500);
		} catch (Exception e) {
		}
		time();
	}

	void return_time() {
		try {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("ㅣ     ===     ==       ==     ==    ===          ===      ===   ㅣ");
			System.out.println("ㅣ    == ==    ===     ===   ====   == ==   ==   == ==    == ==  ㅣ");
			System.out.println("ㅣ   ==   ==   == == == ==     ==  ==   ==      ==   ==  ==   == ㅣ");
			System.out.println("ㅣ  =========  ==  ===  ==     ==   == ==   ==   == ==    == ==  ㅣ");
			System.out.println("ㅣ ==       == ==       ==     ==    ===          ===      ===   ㅣ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println();
			Thread.sleep(1000);
			for (int i = 0; i < 15; i++) {
				Thread.sleep(200);
				System.out.print("?");
			}
			System.out.println();
			System.out.println("나 : 이상하다. 왜 다시 10시지?");
			System.out.println();
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		studyroom();
	}

	void time() {
		try {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("ㅣ     ===     ==       ==     ==    ===          ===      ===   ㅣ");
			System.out.println("ㅣ    == ==    ===     ===   ====   == ==   ==   == ==    == ==  ㅣ");
			System.out.println("ㅣ   ==   ==   == == == ==     ==  ==   ==      ==   ==  ==   == ㅣ");
			System.out.println("ㅣ  =========  ==  ===  ==     ==   == ==   ==   == ==    == ==  ㅣ");
			System.out.println("ㅣ ==       == ==       ==     ==    ===          ===      ===   ㅣ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println();
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		studyroom();
	}

	void studyroom() {
		try {
			System.out.println("   ▦▦▦▦▦▦▦▦▦▦▦▦");
			System.out.println("   ▦     강의실    ▦ ");
			System.out.println("   ▦▦▦▦▦▦▦▦▦▦▦▦");
			System.out.println();
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		while (true) {
			try {
				System.out.println("(1) 노는게 제일 좋은 뽀로로 강사님");
				Thread.sleep(1500);
				System.out.println("(2) 300분이면 충분한 스파르타 강사님");
				int te = sc.nextInt();
				if (te == 1) {
					Thread.sleep(1500);
					pororo();
				} else if (te == 2) {
					Thread.sleep(1500);
					sparta();
				} else {
					throw new NoLargeNum("잘못 입력하셨습니다.");
				}
			} catch (NoLargeNum e) {
				System.err.println(e.getMessage());
				System.out.println();
			} catch (Exception e) {
				System.err.println("잘못 입력하셨습니다.");
				System.out.println();
				sc.next();
			}
		}
	}

	void pororo() {
		try {
			System.out.println("  ★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("    야생의 뽀로로 강사님이 나타났다");
			System.out.println("  ★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println();
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		while (true) {
			try {
				System.out.println("뽀로로 강사님: 날도 좋은데 공부하지 말고");
				Thread.sleep(1500);
				System.out.println("뽀로로 강사님: 테라스로 나가서 아이스크림이나 먹으면서 놀까요?(y/n)");
				Thread.sleep(1500);
				System.out.println("(Y): 네 좋아요");
				Thread.sleep(1000);
				System.out.println("(N): 하겐다즈 아니면 안먹을래요.");
				String yorn = sc.next();
				if (yorn.equalsIgnoreCase("y")) {
					System.out.println("    나    : (공짜 개꿀) 네 좋아요.");
					System.out.println();
					terrace();
				} else if (yorn.equalsIgnoreCase("n")) {
					System.out.println("    나    : 하겐다즈 아니면 안먹을래요.");
					Thread.sleep(1500);
					System.out.println("뽀로로 강사님: 그럼 수업 하죠!");
					Thread.sleep(1500);
					System.out.println("뽀로로 강사님: 오늘은 추상 클래스에 대해 %@#^$#@&!");
					Thread.sleep(1500);
					System.err.println("(째려보는 시선에 찔려)");
					Thread.sleep(1500);
					die();
				} else {
					throw new NoLargeNum("잘못 입력하셨습니다.");
				}
			} catch (NoLargeNum e) {
				System.err.println(e.getMessage());
				System.out.println();
			} catch (Exception e) {
				System.err.println("잘못 입력했습니다");
				System.out.println();
				sc.next();
			}
		}

	}

	void sparta() {
		try {
			System.out.println("  ★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("   개빡쌘 스파르타 강사님이 나타났다");
			System.out.println("  ★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println();
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		try {
			System.out.println("스파르타 강사 : 자! 오늘이랑 내일 이틀 동안에 DB를 끝낼 예정이니까");
			Thread.sleep(1500);
			System.out.println("스파르타 강사 : 빠짝 집중하고 쫓아 오세요.");
			System.out.println();
			Thread.sleep(1500);
			for (int i = 0; i < 13; i++) {
				Thread.sleep(200);
				if (i < 2) {
					System.out.print(" ");
				} else if (i == 2) {
					System.out.print("공");
				} else if (i == 4) {
					System.out.print("부");
				} else if (i == 6) {
					System.out.print("하");
				} else if (i == 8) {
					System.out.print("기");
				} else if (i == 10) {
					System.out.print("싫");
				} else if (i == 12) {
					System.out.print("어");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
			System.out.println();

			Thread.sleep(1500);
			System.out.println("  나  : 차라리 그냥 죽여줘...");
			System.out.println();
			Thread.sleep(1500);
		} catch (InterruptedException e) {
		}
		die();
	}

	void run() {
		while (true) {
			try {
				menu();
				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					studyroom();
				case 2:
					terrace();
				case 3:
					desk();
				default:
					throw new NoLargeNum("잘못 입력했습니다.");
				}
			} catch (NoLargeNum e) {
				System.err.println(e.getMessage());
				System.out.println();
			} catch (Exception e) {
				System.err.println("잘못 입력했습니다.");
				System.out.println();
				sc.next();
			}
		}
	}

	void menu() {
		System.out.println("어디로 이동하시겠습니까");
		System.out.println("1. 강의실");
		System.out.println("2. 테라스");
		System.out.println("3. 데스크");
	}

	void gang() {
		try {
			Thread.sleep(2000);
			System.out.println("  ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("    의심 0% 깡패 원장님이 나타났다");
			System.out.println("  ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println();
		} catch (Exception e) {
		}
		while (true) {
			try {
				System.out.println("원장님 : 돈 좀 있으면 줘봐 (y/n)");
				Thread.sleep(1500);
				System.out.println("(Y) : (어휴.. 쳐맞기 전에 드려야지)");
				Thread.sleep(1500);
				System.out.println("(N) : (뭐라는거야.. 있어도 안주지)");
				String yorn1 = sc.next();
				if (yorn1.equalsIgnoreCase("y")) {
					System.out.println("  나  : 얼마나 필요하세요?");
					Thread.sleep(1500);
					System.out.println("원장님 : 다!");
					Thread.sleep(1500);
					System.out.println("(돈 뺐는 원장이라니..)");
					Thread.sleep(1500);
					System.out.println("(역시 여긴 이상해.. 런 쳐야겠어)");
					Thread.sleep(1500);
					System.out.println();
					run();
				} else if (yorn1.equalsIgnoreCase("n")) {
					System.out.println("  나  : 돈이요? 있어도 못드려요. 깡패도 아니구");
					Thread.sleep(1500);
					System.out.println("원장님 : 뭐?  깡패?!");
					for (int i = 0; i < 12; i++) {
						Thread.sleep(200);
						if (i % 3 == 0) {
							System.out.print("퍼벅!");
						} else {
							System.out.print("퍽!!");
						}
					}
					System.out.println();
					Thread.sleep(2000);
					die();
				} else {
					throw new NoLargeNum("잘못 입력했습니다.");
				}
			} catch (NoLargeNum e) {
				System.err.println(e.getMessage());
				System.out.println();
			} catch (Exception e) {
				System.err.println("잘못 입력하셨습니다.");
				System.out.println();
				sc.next();
			}
		}
	}

	void terrace() {
		try {
			Thread.sleep(1000);
			System.out.println("  ******* 이동중 *******");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("  ******* 이동중 *******");
			System.out.println();
			Thread.sleep(2000);
			System.out.println("    ▦▦▦▦▦▦▦▦▦▦▦▦");
			System.out.println("    ▦     테라스    ▦");
			System.out.println("    ▦▦▦▦▦▦▦▦▦▦▦▦");
			System.out.println();
			Thread.sleep(2000);
			System.out.println("수강생들  : (와글와글)");
			Thread.sleep(1500);
			System.out.println("수강생 1 : 어?! 저 거기 누가 오는데?");
			System.out.println();
			Thread.sleep(1500);
		} catch (InterruptedException e) {
		}
		while (true) {
			try {
				System.out.println("(1) 깡패 아니다 원장님");
				Thread.sleep(1500);
				System.out.println("(2) 도망친다");
				int oort = sc.nextInt();
				if (oort == 1) {
					gang();
				} else if (oort == 2) {
					System.out.println("어디로 이동하시겠습니까?");
					run();
				} else {
					throw new NoLargeNum("잘못 입력했습니다.");
				}
			} catch (NoLargeNum e) {
				System.err.println(e.getMessage());
				System.out.println();
			} catch (Exception e) {
				System.err.println("잘못 입력했습니다.");
				System.out.println();
				sc.next();
			}
		}
	}

	void bathroom() {
		try {
			Thread.sleep(1000);
			System.out.println("  ******* 이동중 *******");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("  ******* 이동중 *******");
			System.out.println();
			Thread.sleep(2000);
			System.out.println("  ▦▦▦▦▦▦▦▦▦▦▦▦");
			System.out.println("  ▦     화장실    ▦");
			System.out.println("  ▦▦▦▦▦▦▦▦▦▦▦▦");
			System.out.println();
			Thread.sleep(2000);
			System.out.println("나 : 아니 개발놈은 런(run)치라면서 왜 선택지가 이따구지.. 또라이인가");
			Thread.sleep(1500);
			System.out.println("나 : 선택지가 왜 이따구지.. 또라이인가");
			Thread.sleep(1500);
			System.out.println("개발자가 상심이 커 죽임");
			System.out.println();
			Thread.sleep(1500);
			die();
		} catch (InterruptedException e) {
		}
	}

	void desk() {
		try {
			Thread.sleep(1000);
			System.out.println("  ******* 이동중 *******");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("  ******* 이동중 *******");
			System.out.println();
			Thread.sleep(2000);
			System.out.println("  ▦▦▦▦▦▦▦▦▦▦▦▦");
			System.out.println("  ▦     데스크    ▦");
			System.out.println("  ▦▦▦▦▦▦▦▦▦▦▦▦");
			System.out.println();
			Thread.sleep(2000);
			System.out.println(" ★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("  주먹왕 가위손 직원님이 나타났다");
			System.out.println(" ★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println();
			Thread.sleep(1500);
			System.out.println("직원 : 어디가세요?");
			System.out.println();
			Thread.sleep(1500);
		} catch (InterruptedException e) {

		}
		while (true) {
			try {
				System.out.println("(1) 화장실");
				Thread.sleep(1500);
				System.out.println("(2) 카페");
				int gowhere = sc.nextInt();
				if (gowhere == 1) {
					System.out.println(" 나 : 화장실 좀 다녀오려고요.");
					Thread.sleep(1500);
					System.out.println("직원 : 네, 다녀오세요.");
					System.out.println();
					bathroom();
				} else if (gowhere == 2) {
					rsp_game();
				} else {
					throw new NoLargeNum("잘못 입력했습니다.");
				}
			} catch (NoLargeNum e) {
				System.err.println(e.getMessage());
				System.out.println();
			} catch (Exception e) {
				System.err.println("잘못 입력했습니다.");
				System.out.println();
				sc.next();
			}
		}
	}

	void rsp_game() {
		try {
			System.out.println(" 나 : 너무 피곤해서 카페 좀 다녀오려고요.");
			Thread.sleep(1500);
			System.out.println("직원 : 쉬는 시간에 다녀오시지..");
			Thread.sleep(1500);
			System.out.println("직원 : 가위바위보 해서 3번 안에 이기면 보내드릴게요");
			Thread.sleep(1500);
			for (int i = 0; i < 15; i++) {
				Thread.sleep(100);
				System.out.print("?");
			}
			System.out.println();
			System.out.println(" 나 : (니가 뭔데)");
			Thread.sleep(1500);
		} catch (InterruptedException e) {
		}
		while (true) {
			try {
				System.out.println("가위바위보를 하시겠습니까? (y/n)");
				String rsp = sc.next();
				if (rsp.equalsIgnoreCase("y")) {
					System.out.println(" 나 : 덤벼보시죠!");
					Thread.sleep(1500);
					play_rsp_game();
				} else if (rsp.equalsIgnoreCase("n")) {
					System.out.println(" 나 : (뭐래) 재미없어요. 그냥 다녀올게요.");
					Thread.sleep(1500);
					System.out.println("직원 : 안해요? ㅂㅂ");
					Thread.sleep(1500);
					System.err.println(" 직원의 권한으로 게임을 종료 시킵니다. ");
					Thread.sleep(1500);
					die();
				} else {
					throw new NoLargeNum("잘못 입력하셨습니다.");
				}
			} catch (NoLargeNum e) {
				System.err.println(e.getMessage());
				System.out.println();
			} catch (Exception e) {
				System.err.println("잘못 입력하셨습니다.");
				System.out.println();
				sc.next();
			}
		}
	}

	void play_rsp_game() {
		int count = 0;
		System.out.println("RULE:" + "\t1-가위\n" + "\t2-바위\n" + "\t3-보\n");
		while (true) {
			try {
				System.out.print("가~이~ 바~이~ >> ");
				int player = sc.nextInt();
				int com = ran.nextInt(3) + 1;
				String pStr = "";
				String cStr = "";
				
				if (player == 1) {
					pStr = cStr = "가위";
				} else if (player == 2) {
					pStr = cStr = "바위";
				} else if (player == 3) {
					pStr = cStr = "보";
				} else {
					throw new Exception();
				}

				System.out.println("나 >> " + pStr + " : 상대 >> " + cStr);
				System.out.println();
				int result = player - com;
				if (result == 1 || result == -2) {
					System.out.println(" 나 : 이겼네요. 다녀올게요");
					System.out.println();
					cafe();
				} else if (result == 2 || result == -1) {
					System.out.println("직원 : 제가 이겼네요. 자리로 돌아가세요.");
					Thread.sleep(2000);
					System.out.println();
					return_time();
				} else if (result == 0) {
					System.out.println("비겼습니다.");
					System.out.println();
					Thread.sleep(1500);
					count++;
					if (count == 3) {
						System.out.println("직원 : 3번 안에 못 이기셨으니까 안돼요. 자리로 돌아가세요");
						Thread.sleep(2000);
						System.out.println();
						return_time();
					}
				}
			} catch (Exception e) {
				System.err.println("잘못 입력하셨습니다.(Only 1~3)");
				System.out.println();
				sc.next();
			}
		}
	}

	void cafe() {
		try {
			Thread.sleep(1000);
			System.out.println("  ******* 이동중 *******");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("  ******* 이동중 *******");
			System.out.println();
			Thread.sleep(2000);
			System.out.println("  ▦▦▦▦▦▦▦▦▦▦▦▦");
			System.out.println("  ▦     Cafe    ▦");
			System.out.println("  ▦▦▦▦▦▦▦▦▦▦▦▦");
			Thread.sleep(2000);
			System.out.println();
			System.out.println("  ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("   커피는 맥심 카페 직원님이 나타났다");
			System.out.println("  ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println();
			Thread.sleep(1500);
			System.out.println("카페 직원 : 어서오세요. 주문하시겠어요?");
			Thread.sleep(1500);
			System.out.println("   나   : 아이스 아메리카노 하나 주세요.");
			Thread.sleep(1500);
			System.out.println("카페 직원 : 저희가 오픈 이벤트로 게임을 하는데 이기시면 무료로 드려요.");
			Thread.sleep(1500);
		} catch (Exception e) {
		}
		while (true) {
			try {
				System.out.println("카페 직원 : 하시겠어요? (y/n)");
				String playyn = sc.next();
				if (playyn.equalsIgnoreCase("y")) {
					System.out.println("   나   : 네 할게요. 혹시 음료 변경 해도 되나요?");
					Thread.sleep(1500);
					System.out.println("카페 직원 : (거지새끼인가) 거...거럼요. 가능하죠.");
					Thread.sleep(1500);
					System.out.println("카페 직원 : 제로 게임인데 기회는 10번! 맞추실때마다 1명씩 줄어들고 4명에서 1명으로 만드시면 됩니다.");
					System.out.println("카페 직원 : 쉽죠? 이해 되셨다면 시작할게요. 참고로 실수로 잘못 불러도 횟수는 차감이에요");
					Thread.sleep(1500);
					zero_game();
				} else if (playyn.equalsIgnoreCase("n")) {
					System.out.println("   나   : 아니요. 바빠서요. 그냥 주세요.");
					Thread.sleep(1500);
					System.out.println("  --a few minutes later--");
					Thread.sleep(1500);
					System.out.println("카페 직원 : 주문하신 음료 나왔습니다.");
					Thread.sleep(1500);
					System.out.println("(튀는 상황에서 여유롭게 음료라니)");
					Thread.sleep(1500);
					System.out.println("음료를 챙겨서 성공적으로 런친다.");
					Thread.sleep(1500);
					escape();
				} else {
					throw new NoLargeNum("잘못 입력했습니다.");
				}
			} catch (NoLargeNum e) {
				System.err.println(e.getMessage());
				System.out.println();
			} catch (Exception e) {
				System.err.println("잘못 입력했습니다");
				System.out.println();
				sc.next();
			}
		}
	}

	void zero_game() {
		int count1 = 0;
		int playerNum = 4;
		while (true) {
			try {
				++count1;
				if (count1 >= 11) {
					break;
				} else {
					Thread.sleep(1000);
					System.out.println();
					System.out.println(count1 + "번째 도전");
					System.out.print("하나 둘  >> ");
					int num = sc.nextInt();
					if (num > playerNum) {
						throw new NoLargeNum("참가 인원보다 큰 숫자는 입력할 수 없습니다.");
					} else {
						int computer = ran.nextInt(playerNum + 1);
						System.out.println("일어난 수 >> " + computer);
						System.out.println("-------------");
						System.out.println();
						Thread.sleep(1000);

						if (num == computer) {
							System.out.println("맞췄습니다!");
							playerNum -= 1;
							System.out.println("(남은 인원 : " + playerNum + ")");
							Thread.sleep(1500);

							if (playerNum == 1) {
								System.out.println("----------");
								System.out.println("축하합니다!");
								System.out.println();
								Thread.sleep(1000);
								break;
							}
						} else {
							System.out.println("틀렸습니다.");
							System.out.println("(남은 인원 : " + playerNum + ")");
						}
					}
				}
			} catch (NoLargeNum e) {
				System.err.println(e.getMessage());
				System.out.println();
			} catch (Exception e) {
				System.err.println("잘못 입력하셨습니다.");
				System.out.println();
				sc.next();
			}
		}
		try {
			System.out.println("카페 직원 : 주문하신 음료 나왔습니다.");
			Thread.sleep(1500);
			System.out.println("(음료는 받는 중 뒤에서 누가 어깨를 툭툭 친다)");
			Thread.sleep(1500);
			System.out.println("강사&원장 : 잡았다 요놈");
			Thread.sleep(1500);
			for (int i = 0; i < 20; i++) {
				Thread.sleep(50);
				System.out.print("!");
			}
			System.out.println();
			Thread.sleep(1500);
			System.out.println();
		} catch (Exception e) {
		}
		die();
	}

	void exit() {
		System.err.println("<< GAME OVER >>");
		System.err.println("(추가 루트 희망)");
		System.err.println("'gitah0629@gmail.com'으로 보내주세요.");
		sc.close();
		System.exit(0);
	}

	void die() {
		System.err.println("ㅡㅡ      ㅡㅡ   ㅡㅡㅡ      ㅡㅡ    ㅡㅡ       ㅡㅡㅡㅡ        ㅡㅡㅡㅡㅡㅡ   ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.err.println(" ㅡㅡ    ㅡㅡ  ㅡㅡ   ㅡㅡ	ㅡㅡ    ㅡㅡ       ㅡㅡ  ㅡㅡ      ㅡㅡㅡㅡㅡㅡ   ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.err.println("  ㅡㅡ  ㅡㅡ  ㅡㅡ     ㅡㅡ	ㅡㅡ    ㅡㅡ       ㅡㅡ   ㅡㅡ       ㅡㅡ      ㅡㅡ");
		System.err.println("    ㅡㅡ    ㅡㅡ      ㅡㅡ  ㅡㅡ    ㅡㅡ       ㅡㅡ    ㅡㅡ      ㅡㅡ      ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.err.println("    ㅡㅡ    ㅡㅡ      ㅡㅡ  ㅡㅡ    ㅡㅡ   	ㅡㅡ    ㅡㅡ      ㅡㅡ      ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.err.println("    ㅡㅡ     ㅡㅡ    ㅡㅡ   ㅡㅡ    ㅡㅡ     	ㅡㅡ   ㅡㅡ       ㅡㅡ      ㅡㅡ");
		System.err.println("    ㅡㅡ      ㅡㅡ  ㅡㅡ    ㅡㅡ    ㅡㅡ       ㅡㅡ  ㅡㅡ     ㅡㅡㅡㅡㅡㅡ   ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.err.println("    ㅡㅡ        ㅡㅡㅡ       ㅡㅡㅡㅡ         ㅡㅡㅡㅡ       ㅡㅡㅡㅡㅡㅡ   ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.err.println();
		try {
			Thread.sleep(1000);
			System.out.println("다시 하시겠습니까? (Y/N)");
			String con = sc.next();
			if(con.equalsIgnoreCase("y")) {
				start();
			}else if(con.equalsIgnoreCase("n")) {
				exit();
			}else{
				throw new NoLargeNum("잘못 입력하셨습니다.");
			}
			} catch (NoLargeNum e) {
				System.err.println(e.getMessage());
				System.out.println();
			} catch (Exception e) {
				System.err.println("잘못 입력했습니다");
				System.out.println();
				sc.next();
		}
	}

	void escape() {
		System.out.print("      ");
		try {
			String str = "CONGRATULATION";
			char[] arr = str.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				Thread.sleep(70);
				System.out.print(arr[i]);
			}
//			for(int i = 0; i<15; i++) {
//				Thread.sleep(70);
//				if(i==0) {
//					System.out.print("C");
//				}else if(i==1 || i==12) {
//					System.out.print("O");
//				}else if(i==2 || i==13) {
//					System.out.print("N");
//				}else if(i==3) {
//					System.out.print("G");
//				}else if(i==4) {
//					System.out.print("R");
//				}else if(i==5 || i==9) {
//					System.out.print("A");
//				}else if(i==6 || i==10) {
//					System.out.print("T");
//				}else if(i==7) {
//					System.out.print("U");
//				}else if(i==8) {
//					System.out.print("L");
//				}else if(i==11) {
//					System.out.print("I");
//				}
//			}
		} catch (Exception e) {
		}
		System.out.println();
		System.out.println("◁◀◁◀ 탈출에 성공하였습니다 ▶▷▶▷");
		sc.close();
		System.exit(0);
	}

}