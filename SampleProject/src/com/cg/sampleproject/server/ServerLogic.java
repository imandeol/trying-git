package com.cg.sampleproject.server;

import java.util.Scanner;

public class ServerLogic {									
	public void checkInput(int input){						//Input validate Function
		Scanner	scan= new Scanner(System.in); 				//Scanner for the particular function
		if(input>30 || input<0){
			do{	System.out.println("Error! Print number between 0 & 30");
				input= scan.nextInt();
			}while(input > 30 || input < 0);			// Check of number between 0 and 30
		}
		scan.close();
	}								//End of checkInput function
	
	public double[] fibonacciCalc(int value){				//Fibonacci Create function
		double fibArray[] = new double[value];
		fibArray[0]= 0.0;
		fibArray[1]= 1.0;
		for( int i=2;i<value;i++){
			fibArray[i]= fibArray[i-1]+ fibArray[i-2];			//Fibonacci Creation Logic
		}
		return fibArray;
	}						// end of fibonacciCalc function
	
	public int armstrongCheck(double numberCheck){		//armstrong Check function
		int result= 0;
		numberCheck= Math.pow(numberCheck, 3);
		int numDigits=0;
		double tmp= numberCheck;
		while(tmp>0){
			tmp=tmp/10;
			numDigits++;  //Counting number of digits
		}
		
		double sumNumber= 0.0;
		double value= numberCheck;
		
		while (value>0.0){
			double remainder= value%10;
			value= value/10;
			sumNumber += Math.pow(remainder, numDigits); // Armstrong Number definition
		}
		if(sumNumber==numberCheck)
			result= 1;
		return result; 			//Final return of the answer
	}									//End of armstrongCheck function
}										//End of class
