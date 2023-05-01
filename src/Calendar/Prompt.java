package Calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 5;
		int year = 2023;
		String day = " ";

		while (true) {
			System.out.println("연도를 입력하세요.");
			System.out.print("Year> ");
			year = scanner.nextInt();

			System.out.println("월을 입력하세요.");
			System.out.print("Month> ");
			month = scanner.nextInt();

			System.out.println("첫번째 요일을 입력하세요.");
			System.out.print("Day> ");
			day = scanner.next();
			
			if (month == -1 || year == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}

			cal.printCalendar(year, month, day);
		}

		System.out.println("끝났습니다.");
		scanner.close();
	}

	public static void main(String[] args) {
		// 셸 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
