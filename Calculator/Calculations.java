import java.util.*;

class Calculations{
	int sum(UserInput in){
		System.out.println("Enter the two numbers: ");
       	int[] input_numbers = in.input();

		return input_numbers[0] + input_numbers[1];
	}

	int difference(UserInput in){
		System.out.println("Enter the two numbers: ");

       	int[] input_numbers = in.input();

		return input_numbers[0] - input_numbers[1];
	} 
	int product(UserInput in){

		System.out.println("Enter the two numbers: ");
       	int[] input_numbers = in.input();

		
		return input_numbers[0] * input_numbers[1];
	}

	int division(UserInput in){

		System.out.println("Enter the two numbers: ");
       	int[] input_numbers = in.input();
		if(input_numbers[1] == 0){
			System.out.println("Error: Dividing by zero");
			return 0;
		}
		return input_numbers[0] / input_numbers[1];
	}

	void fibonacci(){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of values to be printed: ");
		
        
        int n = scan.nextInt();
		
		
		int prev = 0;
		int current = 1;

		for(int i = 0; i < n; i++){
			System.out.println(prev);
			int next = prev + current;
			prev = current;
			current = next;
	
		}
		
	}
	
	int modeArray(){
		UserInput in = new UserInput();
		int[] array = in.arrayInput();
		
		int maxCount = 0;
		int mode = array[0];

		for(int i = 0; i < array.length; i++){
			int count = 0;
			for(int j = 0; j < array.length; j++){
				if(array[j] == array[i]){
					count++;
				}
			}
			if(count > maxCount){
				maxCount = count;
				mode = array[i];
			}
		}
		return mode;
	}
	double meanArray(){
		UserInput in = new UserInput();
		int[] array = in.arrayInput();
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}

		return (double)sum/array.length;
		
}
 






}