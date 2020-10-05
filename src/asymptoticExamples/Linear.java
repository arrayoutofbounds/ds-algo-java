package asymptoticExamples;

public class Linear {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		// linear time O(n)
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
