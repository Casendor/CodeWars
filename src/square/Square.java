package square;

public class Square {    
    public static boolean isSquare(int n) {
    	boolean isSquare = false;
    	if(n == 0)
    		return true;
    	for (long i = 0; i < n; i++) {
			if(i * i == n) {
				isSquare = true;
			}
		}
        return isSquare;
    }
}