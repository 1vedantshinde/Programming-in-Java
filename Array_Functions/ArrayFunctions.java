//ArrayFunctions.java

import java.util.*;
import java.lang.Math;

class ArrayFunctions{
		
	void display(ArrayList<Integer> array){
		System.out.println("Array is: "+array);
	}

	void evenOdd(){
		UserInput in = new UserInput();
		int[] array = in.arrayInput();

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		
		for(int i = 0; i < array.length; i++){
			if(array[i] % 2 == 0){
				even.add(array[i]);
			}
			else{
				odd.add(array[i]);
			}
		}

		//System.out.println("Even array is"+even);
		//System.out.println("Odd array is"+odd);
		
		display(even);
		display(odd);

	}
	//Find out the difference between two consecutive elements in an array and return the index values of the elements which give the smallest difference

	void consecutiveDifference(){
		UserInput in = new UserInput();
		int[] array = in.arrayInput();
		
		ArrayList<Integer> difference = new ArrayList<Integer>();


		for(int i = 0; i < 4; i++){
			difference.add(array[i] - array[i+1]);
			
		}

		display(difference);
		int mindiff;
		for(int a = 0; a < 4; a++){
			if(difference[a] < difference[a+1]){
				mindiff = a;
}
		System.out.println(mindiff);
}
		
}
}