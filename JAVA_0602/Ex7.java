import java.util.Calendar;

public class Ex7 {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); 	//날짜정보를 읽어와서 객체로 변환
		int week = cal.get(Calendar.DAY_OF_WEEK);	//숫자로 리턴(일요일(1)~토요일(7))
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일은 "+today);
		
		if(today.equals(Week.SUNDAY)) {
			System.out.println("일요일~");
		} else {
			System.out.println("자바 공부중~");
		}
		
		
	}
}
