package my.myProject.javaApi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		Date date =new Date();
		Calendar calendar=Calendar.getInstance();
		//获取年月日时分秒
		
		int year =calendar.get(Calendar.YEAR);
		int month =calendar.get(Calendar.MONTH)+1;
		int day =calendar.get(Calendar.DAY_OF_MONTH);
		int dayofweek =calendar.get(Calendar.DAY_OF_WEEK);
		int hour =calendar.get(Calendar.HOUR_OF_DAY);
		int minute =calendar.get(Calendar.MINUTE);
		int second =calendar.get(Calendar.SECOND);
		
		System.out.println(date);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(dayofweek);//1星期天 2 一 3 二  4 三  5 四  6 五  7 六 
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		//格式化日期类:SimpleDateFormat
		SimpleDateFormat simpleDateFormat= new SimpleDateFormat("YYYY年MM月dd日 E a hh时mm分ss秒");
		System.out.println(simpleDateFormat.format(new Date()));
	}

}
