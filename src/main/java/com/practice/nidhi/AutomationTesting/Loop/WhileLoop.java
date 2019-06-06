package com.practice.nidhi.AutomationTesting.Loop;

public class WhileLoop {

	public static void main(String[] args) {
		
	Printer(1);	
  
	}
	
	
	
	public static void Printer(int i)
	{
		while (i < 1000) {
			System.out.println(i);
			i = i + 1;
		}
	}

}
