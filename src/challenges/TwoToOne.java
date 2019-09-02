package challenges;
// prueba desde Mac

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class TwoToOne {

	public static void main(String[] args) {
		String s1 = "xyaabbbccccdefww";
		String s2 = "xxxxyyyyabklmopq";
		String resultado = longest2(s1, s2);
		String longest = "abcdefklmopqwxy";
		// System.out.println(longest == resultado);
		// System.out.println("Este es el resultado " + resultado);
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
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			sb.append(s1.charAt(i));
		}
		for (int i = 0; i < s2.length(); i++) {
			sb.append(s2.charAt(i));
		}

		// System.out.println(sb.length());
		// System.out.println(sb.charAt(0));
		// sb.deleteCharAt(0);
		// System.out.println(sb.charAt(sb.length()-1));
		// System.out.println(sb.length());
		// System.out.println(sb.length());

		for (int i = 0; i < sb.length(); i++) {
			for (int h = sb.length() - 1; h > 0; h--) {
				// System.out.println("En el mas interno i es: " + i + " y j es: " + h);
				if (i != h && sb.charAt(i) == sb.charAt(h)) {
					// System.out.println("Antes de borrar: " + sb.toString());
					sb.deleteCharAt(h);
					// System.out.println("despues de borrar: " + sb.toString());
				}
			}
		}
		// System.out.println(sb.toString());
		String st = sb.toString();
		char[] array = st.toCharArray();
		Arrays.sort(array);
		System.out.println(array);
		st = Arrays.toString(array);
		// System.out.println(st);
		return new String(array);
	}

}