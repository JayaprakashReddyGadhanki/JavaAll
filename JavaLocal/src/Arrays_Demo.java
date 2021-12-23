import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_Demo {

	public static void main(String[] args) {

		int[] arr = new int[5];
		int[] arr2 = { 10, 20, 40, 30, 80, 70 };

		// Size of array
		System.out.println("Size of array is " + arr2.length);

		// Print array elements
		for (int ele : arr2) {

			System.out.println(ele);
		}

		
		// convert Array to arraylist
		String[] array = { "Java", "Python", "C" };
		//array.toString();
		
		ArrayList<String> listint = new ArrayList<>(Arrays.asList(array));
		System.out.println(listint);

	}

}
