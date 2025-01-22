import java.util.*;

class UserInput{
	

	int[] input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int first_number = scan.nextInt();

        System.out.println("Enter the Second Number: ");
        int second_number = scan.nextInt();

        
        return new int[]{first_number, second_number};
    }

	int[] arrayInput(){

		int[] array = new int[5];

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 Numbers: ");

		for(int i=0; i < array.length; i++){
			array[i] = scan.nextInt();
		}
		return array;
	}

}