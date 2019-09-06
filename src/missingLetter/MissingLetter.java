package missingLetter;

public class MissingLetter {

	public static void main(String[] args) {
		char c[] = {'a', 'b', 'c', 'e'};
		char b = 'b';
		char d = 'c';
		System.out.println("this is the value of b: " + (int)b + " this is the value of c: " + (int)d);
		char a = findMissingLetter(c);
		System.out.println(a);
	}

	public static char findMissingLetter(char[] array) {
		char actual;
		{
			for (int i = 0; i < array.length; i++) {
				actual = array[i];
				if ((int)array[i+1] != (int)actual+1) 
						return (char) ((char)(int)actual+1);
			}
			return ' ';
		}
	}
}