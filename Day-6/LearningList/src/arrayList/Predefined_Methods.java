package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Predefined_Methods {

	public static void main(String[] args) {

		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);

		List list1=new ArrayList();
		list1.add(10);
		list1.add(20);
		System.out.println(list1);

		//System.out.println(list.removeAll(list1));
		System.out.println(list.addAll(list1));
		
		System.out.println(list);
		System.out.println(list1);
		
		

	}

}
