package Uebung1;

public class Aufgabe15 {
// Aufgabe 1.5
	public static void main(String[] args) {
		String meineZeichenkette = "cdde";
		
		if(meineZeichenkette.length() < 5 || meineZeichenkette.length() > 9){
			System.out.println(meineZeichenkette);
		}
		if(meineZeichenkette.length() > 4 && meineZeichenkette.length() < 10){
			if(meineZeichenkette.startsWith("a")){
				System.out.println(meineZeichenkette.substring(1, 2));
			}
			else{
				if(meineZeichenkette.startsWith("cd")){
					System.out.println("cd");
				}
				else{
					if(meineZeichenkette.startsWith("c")){
						int i = meineZeichenkette.length() - 1;
						System.out.println(meineZeichenkette.charAt(i));
					}
					else{
						System.out.println(meineZeichenkette);
					}
				}
			}
		}
	}

}
