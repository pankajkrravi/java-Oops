package inheritance;

public class Fish extends Animal {
	private boolean waterBone;
	private boolean gills;

	public Fish() {
		animalType="Fish";
		this.waterBone = true;
		this.gills = true;
	}

	public String ShowInfo() {
		return "Fish [waterBone=" + waterBone + ", gills=" + gills + ", heightInFeet=" + heightInFeet
				+ ", weightInKilos=" + weightInKilos + ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}

}
