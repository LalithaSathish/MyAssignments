import java.util.ArrayList;
import java.util.List;

/*Description: Get the first index value of 10
Input: List = 10,20,30,90*/
public class Question5_1 {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(90);
		
		System.out.println(list);
		System.out.println(list.indexOf(10));
		
		
	}
}
