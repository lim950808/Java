package ch02_calendar;

import java.util.TimeZone;

public class PrinTimeZomeID {
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs(); //������ timezome id ���
		for(String id:availableIDs)
			System.out.println(id);

	}

}
