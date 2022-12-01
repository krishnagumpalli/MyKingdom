import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str,rev ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check:");
        str = sc.nextLine();
        int n = str.length();
        for(int i = n-1;i>=0;i--) {
            
        	rev = rev+str.charAt(i);
        }
        System.out.println("Let's see whether the string is palindrome or not!!!");
        if(str.equals(rev)) {
    
        	System.out.println(str+" is a palindrome"); //str is a palindrome
        }
        else {
        	System.out.println(str+" is not a palindrome"); //str is not a palindrome
        
        }
        }
	}