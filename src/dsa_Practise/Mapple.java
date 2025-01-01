package dsa_Practise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Mapple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>();
		map.put("Betharia" ,902);
		map.put("Singh" ,901);
		map.put("Bhide" ,903);
		System.out.println(map);
		System.out.println("value ASSOciated with singh: "+ map.get("Singh"));
	    System.out.println("Does key 'bhide' exist? " + map.containsKey("Bhide"));
        System.out.println("Does value 901 exist? " + map.containsValue(901));
        System.out.println("Iterating through keys and values:");
       for(Map.Entry<String,Integer> entry : map.entrySet())
       {
    	   System.out.println(entry.getKey()+"Stays at" + entry.getValue());
       }
       
       System.out.println("al keys"+map.keySet());
       System.out.println("al values"+map.values());
        
        map.remove("Bhide");
        System.out.println("After removing 'bhide': " + map);
	
	}

}
