
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		List<String> ele = new LinkedList<String>();
		ele.add("US");
		ele.add("IND");
		ele.add("PAK");
		ele.add("NEPAL");
		ele.add("Bangala");
		ele.add("Bhutan");
		MainClass class1 = new MainClass();
		class1.printElel(ele);
		ele.sort(null);
		Collections.sort(ele);

	}

	public void printElel(List<String> ele) {
		Iterator<String> iterator = ele.iterator();
		while (iterator.hasNext()) {
			System.out.println("Element :" + iterator.next());

		}
	}
}
