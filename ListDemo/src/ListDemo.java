import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
        List<String> countryele=new LinkedList<String>();
           countryele.add("India");
           countryele.add("Nepal");
           countryele.add("Srilanka");
           countryele.add("Banala desh");
           countryele.add("Pakistan");
           new ListDemo().printList(countryele);
           countryele.add(1,"Bragil");
           new ListDemo().printList(countryele);
           countryele.set(5,"Bragil");
           new ListDemo().printList(countryele);
         //  countryele.remove();
           new ListDemo().printList(countryele);
           
           List<String> listInelel=new LinkedList<String>();
           listInelel.add("one");
           listInelel.add("Two");
           listInelel.add("Three");
           new ListDemo().printList(listInelel);
	}
	public void printList(List<String> strLL)
	{
		for (String string : strLL) {
			System.out.println(string);
		}
		System.out.println("********************************");
	}
}

