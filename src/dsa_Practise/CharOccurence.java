package dsa_Practise;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "hello world";
	        int[] count = new int[256]; // ASCII range
	        for (int i = 0; i < str.length(); i++) {
	        	  System.out.println(count[str.charAt(i)]);
	        }
	        
	    //    for (int i = 0; i < str.length(); i++) {
	        //   System.out.println count[str.charAt(i)]++;
	    //    }
//	        for (int i = 0; i < count.length; i++) {
//	            if (count[i] > 0) {
//	                System.out.println((char) i + ": " + count[i]);
//	            }
//	        }
	}

}
