package GenericsProblemsUsingArray;

public class UC_1maxInteger {
	
	// to determine largest of 3 Comparable objects
		public static <M extends Comparable<M>> M maximum(M x, M y, M z) {
			M max = x; // assume x is initially the largest

			if (y.compareTo(max) > 0)
				max = y; // y is the largest so far

			if (z.compareTo(max) > 0)
				max = z; // z is the largest

			return max; // returns the largest object
		} // end method maximum

		public static void main(String args[]) {
			System.out.printf("Maximum of %d, %d and %d is %d\n\n", 1, 2, 3, maximum(1, 2, 3));

		}

}
