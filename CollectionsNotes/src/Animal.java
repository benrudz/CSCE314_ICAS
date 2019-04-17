
public class Animal {
	private String name, species;
	private double weight;
	private int limbs;
	private boolean diet;	// 1 for carnivore/omnivore, 0 for herbivore
	
	public Animal(String name, String species, double weight, int limbs, boolean diet) {
		super();
		this.name = name;
		this.species = species;
		this.weight = weight;
		this.limbs = limbs;
		this.diet = diet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getLimbs() {
		return limbs;
	}

	public void setLimbs(int limbs) {
		this.limbs = limbs;
	}

	public boolean isDiet() {
		return diet;
	}

	public void setDiet(boolean diet) {
		this.diet = diet;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", species=" + species + ", weight=" + weight + ", limbs=" + limbs + ", diet="
				+ diet + "]";
	}
}
