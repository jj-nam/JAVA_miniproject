package org.joonzis.game;

import java.util.Random;
import java.util.Scanner;

class Gugudan {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random(10);
	int a;
	int b;
	int systemAnser;
	int userAnser;
	
	public Gugudan() {
	}
	
	void run() {
		while (true) {
			System.out.println(
					"======================================================="
					+ "\r\n"
					+ " _____          _____         ______               \r\n"
					+ "|  __ \\        |  __ \\        |  _  \\              \r\n"
					+ "| |  \\/ _   _  | |  \\/ _   _  | | | |  __ _  _ __  \r\n"
					+ "| | __ | | | | | | __ | | | | | | | | / _` || '_ \\ \r\n"
					+ "| |_\\ \\| |_| | | |_\\ \\| |_| | | |/ / | (_| || | | |\r\n"
					+ " \\____/ \\__,_|  \\____/ \\__,_| |___/   \\__,_||_| |_|\r\n"
					+ "                                                   \r\n"
					+ "                                                   \r\n"
					+ "" +
					"=======================================================");
			System.out.println();
			System.out.print("게임을 시작하겠습니까? (yes / no) : ");
			String choice = sc.next();
			
			switch (choice) {
			case "yes" : start();
				break;
			case "no" : System.out.println("하지마 그럼");
						sc.close();
						System.exit(0);
				break;
			default : System.out.println("다시 입력하세요.");
			}
		}
	}
	
	void start() {
		System.out.println("----------------------------------------");
		System.out.println("구구단 게임 start!");
		System.out.println("스코어가 100점 또는 -100점이 되면 종료됩니다.");
		System.out.println("----------------------------------------");
		
			
		for (int score = 0; score < 100 && score > -100; score = score) {
			a = ran.nextInt(9)+1;
			b = ran.nextInt(9)+1;
			systemAnser = a * b;
			try {
				Thread.sleep(500);
				System.out.println("· · · · ·");
				Thread.sleep(500);
				System.out.println("· · · · ·");
				Thread.sleep(500);
				System.out.print("Quiz. " + a + " X " + b + " = ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			userAnser = sc.nextInt();
			
			if (systemAnser == userAnser) {
				System.out.println("------------------------------");
				System.out.println("정답! +10점!");
				score += 10;
				System.out.println("현재 스코어 : " + score);
				System.out.println("------------------------------");
			}else {
				System.out.println("------------------------------");
				System.out.println("ㅋㅋㅋ개멍청하네 -10점!");
				score -= 10;
				System.out.println("현재 스코어 : " + score);
				System.out.println("정답은 " + systemAnser + "!");
				System.out.println("------------------------------");
			}
			if (score == 100) {
				System.out.println("★ 게임 종료! 축하합니다~ ★");
				sc.close();
				System.exit(0);
			}else if(score == -100) {
				System.out.println("★ 게임 종료! 똥멍청이ㅋㅋㅋ ★");
				sc.close();
				System.exit(0);
			}
		}
	}
}

public class GugudanGame {
	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();
		gugudan.run();
	}
}