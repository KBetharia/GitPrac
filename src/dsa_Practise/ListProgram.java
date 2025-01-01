package dsa_Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // List<String> fruits = new ArrayList();
		  Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("papai");
        fruits.add("papai");
        fruits.add("zapai");
        System.out.println(fruits);
       // fruits.set(1, "blueberry");
        System.out.println( "after update: "+ fruits);
        fruits.remove("papai");
        System.out.println( "after deletre: "+ fruits);
        System.out.println("Contains Cherry? " + fruits.contains("Cherry"));
        System.out.println("Contains apple? " + fruits.contains("apple"));
        
        Iterator<String> itr = fruits.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
      //  Collections.sort(fruits);
        System.out.println("After sorting: " + fruits);
        
       // Collections.reverse(fruits);
        System.out.println("After isempty: " + fruits.isEmpty());

        // 11. Check size of the List
        System.out.println("Size of the List: " + fruits.size());

        // 12. Clear the List
        fruits.clear();
        System.out.println("After clearing: " + fruits);

	}

}
