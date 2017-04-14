package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {   //금액 배열을 사용하면 편하다. 왜? 반복되는 작업을 발견하였기 때문에.
		
	  final int[]  money = {50000,10000,5000,1000,500,100,50,10,5,1};  	  
	  Scanner scanner = new Scanner(System.in);  
	  int input = scanner.nextInt();
	  int mok=0;
	  
	  System.out.println("금액: "+ input);
	  
	  while(true)
	  {
		  for(int k = 0; k<money.length; k++)
		  {
			  	mok = input/money[k];
		  		input -= mok * money[k];
		  	  System.out.println(money[k]+"원: " + mok +"개");
		  }
		  if(input == 0)
		  {
			  break;
		  }
	 }
	  scanner.close();
	}
}