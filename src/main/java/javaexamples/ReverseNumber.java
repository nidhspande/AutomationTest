package javaexamples;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=143;
		int reversenum=0;
		while( num !=0)
		{
			reversenum = reversenum *10;
			reversenum = reversenum +num%10;
			num = num/10;
			System.out.println("Reverse of input number is : "+reversenum);
		}
	}

}
