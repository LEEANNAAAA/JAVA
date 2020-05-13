package ex0427_04;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) { //dbWork �޼ҵ� ȣ��, dataaccessobject �� �������̽� ����
		dao.select(); //dataaccessobject �� ���� �߻� �޼ҵ� ����
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}
