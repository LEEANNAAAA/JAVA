package ex0427_04;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) { //dbWork 메소드 호출, dataaccessobject 가 인터페이스 변수
		dao.select(); //dataaccessobject 에 대한 추상 메소드 선언
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}
