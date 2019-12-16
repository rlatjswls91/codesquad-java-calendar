package sunjinkim.calendar;

import java.util.Scanner;

public class Calendar {
	public final static int[] MAX_DAYS_OF_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) {
		System.out.println("달을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		System.out.printf("%d월의 마지막 날은 %d일 입니다.", month, Calendar.getMaxDayOfMonth(month));
		scanner.close();
	}
	
	public static int getMaxDayOfMonth(int month) {
		return MAX_DAYS_OF_MONTH[month-1];
	}
}
