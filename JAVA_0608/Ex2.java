public class Ex2 {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String str = today.name();
		System.out.println(str);

		int ordinal = today.ordinal(); // ordinal 은 순번을 불러온다(0부터 시작)
		System.out.println(ordinal);

		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;

		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);

		System.out.println(result1);
		System.out.println(result2);

		
		
		if (args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요");
			} else {
				System.out.println("평일이군요");
			}
		}
		
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}

	}
}
