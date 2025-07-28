import java.util.ArrayList;
import java.util.List;

/*Description: Create a new ArrayListlist with values and find the length
of it
Input: List = 10, 20,30,90,10,10,40,50*/
public class Question4_1FindLengthArrayList {
	
	public static void main(String[] args) {
		
          List<Integer> input=new ArrayList();
          
          input.add(10);
          input.add(20);
          input.add(30);
          input.add(90);
          input.add(10);
          input.add(10);
          input.add(40);
          input.add(50);
          
          System.out.println(input);
          
          System.out.println(input.size());
          
	}
}
