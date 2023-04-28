package Calendar;
import java.util.Scanner;

public class Calendar_prestudy
{
	//1
//	public static void main(String[]args)
//	{
//		System.out.println(" 일 월 화 수 목 금 토");
//		System.out.println("--------------------");
//		int num = 1;
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=7;j++)
//			{
//				System.out.printf("%d",num);
//				num++;
//				if (num<=10)
//				{
//					System.out.print("  ");
//				}
//				else if (num>10)
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println("");
//		}
//	}
	//2
//	public static void main(String[]args)
//	{
//		System.out.println("두 수를 입력하세요");
//		Scanner scan = new Scanner(System.in);
//		String inputValue = scan.nextLine();
//		String[] splitedValue = inputValue.split(" ");
//		int num1 = Integer.parseInt(splitedValue[0]);
//		int num2 = Integer.parseInt(splitedValue[1]);
//		int num3 = num1+num2;
//		System.out.printf("두 수의 합은 %d입니다.",num3);
//	}
	//3
//	public static void main(String[]args)
//	{
//		System.out.println("달을 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		if(a==2)
//		{
//			System.out.printf("%d월은 28일까지 있습니다.",a);
//		}
//		else if(a%2==0&&a!=2)
//		{
//			System.out.printf("%d월은 30일까지 있습니다.",a);
//		}
//		else
//		{
//			System.out.printf("%d월은 31일까지 있습니다.",a);
//		}
//	}
	//4
	public static void main (String[]args)
	{
		int[] maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner scanner = new Scanner(System.in);
		System.out.println("반복 횟수를 입력하시오.");
		int num = scanner.nextInt();
		int months[]=new int[num];
		for (int i=0;i<num;i++)
		{
			System.out.println("달을 입력하세요.");
			months[i] = scanner.nextInt();
		}
		for (int i=0;i<num;i++)
		{
			int monnum = months[i];
			System.out.printf("%d월은 %d일까지 있습니다. \n",months[i],maxdays[monnum-1]);
		}
		scanner.close();
	}
}
