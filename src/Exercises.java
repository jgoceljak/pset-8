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

				String empty[] = new String[0]; 
				if (values == null || values.length < 3 || values.length%2 == 0) {
					return empty;
				}
				boolean containsNull = false;
				for (int i = 0; i < values.length; i++) {
					if (values[i] == null) {
						containsNull = true;
					}
				}
				if (containsNull) {
					return empty;
				}
				int middle = values.length / 2;
				int first = middle-1;
				int last = middle+1;

				String[] result = {values[first], values[middle], values[last]};
				return result;
	}

	public boolean increasing(int[] numbers) {
		if (numbers == null || numbers.length < 3) {
			return false;
		}

		int lowest = numbers[0];
		int middle = numbers[1];
		int last = numbers[2];
		for (int i = 0; i < numbers.length; i++) {
			if (lowest < middle && middle < last) {
				return true;
			}
			if (i + 2 < numbers.length) {
				lowest = numbers[i];
				middle = numbers[i + 1];
				last = numbers[i + 2];
			} else {
				return false;
		}
		}
		
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		if (numbers == null || numbers.length < 1) {
			return false;
		}	
		boolean lastPos = false;
		int gap = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == x) {
				lastPos = true;
				gap = 0;
			} else {
				if (i == 1 && lastPos == false) {
					return false;
				} else if (lastPos == false) {
					gap++;
				}
				lastPos = false;
			}
			if (gap == 2) {
				return false;
			}
		}
			return true;
	}
		
	
	public boolean consecutive(int[] numbers) {
		if (numbers == null || numbers.length < 3) {
			return false;
		}
		boolean isConsecutive = false;
		
		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i] % 2 == numbers[i-1] % 2 && numbers[i] % 2 == numbers[i-2] % 2) {
				isConsecutive = true;
			}
		}

		return isConsecutive;
	}
	
	public boolean balance(int[] numbers) {
		if (numbers == null || numbers.length < 2) {
			return false;
		}
		for (int i = 0; i < numbers.length; i++) {
			int firstSum = 0;
			int secondSum = 0;
			for (int j = 0; j < i; j++) {
				firstSum += numbers[j];
			}
			for (int k = i; k < numbers.length; k++) {
				secondSum += numbers[k];
			}
			if (firstSum == secondSum) {
				return true;
			}
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		if (values == null) {
			return -1;
		}
		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				return -1;
			}
		}
		boolean same = false;
		boolean prevSame = false;
		String previous = "";
		int clumps = 0;
		for (int i = 0; i < values.length; i++) {
			if (previous.equals(values[i])) {
				same = true;
				if (prevSame != true) {
					clumps++;
				} 
			} else {
				same = false;
			}
			previous = values[i];
			prevSame = same;
		}		
		return clumps;
	}
}
