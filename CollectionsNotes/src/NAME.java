import java.util.*;


public class NAME implements Comparator<Animal> {

	public int compare(Animal o1, Animal o2) {
		return o1.getName().compareTo(o2.getName());
	}	
}
