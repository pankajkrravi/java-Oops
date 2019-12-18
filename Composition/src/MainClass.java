import com.goomo.Components.GraphicCard;
import com.goomo.Components.Processor;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * Laptop laptop=new Laptop();
		 * System.out.println(laptop.getProcessor().getBrand());
		 */
		Processor processor = new Processor("Intel", "7600u", 7, 5, 4, "7Mb", "4.2 Ghz", "3.2 Ghz", "6.3 Ghz");
		GraphicCard hardDrive = new GraphicCard("Navid", 4, "702 MB");
		Laptop gamelaptop = new Laptop(34f, processor, "4 GB", "5 TB", hardDrive, null, "backlit");
		System.out.println(gamelaptop);
		gamelaptop.gamingMode();
		System.out.println("Gamming Mode on ");
		System.out.println(" Curent frequency : "+gamelaptop.getProcessor().getFrequency());
	}
}
