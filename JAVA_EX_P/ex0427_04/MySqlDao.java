package ex0427_04;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB�� ����");
	}

	@Override
	public void update() {
		System.out.println("MySql DB�� ����");
	}

	@Override
	public void delete() {
		System.out.println("MySql DB���� ����");
	}

}