package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {  //무한루프 안에 if문에 break를 넣어 만들어 보자. 
		
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		int k = r.nextInt(100)+1;
		int max =100;
		int min =1;
		int count =1;
		int goal = 0;
		
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		
		while(true){
			System.out.println(min + "-" + max);
			System.out.print(count + ">>");
			goal = scanner.nextInt();
			
			
			 if(goal>k)
			 {
				 System.out.println("더 낮게");
				 max = goal;
			 }
			 else if (goal < k)
			 {
				System.out.println("더 높게");
				min = goal;
			 }
			 else			
			 {
					System.out.println("맞았습니다");
					System.out.println("다시하시겠습니까?(y/n)");
					String answer = scanner.next();
					if(answer.equals("y"))
					{
						 k = r.nextInt(100)+1;
						 max =100;
						 min =1;
						 count =1;
						 goal = 0;
					}
					else if(answer.equals("n"))
					{
						break;
					}
			 }
		}
		
		scanner.close();
	}

}