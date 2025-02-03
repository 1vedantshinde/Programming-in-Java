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

		System.out.println("Even array is"+even);
		System.out.println("Odd array is"+odd);
		
		

	}
	//Find out the difference between two consecutive elements in an array and return the index values of the elements which give the smallest difference

	void consecutiveDifference(){
		UserInput in = new UserInput();
		int[] array = in.arrayInput();
		
		if(array.length < 2){
			System.out.println("Array must have at least two elements");
			return;
		}

		ArrayList<Integer> difference = new ArrayList<Integer>();


		for(int i = 0; i < array.length - 1; i++){
			difference.add(Math.abs(array[i] - array[i+1]));
			
		}

		display(difference);
		int mindiffIndex = 0;
		int minDiff = difference.get(0);

		System.out.print("Index: ");
		for(int a = 0; a < difference.size(); a++){
			if(difference.get(a) == minDiff){
				System.out.println((a+1) + " ");
			}
		}
		System.out.println();
		
	}

	void convert(){

		System.out.println("Enter array to be converted");
		UserInput in = new UserInput();
		int[] array = in.arrayInput();

		

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int num : array){
			arrayList.add(num);
		}
		display(arrayList);
	}
}