package challenges;
// prueba desde Mac

import java.util.Arrays;

public class TwoToOne {

	public static void main(String[] args) {
		String s1 = "xyaabbbccccdefww";
		String s2 = "xxxxyyyyabklmopq";
		String resultado = longest2(s1, s2);
		String longest = "abcdefklmopqwxy";
		// System.out.println(longest == resultado);
		System.out.println("Este es el resultado " + resultado);
		assertEquals("aehrsty", TwoToOne.longest2("aretheyhere", "yestheyarehere"));
	}

	private static boolean assertEquals(String string, String longest2) {
		System.out.println("Hola");
		if (string == longest2) {
			System.out.println("hi");
			return true;
		} else {
			System.out.println("wow");
			return false;
		}
	}

	// public static String longest1(String s1, String s2) {
	// // your code
	// StringBuilder sb = new StringBuilder();
	// boolean noEsta = false;
	// for (int i = 0; i < s1.length(); i++) {
	// for (int j = 1; j < sb.capacity(); j++) {
	// // System.out.println(sb.charAt(j));
	// if (s1.charAt(i) == sb.charAt(j)) {
	// noEsta = false;
	// break;
	// }
	// noEsta = true;
	// }
	// if (noEsta == true)
	// sb.append(s1.charAt(i));
	// }
	// String stringResult = sb.toString();
	// return stringResult;
	// }

	public static String longest2(String s1, String s2) {
		// Create a stringBuilder object to concatenate both strings
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			sb.append(s1.charAt(i));
		}
		for (int i = 0; i < s2.length(); i++) {
			sb.append(s2.charAt(i));
		}
		
		// Iterate over the string with two loops to search and compare 
		for (int i = 0; i < sb.length(); i++) {
			for (int h = sb.length() - 1; h > 0; h--) {
				// Delete duplicates
				if (i != h && sb.charAt(i) == sb.charAt(h)) {
					sb.deleteCharAt(h);
				}
			}
		}
		// Convert sb to string
		String st = sb.toString();
		// Convert the string into an array in order to sort it
		char[] array = st.toCharArray();
		Arrays.sort(array);
		// Convert the sorted array into a string in order to return it
		st = Arrays.toString(array);
		return new String(array);
	}

}