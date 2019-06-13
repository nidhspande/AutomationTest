package javaexamples;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 60 };
		int sum = 0;
		for (int num : array) {
			sum = sum + num;
		
		}System.out.println("sum of array element is : " + sum);
		
		
	}

}
