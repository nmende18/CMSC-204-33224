// Napoleon Mendez
public class ArraySum {
	
	public int sumOfArray(Integer[] a, int index) {
		if(index == 0) return 0;
		return a[index - 1] + sumOfArray(a, index - 1);
	}

}
