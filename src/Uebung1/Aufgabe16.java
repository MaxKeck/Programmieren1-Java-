package Uebung1;
import java.util.Scanner;


public class Aufgabe16 {
// Aufgabe 1.6

		public static void main(String[] args) {
	        int L, B, F, U, KF;
	        double R;
	 
	        Scanner Eingabewert = new Scanner(System.in);
	        
	        //Rechteck
	        System.out.print("Geben Sie die Laenge L ein (in cm): ");
	        L = Eingabewert.nextInt();
	        System.out.print("Geben Sie die Breite B ein (in cm): ");
	        B = Eingabewert.nextInt();
	        F = L * B;
	        U = 2 * L + 2 * B;
	        System.out.println("Der Umfang des Rechtecks ist: " + U + " cm");
	        System.out.println("Die Flaeche des Rechtecks ist: " + F + " cm^2");
	        
	        //Kreis
	        System.out.println("Der Radius des Kreises ist: ");
	        R = Eingabewert.nextInt();
	        KF = (int)(R  * R * Math.PI) ;
	        System.out.println("Die Flaeche des Kreises ist: " + KF + " cm^2");
		}     
	    

}
