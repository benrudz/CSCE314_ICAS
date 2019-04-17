import java.util.*;

public class WEIGHT implements Comparator<Animal> {

	@Override
	public int compare(Animal a1, Animal a2) {
		if(a1.getWeight() == a2.getWeight()) {
			return 0;
		}
		else if(a1.getWeight() < a2.getWeight()) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
}
