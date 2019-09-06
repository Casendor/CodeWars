package expandedForm;

public class Kata {
	public static void main(String[] args) {
		String str = expandedForm(132);
		System.out.println("String es: " + str);
	}

	public static String expandedForm(int num) {
		String temp = Integer.toString(num);
		String numeroFinal = "";
		int[] arrayNum = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			arrayNum[i] = temp.charAt(i) - '0';
		}
		for (int i = 0; i < arrayNum.length; i++) {
			if (arrayNum[i] == 0) {
				continue;
			}
			System.out.println(arrayNum[i]);
			System.out.println(Math.pow(10, arrayNum.length-i-1));
			if(numeroFinal == "")
				numeroFinal = "" + (int)(arrayNum[i] * Math.pow(10, arrayNum.length-i-1));
			else
			numeroFinal = numeroFinal + " + " + (int)(arrayNum[i] * Math.pow(10, arrayNum.length-i-1));
		}
		return numeroFinal;
	}
}
