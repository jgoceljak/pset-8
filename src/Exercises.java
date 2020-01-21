public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public String[] endsMeet(String[] values, int n) {
		if (values == null || values.length < n || n <= 0) {
			return new String[0];
		}
		String empty[] = new String[0]; 


		if (values == null || values.length < n || n < 0) {
			return empty; 
		}
		String result[] = new String[n*2];
		int length = values.length;
		int index = n;

		for (int i = 0; i < n; i++) {
			result[i] = values[i];
		}
		for (int j = n; j < 2*n; j++) {
			result[j] = values[length-index];
			index--;
		}
		return result;	// default return value to ensure compilation
	}
	
	public int difference(int[] numbers) {
		if (numbers == null || numbers.length < 1) {
			return -1;
		}

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
	   int difference = largest - smallest;
		return difference;
		
		//return -1;
	}
	
	public double biggest(double[] numbers) {
		String empty[] = new String[0]; 
		if (numbers == null || numbers.length < 3 || numbers.length%2 == 0) {
			return -1;
		}
		int midIndex = (int)(Math.ceil(numbers.length / 2));
		double max = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				return -1;
		}
			if ((i == 0 || i == numbers.length - 1 || i == midIndex) && numbers[i] > max) {
				max = numbers[i];
			}
		   }	
		return max;
	}
	
	
	public String[] middle(String[] values) {
		if (values == null || values.length < 3 || values.length%2 == 0) {
			return empty;
		}
		
		//check that no null condition is met
		boolean containsNull = false;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				containsNull = true;
			}
		}
		if (containsNull) {
			return empty;
		}
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
