package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 12;
		int j = 18;
		int k = 5; //Startwerte

		int min = i;
		int max = i; //Startwerte für min und max

		if (j < min) min = j;
		if (k < min) min = k;

		if (j > max) max = j;
		if (k > max) max = k;

		System.out.println("min = " + min + ", max = " + max);
		}

}
