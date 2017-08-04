package cn.hand.exam;

import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
		Double tax=0.00;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入工资:");
		Double salary = in.nextDouble();
		if((salary-3500)<=0) {
			tax = 0.00;
		}else if((salary-3500)>0&&(salary-3500)<=1500) {
			tax=(salary-3500)*0.03;
		}else if((salary-3500)>1500&&(salary-3500)<=4500) {
			tax=(salary-3500)*0.1;
		}else if((salary-4500)>0&&(salary-3500)<=9000) {
			tax=(salary-3500)*0.2;
		}else if((salary-3500)>9000&&(salary-3500)<=35000) {
			tax=(salary-3500)*0.25;
		}else if((salary-35000)>0&&(salary-3500)<=55000) {
			tax=(salary-3500)*0.30;
		}else if((salary-55000)>0&&(salary-3500)<=80000) {
			tax=(salary-3500)*0.35;
		}else if((salary-3500)>80000) {
			tax=(salary-3500)*0.45;
		}
		System.out.println("所需缴纳的税费为:"+tax);
	}
}
