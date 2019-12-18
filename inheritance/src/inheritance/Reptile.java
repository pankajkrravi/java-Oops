package inheritance;

public class Reptile extends Animal {
	protected String skin, egg;

	public String ShowInfo() {
		return "Reptile [skin=" + skin + ", egg=" + egg + ", backbone=" + backbone + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

	protected boolean backbone;

	public Reptile() { // to initilise
		heightInFeet = 5;
		weightInKilos = 20;
		animalType = "Raptile ";
		bloodType = "Cold";
		this.skin = "Dry Skin";
		this.egg = "shoft shelled";
		this.backbone = true;
	}

}
