import com.goomo.Components.GraphicCard;
import com.goomo.Components.Processor;

public class Laptop {
	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicCard graphiccard;
	private String opticalDrive;
	private String keyBoard;

	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR 4";
		this.hardDrive = "2TD";
		this.graphiccard = new GraphicCard();
		this.opticalDrive = "Multi Layer";
		this.keyBoard = "backlit";
	}

	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicCard graphiccard,
			String opticalDrive, String keyBoard) {
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphiccard = graphiccard;
		this.opticalDrive = opticalDrive;
		this.keyBoard = keyBoard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphiccard=" + graphiccard + ", opticalDrive=" + opticalDrive + ", keyBoard=" + keyBoard + "]";
	}

	public Processor getProcessor() {
		return processor;
	}

	public float getScreen() {
		return screen;
	}

	public void setScreen(float screen) {
		this.screen = screen;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}

	public GraphicCard getGraphiccard() {
		return graphiccard;
	}

	public void setGraphiccard(GraphicCard graphiccard) {
		this.graphiccard = graphiccard;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public void setOpticalDrive(String opticalDrive) {
		this.opticalDrive = opticalDrive;
	}

	public String getKeyBoard() {
		return keyBoard;
	}

	public void setKeyBoard(String keyBoard) {
		this.keyBoard = keyBoard;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public String gamingMode()

	{
		processor.setFrequency(processor.getMaxFrequency());
		return "success";
	}
}
