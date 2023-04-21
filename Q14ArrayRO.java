package javatuto;
import java.util.ArrayList;
import java.util.List;

public class Q14ArrayRO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		l.add("first");
		l.add("first");
		l.add("second");
		System.out.println("Remove all occurences"+l);
		l.removeAll(l);
		System.out.println("After Removing");


	}

}
