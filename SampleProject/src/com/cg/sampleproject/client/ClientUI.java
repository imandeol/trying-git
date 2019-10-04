package com.cg.sampleproject.client;

import java.util.Scanner;

import com.cg.sampleproject.server.ServerLogic;

public class ClientUI {
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);  					 //Scanner definition for user input
	System.out.println("Enter the required integer: ");
	
	int userNumber= input.nextInt();								//User Input of number
	
	ServerLogic numberValidate= new ServerLogic();
	numberValidate.checkInput(userNumber);
	
	input.close();
	
	ServerLogic fibonacciCreate= new ServerLogic();							//Object for creation of Fibonacci Series
	
	double fiboSeries[]= fibonacciCreate.fibonacciCalc(userNumber);
	
	for(int i=0;i<userNumber;i++){
		System.out.print(fiboSeries[i]+"\t");
	}    
	System.out.println();											//moving to next armstrong part
	
	ServerLogic finalCheck= new ServerLogic(); 								//Object declaration for armstrong check
	
	int output;
	
	if(userNumber<6){
		System.out.println("Length is less than 5. Program ends!");
	}
	else{
		System.out.println("Armstrong Number check started");
		for(int i=5;i<=10;i++){													//Armstrong check for index 5 to 10
			if(i<userNumber){
				output= finalCheck.armstrongCheck(fiboSeries[i]);  					//Call for Armstrong number check function of number
				if(output==1)
				System.out.println("Index "+i+"- "+ fiboSeries[i] + ":\tCube Number checked- " + Math.pow(fiboSeries[i], 3) +"\t is an Armstrong Number"); 
				else
					System.out.println("Index "+i+"- "+ fiboSeries[i] + ":\tCube Number checked- " + Math.pow(fiboSeries[i], 3) +"\t is not an Armstrong Number"); 	
			}
			else{
				System.out.println("Index "+i+"\t Not Correct");		//If index ends before 10, then not applicable prints
			}
		}
	}
	System.out.println("Program end here. Thank you!");
	} 																			//End of Main
}																				//End of Class
