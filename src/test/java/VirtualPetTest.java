import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void canKaijuHatch() {

		Kaiju underTest = new Kaiju(0, 0, 0, 0);
		World underTestCity = new World(0, 0, 0, 0);

	}

	@Test
	public void canKaijuEat() {

		Kaiju underTest = new Kaiju(0, 0, 0, 0);
		int sizeBefore = underTest.getSize();
		int hungerBefore = underTest.getHunger();

		underTest.eat();

		int sizeAfter = underTest.getSize();
		int hungerAfter = underTest.getHunger();

		assertTrue(sizeAfter == sizeBefore + 10);
		assertTrue(hungerAfter == hungerBefore - 1);
	}

	@Test
	public void canKaijuDestroy() {

		
		World underTestCity = new World(0, 0, 0, 0);

		underTestCity.destroyTown();

		int cityAfter = underTestCity.getCity();

	}

	@Test
	public void canKaijuTakeDamage() {

		Kaiju underTest = new Kaiju(0, 0, 0, 0);

		int kaijuHurt = underTest.getHealth();

		underTest.hurt();

		int kaijuDamageTaken = underTest.getHealth();

	}

	@Test
	public void canKaijuHeal() {

		Kaiju underTest = new Kaiju(0, 0, 0, 0);

		int kaijuDamageTaken = underTest.getHealth();

		underTest.heal();

		int kaijuHealing = underTest.getHealth();

	}

	@Test
	public void canCityTakeDamage() {

		World underTestCity = new World(0, 0, 0, 0);

		int cityDamageTaken = underTestCity.getCityInfrastructure();

		underTestCity.destruction();

	}
	
	@Test
	public void canCityBeDestroyed() {
		
		World underTestCity = new World(0, 0, 0, 0);
		
		int cityDestroyed = underTestCity.getCityInfrastructure();
		
		underTestCity.destroyed();
		
		
		
	}
	
	@Test
	public void canTick() {
		
		Clock underTestClock = new Clock();
		
		int tick = underTestClock.getTick();
		
		underTestClock.getTick();
	}
	
	@Test
	public void canGrow() {
		
		Kaiju underTest = new Kaiju(0, 0, 0, 0);
		
		int grow = underTest.getGrow();
		
		underTest.getGrow();
	}

}
