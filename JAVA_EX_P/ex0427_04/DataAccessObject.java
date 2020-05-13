package ex0427_04;

public interface DataAccessObject {
	public void select(); //public은 여기서 생략 가능(자동적으로 붙는다)
	public void insert(); 
	public void update(); 
	public void delete(); 
}
