import java.util.Scanner;

public class Clock {
	public Clock(String Day, String Night) {
		this.night = night;
		this.day = day;
	
	}


	private int  night;
	private int  day;

	
	
	 Scanner input = new Scanner(System.in);

	 Kaiju myKaiju = new Kaiju(10, 90, 50, 20);
	
	
	
	public void day() {
		myKaiju.getHunger();
		if (8 > myKaiju.getHunger()) {
		System.out.println("Your Kaiju is very hungry and getting weak");	
		myKaiju.hurt(); }
		
		else {
			
		
		
		
		}
		
	
		
		}
		
	

		
		
	
		
	

	void night() {
		int night = 1; night++;
		if( night > 4)
			  this.day();
		
		
	}

	public int getTick() {
		return 0;
	}

	



	
	

}

