import javax.sound.midi.Soundbank;

public class Ok {
	int x,y;
	
	public Ok() {
		y=20;
	}
	
	public static void main(String[] args) {
		Ok obj = new Ok();
		obj.x = 10;
		
		System.out.println("Field x: "+obj.x);
		System.out.println("Field y: "+obj.y);
	}

}
