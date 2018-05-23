
public class World {

	
	public World(int townInfrastructure, int cityInfrastructure, int wholeCountryInfrastructure, int wholeWorld) {
		
		this.townInfrastructure = townInfrastructure;
		this.cityInfrastructure = cityInfrastructure;
		this.wholeCountryInfrastructure= wholeCountryInfrastructure;
		this.wholeWorld = wholeWorld;
		
	}
	
	private int wholeWorld = 200;
	private int wholeCountryInfrastructure = 150;
	private int townInfrastructure = 50;
	private int cityInfrastructure =100;
	private int damage;
	

	public int getCityInfrastructure() {

		return cityInfrastructure;
	}

	public void destruction() {

	}
	
	public int getTown() {
		return townInfrastructure;
	}
	
	public int getCity() {
		return cityInfrastructure;
	}

	public int getCountryy() {
		
		return wholeCountryInfrastructure;
	}
	
	public int getwholeWorld() {
		
		return wholeWorld;
	}

	public int destroy() {
		
		return townInfrastructure -= 50;
		
	}

	public int destroyed() {
		
		return cityInfrastructure -= 50;
		// TODO Auto-generated method stub
		
	}
	
	public int destroyedCountry() {
		return wholeCountryInfrastructure -= 75;
	}

	public int destroyedWorld() {
		return wholeWorld -= 100;
	}
}
