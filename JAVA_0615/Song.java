public class Song {
	
	String title;
	String artist;
	int year;
	String country;
	
	public Song() {
		
	}
	
	public Song(int year, String country, String artist, String title) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}

	void show() {System.out.println(year+"년 "+country+" 국적의 "+artist+"가 부른 "+title);}
	
	public static void main(String[] args) {
		Song sn = new Song(1978,"스웨덴","ABBA","Dancing Queen");
		sn.show();
	}
}
