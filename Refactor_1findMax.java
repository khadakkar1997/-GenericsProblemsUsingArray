package GenericsProblemsUsingArray;

public class Refactor_1findMax {
	
	
	public static <E extends Comparable> E max(E... elements) {
	    E max = elements[0];
	    for (E element : elements) {
	        if (element.compareTo(max) > 0) {
	            max = element;
	        }
	    }
	    return max;
	}
	public static void main(String[] args) {
	       System.out.println("Integer Max: " + max(Integer.valueOf(35), Integer.valueOf(58), Integer.valueOf(88)));
	       System.out.println("Double Max: " + max(Double.valueOf(8.6), Double.valueOf(4.8), Double.valueOf(14.6)));
	       System.out.println("String Max: " + max("peach", "apple", "banana"));
	       
	   }
}
