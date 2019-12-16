package sunjinkim.calendar;

import java.util.Scanner;

public class Calendar {
	public final static int[] MAX_DAYS_OF_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) {
		System.out.println("�ݺ� Ƚ���� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int repeat = scanner.nextInt();
		
		for(int i=0; i<repeat;i++) {
			System.out.println("���� �Է��ϼ���");
			int month = scanner.nextInt();
			System.out.printf("%d���� ������ ���� %d�� �Դϴ�.\n", month, Calendar.getMaxDayOfMonth(month));
		}
		System.out.println("Bye~");
		scanner.close();
	}
	
	public static int getMaxDayOfMonth(int month) {
		return MAX_DAYS_OF_MONTH[month-1];
	}
}
