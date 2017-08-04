package cn.hand.exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String args[]) {
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("请输入日期：");
			String date = in.next();
			String reg = "(19|20)[0-9][0-9]-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[01])";
			Pattern pattern = Pattern.compile(reg);
			Matcher matcher = pattern.matcher(date);
			
			if(matcher.find()==false) {
				System.out.println("输入日期格式错误");
			}else {
				String [] math = date.split("-");
				int year = Integer.parseInt(math[0]);
				int month = Integer.parseInt(math[1]);
				int dd = Integer.parseInt(math[2]);
				if(month==2) {
					if(year%4==0&&year%100!=0||year%400==0) {
						if(dd==29) {
							System.out.println("下一天为"+year+"-"+"0"+(month+1)+"-"+1);
						}else {
							System.out.println("下一天为"+year+"-"+"0"+month+"-"+(dd+1));
						}
					}else {
						if(dd==29) {
							System.out.println("你输入的日期不存在");
						}else if(dd==28) {
							System.out.println("下一天为"+year+"-"+"0"+(month+1)+"-"+1);
						}else {
							System.out.println("下一天为"+year+"-"+"0"+month+"-"+(dd+1));
						}
					}
				}else if(month!=2) {
					if(month%2==0) {
						if(dd==30) {
							System.out.println("下一天为"+year+"-"+"0"+(month+1)+"-"+1);
						}else {
							System.out.println("下一天为"+year+"-"+"0"+month+"-"+(dd+1));
						}
					}else if(month%2!=0) {
						if(dd==31) {
							System.out.println("下一天为"+year+"-"+"0"+(month+1)+"-"+1);
						}else {
							System.out.println("下一天为"+year+"-"+"0"+month+"-"+(dd+1));
						}
					}
				}
				
			}
		}
		}

}
