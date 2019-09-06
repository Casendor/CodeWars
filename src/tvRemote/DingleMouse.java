package tvRemote;

public class DingleMouse {

	public static void main(String[] args) {
		int steps = tvRemote("");
		System.out.println(steps);
	}

	public static int tvRemote(final String word) {
		char[][] teclado = { { 'a', 'b', 'c', 'd', 'e', '1', '2', '3' }, { 'f', 'g', 'h', 'i', 'j', '4', '5', '6' },
				{ 'k', 'l', 'm', 'n', 'o', '7', '8', '9' }, { 'p', 'q', 'r', 's', 't', '.', '@', '0' },
				{ 'u', 'v', 'w', 'x', 'y', 'z', '_', '/' } };
		System.out.println(teclado[0].length);
		int steps = 0;
		int position[] = {0,0};
		for (int i = 0; i < word.length(); i++) {
			char letra = word.charAt(i);
			for (int fila = 0; fila < teclado.length; fila++) {
				for (int columna = 0; columna < teclado[fila].length; columna++) {
					if(letra == teclado[fila][columna]) {
						steps = steps + (Math.abs(position[0] - fila)) + (Math.abs(position[1] - columna )) + 1 ;
						position[0] = fila;
						position[1] = columna;
						//System.out.println("posiciones: " + position[0] + position[1]);
					}
				}
			}
		}
		return steps;
	}

}