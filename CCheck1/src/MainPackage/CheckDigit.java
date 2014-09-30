package MainPackage;

import java.util.Scanner;

public class CheckDigit {
	
	public static void main(String[] args){
		String creditnumber;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Credit Card Number: ");
		creditnumber = input.nextLine();
		

		
		long FirstSum = 0;
		int  SecondSum = 0;
		for (int i=creditnumber.length()-2; i>=0; i-=2  ){
	    	int get_second =2* Character.getNumericValue(creditnumber.charAt(i));
		    	String sum_doubled= Integer.toString(get_second);
		    	
			    for (int j=0; j<sum_doubled.length(); j++  ){
			    	int get_second2 = Character.getNumericValue(sum_doubled.charAt(j));
			    	FirstSum += get_second2;
			    }
		    }
	    
	    for (int i=creditnumber.length()-1;i>=0;i-=2){
	    	SecondSum = SecondSum + Character.getNumericValue(creditnumber.charAt(i));
	  }
	    int total = (int) (FirstSum+SecondSum);

	    if (total%10==0){
	    System.out.println("Valid for Credit Card #" + creditnumber);
	    }   	  
		
	else{
	    System.out.println("Invalid Credit Card #" + creditnumber );

		}
	}
	
}