package inheritance;

public class Eal extends Fish {
	private String special;

	public Eal() {
		super();
		this.special = "Reeleases  Electric Shock";
	}

	public String Showinfo() {
		return "Eal [special=" + special + ", heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos
				+ ", animalType=" + animalType + ", bloodType=" + bloodType + "]";
	}
    
}
