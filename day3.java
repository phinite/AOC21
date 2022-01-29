import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

class MyClass {
	public static void main(String[] args) {
		try {
			System.out.println(part_1());
		} catch (IOException e) {
			// cry about it
		}
	}

	public static int part_1() throws IOException {
		Scanner r = new Scanner(new File("day3_text.txt"));
		String data = r.nextLine();
		int z = data.length();
		int[] arr = new int[z];
		int[] og = new int[z];
		og = conv_to_int_add(data, z);

		while (r.hasNextLine()) {
			arr = conv_to_int_add(r.nextLine(), z);
			for (int i = 0; i < z; i++) {
				og[i] += arr[i] == 0 ? -1 : 1;
			}
		}
		int a = 0;
		int b = 0;
		int n = 1;

		int[] ng = new int[z];
		for (int i = (z-1); i>=0; i--) {
			og[i] = og[i] <= 0 ? 0 : og[i] > 0 ? 1 : 0;
			a += n*og[i];
			b += n*(og[i] == 1 ? 0 : 1);
			n *= 2;
		}
		
		return a*b;
	}


	public static int[] conv_to_int_add(String data,  int size) {
		int[] q = new int[size];
		for (int i = 0; i < size; i++) {
			q[i] = Character.getNumericValue(data.charAt(i));
		}
		return q;
	}
}
