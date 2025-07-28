import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*Description: Write a Java program to remove duplicates from array
Input a[]= {10,10,20,50,60,80,60,50}
Output a [] = {10,20,50,60,80}*/
public class Question3_RemoveDuplicates {
	public static void main(String[] args) {
           int a[]= {10,10,20,50,60,80,60,50};
           
           Set<Integer> output=new LinkedHashSet();
           
           for(int temp:a) {
        	   output.add(temp);
           }
           
          System.out.println(output);
		}
	}

