package ch02_calendar;

import java.util.TimeZone;

public class PrinTimeZomeID {
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs(); //전세계 timezome id 얻기
		for(String id:availableIDs)
			System.out.println(id);

	}

}
