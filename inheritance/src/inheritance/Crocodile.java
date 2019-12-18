package inheritance;

public class Crocodile extends Reptile {

	public Crocodile() {
		super();
		egg="hard Shelled";
	}

	public String ShowInfo() {
		return "Crocodile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

}
