package de.unistuttgart.iaas.pse.ex03.p1;

public class GeometryFunctions {
	/**
	 * Aufgabe 1 a) Anfang Berechnung des Fl�cheninhalts eines Kreises mit dem
	 * Radius r.
	 * 
	 * @param radius
	 * @return fl�che oder bei negativem radius -1.
	 */
	public static double computeCircleArea(double r) {
		if (r >= 0) { // wenn radius gr��er gleich null wir der Fl�cheninhalt
						// berechnet
			double fl�che = Math.PI * (r * r);// Math.PI gibt einem Pi zur�ck,
												// danach wird Pi mit r�
												// Multipliziert.
			return fl�che;
		} else { // sonst wird -1 zur�ckgegeben.
			return -1;
		}
	}

	// Aufgabe 1 a) Ende
	/**
	 * Aufgabe 1 b) Anfang
	 * 
	 * @param ankathete
	 * @param gegenkathete
	 * @return hypotenuse oder -1 wenn a oder b kleiner null
	 */
	public static double pythagorenTheorem(int a, int b) {
		if (a >= 0 && b >= 0) { // wenn keiner der beiden Werte negativ ist ,
								// wird der Fl�cheninhalt berechnet
			double hypotenuse = Math.hypot(a, b);
			return hypotenuse;
		} else { // sonst wird minus 1 zur�ckgegeben
			return -1;
		}

	}
	// Aufgabe 1 b) Ende
	public static void main(String[] args) {
		// To test
		System.out.println(computeCircleArea(-1));
		System.out.println(computeCircleArea(3));
		System.out.println(pythagorenTheorem(2, 3));
	}

}
