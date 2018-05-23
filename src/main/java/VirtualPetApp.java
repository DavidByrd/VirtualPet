import java.util.Scanner;

public class VirtualPetApp {
	
	 

	

	 public static void main(String args[]){
		
		 Scanner input = new Scanner(System.in);
		 
		 Kaiju myKaiju = new Kaiju(10, 90, 50, 20);
		 Clock myClock = new Clock("Day", "Night");
		 World myWorld = new World(50, 100, 150, 200);
				
				
				
		System.out.println("You found a Kaiju egg!!!");
		System.out.println("Awesome for you, yet so very tragic for humanity");
		System.out.println("What are you going to name your soon to be city stomping bundle of joy?");
		
		String name = input.nextLine();
		
		System.out.println("Here is " + name + ",s stats");
		System.out.println("Height: 10 ft");
		System.out.println("Health: 90");
		System.out.println("Hunger: 50");
		
		while( myKaiju.getHealth() > 0 || myWorld.getTown() > 0 && (0 == myWorld.getTown())) {
			 
		
		System.out.println("Day");
		myClock.day();
		System.out.println(name +" is hungry, hasn't your neighbor been getting on your last nerves lately? I mean who plays pokemon go in other people's yard a 2:00am!?!?!?!?");
		
		
		System.out.println("Would you like to feed " + name +" ?");
		
		System.out.println(" To feed press press one");
		int one = input.nextInt();
		
		if (one == 1 ) {
			System.out.println("You've fed "+ name +", look how happy it is!!!");
			myKaiju.eat();
			System.out.println("Your Kaiju's health is " + myKaiju.getHealth());
			break;
			
				
		}else {
		System.out.println("Comon! how can you look into those gleaming red eyes and not club your neighbor over the head!");
		}
		}
		
		System.out.println("Night");
		myClock.night();
		System.out.println("With the comming of night " + name + ",s Kaiju instints kick in, he must destroy!!!");
		System.out.println("To attack press two");
		int two = input.nextInt();
		
		if (two == 2) {
		
		System.out.println("town:" + myWorld.getTown());
		System.out.println(name + " attacks the town");
		myKaiju.destroy();
		System.out.println("town: "+ myWorld.getTown());
		System.out.println("The police defend their town");
		myKaiju.hurt();
		myWorld.destroy();}
		else if  (1 >myWorld.getTown()){
			System.out.println("The town is destroyed!!!!");}
		else   {System.out.println("That towns not going to destroy it's self!!!");
		}
			System.out.println("Now, my young Kaiju handler, your journey of mayham and destruction has begun!!!");
			
			
		System.out.println(name);
		System.out.println("Health: " + myKaiju.getHealth());
		System.out.println("Size: " + myKaiju.getSize());
		
		
		int day = 1;
		do {
		myClock.day();
		day++;
		
		} while(day>4);
		System.out.println("Its become night");
		
		System.out.println("Its time to take yor rampage to the city");
		System.out.println("To attack press two");
		 two = input.nextInt();
		
		if (two == 2) {
		
		System.out.println("City:" + myWorld.getCity());
		System.out.println(name + " attacks the town");
		myKaiju.destroy();
		System.out.println("City: "+ myWorld.getTown());
		System.out.println("The national guard defend their city");
		myKaiju.hurt();
		myWorld.destroyed();}
		else if  (1 >myWorld.getCity()){
			System.out.println("The city is destroyed!!!!");}
		else   {System.out.println("That citys not going to destroy it's self!!!");
		}
		
		System.out.println(name);
		System.out.println("Health: " + myKaiju.getHealth());
		System.out.println("Size: " + myKaiju.getSize());
		
		
		 day = 1;
		do {
		myClock.day();
		day++;
		
		} while(day>4);
		System.out.println("Its become night");
		
		System.out.println("Its time to take yor rampage to the whole country");
		System.out.println("To attack press two");
		 two = input.nextInt();
		
		if (two == 2) {
		
		System.out.println("Country:"+ myWorld.destroyedCountry());
		System.out.println(name + " attacks the town");
		myKaiju.destroy();
		System.out.println("Country: " + myWorld.getCountryy());
		System.out.println("The American armed forces defend their city");
		myKaiju.hurt();
		myWorld.destroyed();}
		else if  (1 >myWorld.getCountryy()){
			System.out.println("The country is destroyed!!!!");}
		else   {System.out.println("That countrys not going to destroy it's self!!!");
		}
		
		System.out.println(name);
		System.out.println("Health: " + myKaiju.getHealth());
		System.out.println("Size: " + myKaiju.getSize());
		
		
		 day = 1;
		do {
		myClock.day();
		day++;
		
		} while(day>4);
		System.out.println("Its become night");
		
		System.out.println("Its time to take yor rampage to the whole country");
		System.out.println("To attack press two");
		 two = input.nextInt();
		
		if (two == 2) {
		
		System.out.println("World:"+ myWorld.destroyedCountry());
		System.out.println(name + " attacks the World!");
		myKaiju.destroy();
		System.out.println("World: " + myWorld.getCountryy());
		System.out.println("The United Nations armed forces defend their World");
		myKaiju.hurt();
		myWorld.destroyed();}
		else if  (1 >myWorld.getCountryy()){
			System.out.println("The world is destroyed!!!!");}
		else   {System.out.println("That world not going to destroy it's self!!!");
		}
		
		
		
		
		System.out.println("You and your Kaiju are victorious, all is rubble before you!!!!");

		
		
		
		
		
		

	}
	 
	 
	 
	
	
	 
	 
	 
	}
