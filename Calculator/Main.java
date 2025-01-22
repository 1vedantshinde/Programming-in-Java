import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		System.out.println("Choose an Operation: ");
		System.out.println("1. Addition: ");
		System.out.println("2. Subtraction: ");	
		System.out.println("3. Multiplication: ");
		System.out.println("4. Division: ");
		System.out.println("5. Fibonacci: ");
		System.out.println("6. Mode of an Array");
		System.out.println("7. Mean of an Array");

		
		Scanner scan = new Scanner(System.in);
		Calculations calc = new Calculations();
		UserInput in = new UserInput();
		int choice = scan.nextInt();
		

		if(choice == 1){
			System.out.println("Result: "+calc.sum(in));
		}else if(choice == 2){
			System.out.println("Result: "+calc.difference(in));
		}else if(choice == 3){
			System.out.println("Result: "+calc.product(in));
		}else if(choice == 4){
			System.out.println("Result: "+calc.division(in));
		}else if(choice == 5){
			calc.fibonacci();

		} else if(choice == 6){
			System.out.println("Mode: "+calc.modeArray());
		}else if(choice == 7){
			System.out.println("Mean: " + calc.meanArray());
		}else{
			System.out.println("Invalid Choice");
		}
		
	}
}