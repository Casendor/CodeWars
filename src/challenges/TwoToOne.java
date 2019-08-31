package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class TwoToOne {
	
	public static void main(String[] args) {
		String s1 = "Hey there";
		String s2 = "Hey you";
		String resultado = longest2(s1, s2);
		System.out.println("Este es el resultado " + resultado);
	}
    
    public static String longest1 (String s1, String s2) {
        // your code
    	StringBuilder sb = new StringBuilder();
    	boolean noEsta = false;
    	for (int i = 0; i < s1.length(); i++) {
			for (int j = 1; j < sb.capacity(); j++) {
				//System.out.println(sb.charAt(j));
				if(s1.charAt(i) == sb.charAt(j)) {
					noEsta = false;
					break;
				}
				noEsta = true;
			}
			if (noEsta == true)
				sb.append(s1.charAt(i));
		}
    	String stringResult = sb.toString();
    	return stringResult;
    }
    
    public static String longest2 (String s1, String s2) {
    	StringBuilder sb = new StringBuilder();
    	int contador=1;
    	for (int i = 0; i < s1.length(); i++) {
			sb.append(s1.charAt(i));
		}
    	for (int i = 0; i < s2.length(); i++) {
			sb.append(s2.charAt(i));
		}
		/*
		 * System.out.println(sb.capacity()); System.out.println(sb.charAt(5));
		 * sb.charAt(15); sb.deleteCharAt(5); sb.charAt(15);
		 * System.out.println(sb.charAt(5)); System.out.println(sb.capacity());
		 * System.out.println(sb.toString());
		 */
    	for (int i = 0; i < sb.capacity()-1; i++) {
			for (int j = i+1; j < sb.capacity()-contador; j++) {
				if(sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
					contador++;
			}	
				continue;
			}
		}
    	String st = sb.toString();
    	char[] array = st.toCharArray();
    	Arrays.sort(array);
    	System.out.println(array);
    	st = Arrays.toString(array);
    	return st;
    }
}