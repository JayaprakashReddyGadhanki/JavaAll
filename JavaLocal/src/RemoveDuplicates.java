
public class RemoveDuplicates {

	public static void main(String[] args) {

		String input = "zzvvo";

		char[] arr = input.toCharArray();
		String Output = "";

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					i = i + 1;

				} else {

				}

			}

			Output = Output + arr[i];
		}

		System.out.println("Output is:" + Output);

	}

}
