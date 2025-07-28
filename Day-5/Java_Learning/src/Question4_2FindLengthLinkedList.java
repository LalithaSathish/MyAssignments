import java.util.LinkedList;
import java.util.List;

/*Description: Create a new LinkedListlist with values and find the length
of it
Input: List = 100,200,300,400,500,600,700*/
public class Question4_2FindLengthLinkedList {
	
	public static void main(String[] args) {
		
		List<Integer> list=new LinkedList();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		list.add(700);
		
		System.out.println(list);
		System.out.println(list.size());
		
	}

}
