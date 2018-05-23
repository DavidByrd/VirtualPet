
public class Kaiju {
	
	public Kaiju(int size, int health,int hunger, int attack) {
		this.size = size;
		this.health = health;
		this.hunger = hunger;
		
		
		 
		
		
	}

	private int size = 10;
	private int hunger = 5;
	
	private int health = 90;
	

	public int getSize() {

		return size;
	}

	public int getHunger() {

		 return hunger;
		 
		
		}
	

	public void eat() {
		size += 10;
		hunger -= 1;
		health += 10;

	}

	public void destroy() {
		  
		return;

	}
	
	public void destroyCity() {
		 ;

	}
	
	public void destroyCountry() {
		 ;

	}
	
	public void destroyWorld() {
		 int attack = 10;

	}
	
	
	public int getHealth() {
		
		return health;
	}

	public int hurt() {
		return health -= 10;

	}

	public void heal() {
		this.health += 10;
		

	}

	public void Tick() {

	}

	public int getGrow() {
		
		return 0;
	}

}
