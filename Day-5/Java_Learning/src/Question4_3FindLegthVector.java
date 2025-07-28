import java.util.List;
import java.util.Vector;

/*Description: Create a new vector with values and find the length of it
Input: List = 105,205,305,405,505,605,705,805*/
public class Question4_3FindLegthVector {
	
	public static void main(String[] args) {
		
		List<Integer> list=new Vector();
		
		list.add(105);
		list.add(205);
		list.add(305);
		list.add(405);
		list.add(505);
		list.add(605);
		list.add(705);
		list.add(805);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
	}

}
