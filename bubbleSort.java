import java.util.*;

public class bubbleSort {
	private int sortArray[] = new int[7];
	private String sortString;;
	private Scanner inputSortString = new Scanner(System.in);	
	
	//sortArray index
	int sortArrayIndex(int x) {
		return sortArray[x];
	}
	
	//output array
	String getArray() {
		return Arrays.toString(sortArray);
	}
	
	//sortString setter
	void setSortString() {
		System.out.println("Input Student ID you would like to sort (No spaces or other symbols, max. 7 characters): ");
		this.sortString = inputSortString.next();
	}
	
	//sortString getter
	String getSortString() {
		return sortString;
	}
	
	//inputs numbers into array
	void arraySetter() {
		for (int i = 0; i < 7; i++ ) { 
				int temp = Integer.parseInt(String.valueOf(sortString.charAt(i)));
				sortArray[i] = temp;
		}
	}
	
	//bubble sort
	void myBubbleSort() {
		for (int i = 0;i < 7; i++) {
			for (int j = 1; j < (7-i); j++) {
				if (sortArray[j-1] > sortArray[j]) {
					int temp = sortArray[j-1];
					sortArray[j-1] = sortArray[j];
					sortArray[j] = temp;
				}
			}
		}
	}
	
	//insertion sort
	void myInsertionSort() {
		for (int i=0; i < 7;i++) {
			int temp = sortArray[i];
			
			while ((i-1 > -1)&&(sortArray[i-1] > temp)) {
				sortArray[i] = sortArray[i-1];
				i--;
			}
			sortArray[i] = temp;
		}
	}
}
