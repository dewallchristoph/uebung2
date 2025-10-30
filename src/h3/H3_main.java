package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 140;
		int j = 150;
		int k = -10;

		// Ausdrücke laut Aufgabe
		boolean e1 = (i > j);
		boolean e2 = (i > 200);
		boolean e3 = (j > 100);

		// Kombinationslogik
		if (e1 && !e2 && !e3) {
			k = 1;
		} else if (e1 && e2 && !e3) {
			k = 2;
		} else if (e1 && e2 && e3) {
			k = 3;
		} else if (!e1 && !e2 && !e3) {
			k = 4;
		} else {
			k = -10; // alle übrigen Kombinationen
		}

		System.out.println("i=" + i + ", j=" + j + "  ->  k=" + k);

	}
}
