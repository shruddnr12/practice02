package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);
		
		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
		
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		int length = str.length();
		char[] result = str.toCharArray(); // 깊은 복사를 해준다. 
		
		
		for(int i = 0; i<result.length/2; i++)
		{
			char temp = result[i];
			result[i] = result[length-i-1];
			result[length-i-1] = temp;
		}
		
		
		return result;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println(array);
	}
}
