import java.util.Scanner;
public class countNumberOfCents {
		static Scanner console = new Scanner(System.in);
	
		public static void main(String[] args) {	//CONTA IL NUMERO DI QUARTI DI DOLLARO DI RESTO 
			System.out.print("How many cents ?");
			int numberCents = console.nextInt();
			int check = countQuarters(numberCents);
			System.out.println("Number of quarter of dollars you have now: " + check);
		}
		
			public static int countQuarters(double cents) {
				double centesimi = cents / 100;
				double dollar = Math.floor(centesimi);
				double newcents = centesimi - dollar;
				int passo2 = (int)(newcents * 100);
				int answer = passo2 / 25;
				return answer;
				
			}
	}	


