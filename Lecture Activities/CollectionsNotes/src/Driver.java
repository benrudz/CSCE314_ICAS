import java.util.*;

public class Driver {
	
	public static void main(String[] args) {
		/*
		// DAY 1
		LinkedList<Car> cars = new LinkedList<Car>();
		
		Car ben1 = new Car("civic", "12", 99.0);
		Car ben2 = new Car("ferrari", "123", 10.0);
		Car ben3 = new Car("jeep", "1234", 2.0);
		cars.add(ben1);
		cars.add(ben2);
		cars.add(ben3);
		
		System.out.println(cars.get(0));
		System.out.println(cars.get(1));
		System.out.println(cars.get(2));
		*/
		// DAY 2
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Chimp", "Primate", 20.0, 4, false));
		animals.add(new Animal("Guppy", "fish", 0.1, 2, false));
		animals.add(new Animal("Ben", "human", 160.0, 4, true));
		animals.add(new Animal("Dog", "canine", 15.0, 4, true));
		
		
		System.out.println("SORTED BY NAME");
		NAME name = new NAME();
		Collections.sort(animals, name);
		Iterator<Animal> x = animals.iterator();
		while(x.hasNext()) {
			Animal animal = x.next();
			System.out.println(animal);
		}
		
		System.out.println("\nSORTED BY WEIGHT");
		WEIGHT weight = new WEIGHT();
		Collections.sort(animals, weight);
		x = animals.iterator();
		while(x.hasNext()) {
			Animal animal = x.next();
			System.out.println(animal);
		}
	}
}
