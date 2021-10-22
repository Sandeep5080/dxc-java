package basic;

import java.util.Scanner;

public class SubTwoNumbers {
	public static void main(String[] args) {
        
        int num1, num2, Sub;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        
        Sub = num1 - num2;
        System.out.println("Sub of these numbers: "+Sub);

}
}



