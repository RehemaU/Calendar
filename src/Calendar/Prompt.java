package Calendar;

import java.util.Scanner;

public class Prompt {
	/**
	 * @param week 요일명
	 * @return 0~6 (0 일요일, 6 토요일)
	 */
	public int parseDay(String week) {
		if (week.equals("SU"))
			return 0;
		else if (week.equals("MO"))
			return 1;
		else if (week.equals("TU"))
			return 2;
		else if (week.equals("WE"))
			return 3;
		else if (week.equals("TH"))
			return 4;
		else if (week.equals("FR"))
			return 5;
		else if (week.equals("SA"))
			return 6;
		else
			return 0;
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 5;
		int year = 2023;
		int weekday = 0;

		while (true) {
			System.out.println("연도를 입력하세요. (exit: -1)");
			System.out.print("Year> ");
			year = scanner.nextInt();
			if (year == -1)
				break;
			System.out.println("월을 입력하세요.");
			System.out.print("Month> ");
			month = scanner.nextInt();
			System.out.println("첫번째 요일을 입력하세요. (SU, MO, TU,  WE, TH, FR, SA)");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);

			if (month > 12 || month < 1) {
				System.out.println("잘못된 달 입력입니다.");
				continue;
			}

			cal.printCalendar(year, month, weekday);
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
