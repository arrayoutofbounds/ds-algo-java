package basics;

public class GenericDemo {
	public static <T> void reverse(T[] data) {
		int low = 0;
		int high = data.length - 1;
		
		while(low<high) {
			T temp = data[low];
			data[low] = data[high];
			data[high] = temp;
			
			low++;
			high--;
		}
	}
	
	public static void main(String[] args) {
		Integer[] d = {1,2,3};
		reverse(d);
		for(int a : d) {
			System.out.println(a);
		}
	}
}
