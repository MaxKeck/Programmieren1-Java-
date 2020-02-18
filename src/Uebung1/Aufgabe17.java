package Uebung1;

public class Aufgabe17 {
// Aufgabe 1.7
	
	public static void main(String[] args) {
		int a = 4, b = 18, L = 0, R = 0;
		char c = '*';
		
		if(c == '*'){
			L = a * b;
			System.out.println("Die Lösung ist: " + L);
		}
		if(c == '/'){
			L = (int)(a / b);
			System.out.println("Die Lösung ist: " + L);
			if(a % b != 0){
				R = a % b;
				System.out.println("Der Rest ist: " + R);
			}
		}
		if(c == '+' && a > 3){
			L = a + b;
			System.out.println("Die Lösung ist: " + L);
		}
		if(L == 0 && R == 0){
			System.out.println("Bitte geben Sie gültige Werte ein!"); 
		}
	}
}
