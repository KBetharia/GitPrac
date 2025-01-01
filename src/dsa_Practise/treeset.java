package dsa_Practise;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 1. Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // 2. Add elements to the TreeSet
        numbers.add(40);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate element (will be ignored)

        System.out.println("Initial TreeSet: " + numbers);

        // 3. Retrieve the first and last elements
        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());

        // 4. Remove an element
        numbers.remove(20);
        System.out.println("After Removing 20: " + numbers);

        // 5. Check if an element exists
        System.out.println("Contains 30? " + numbers.contains(30));

        // 6. Iterate through the TreeSet using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 7. Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        java.util.Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 8. Retrieve elements less than a given value (headSet)
        System.out.println("Elements less than 30: " + numbers.headSet(30));

        // 9. Retrieve elements greater than or equal to a given value (tailSet)
        System.out.println("Elements greater than or equal to 30: " + numbers.tailSet(30));

        // 10. Retrieve a subset (subSet)
        System.out.println("Subset between 10 and 40: " + numbers.subSet(10, 40));

        // 11. Check size of the TreeSet
        System.out.println("Size of TreeSet: " + numbers.size());

        // 12. Clear the TreeSet
        numbers.clear();
        System.out.println("After Clearing: " + numbers);

        // 13. Check if the TreeSet is empty
        System.out.println("Is TreeSet empty? " + numbers.isEmpty());

	}

}
