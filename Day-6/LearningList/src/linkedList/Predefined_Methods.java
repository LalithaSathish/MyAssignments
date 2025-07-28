package linkedList;

import java.util.LinkedList;
import java.util.List;

public class Predefined_Methods{
	
	public static void main(String[] args) {
		
		List list=new LinkedList();
		//add
		for (int i = 11; i <=20; i++) {
			list.add(i);
		}
		list.add("Java");
		list.add(11);
		list.add(true);
		
		System.out.println("list "+list);
		
		List list1=new LinkedList();
		//add
		for (int i = 11; i <=20; i++) {
			list1.add(i);
		}
		list1.add("JavaProgram");
		list1.add(11);
		list1.add(false);
		
		System.out.println("list1 "+list1);
		/*
		 * //Size int sizeoflist=list.size();
		 * System.out.println("sizeoflist :-"+sizeoflist); //indexOf int
		 * indexposition=list.indexOf(18);
		 * System.out.println("indexposition of 18 :-"+indexposition); //lastIndexOf int
		 * lastindexposition=list.lastIndexOf(11);
		 * System.out.println("lastindexposition of 11 :-"+lastindexposition);
		 * //Contains boolean bool=list.contains("Java");
		 * System.out.println("Contains Java in list :-"+bool);
		 * 
		 * Object removedlist=list.remove(10);
		 * System.out.println("removed 10th index value"+removedlist);
		 * 
		 * System.out.println(list);
		 * 
		 * Object getvalue=list.get(10); System.out.println(getvalue);
		 * 
		 * for (Object object : list) { System.out.println(object); }
		 * 
		 * for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i)); }
		 */
		
		
	}

}
