package bsort;
import java.util.*;
import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		
		Random rand = new Random();
		System.out.println("How many elements do you want");
	
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i ++) {
			numbers[i] = rand.nextInt(10000);
		}
		System.out.println("Before");
		System.out.println(Arrays.toString(numbers));
		boolean swap = true;
		while(swap) {
			swap = false;
			for(int i = 0; i < numbers.length-1; i++) {
				if(numbers[i] > numbers[i + 1]) {
					swap = true;
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
				
				}
			}
		}
		System.out.println("After");
		System.out.println(Arrays.toString(numbers));
		
		
	
	}

}
