package hello;

import java.util.Scanner;

public class code2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int tag=0;
		
		for(int i=2; i<num ;i++) {
			if(num%i == 0) {
				tag = 1;
			}
		}
		if(tag==0) {
			System.out.println("The number "+num+" is prime");
		}
		else {
			System.out.println("The number "+num+" is not prime");
		}

	}

}
