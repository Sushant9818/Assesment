package assesment;
import java.util.Scanner; 
public class smallcalculator {

	

	public static void main(String[] args) {
		int a=10,b=2 ,c;
		  Scanner scan = new Scanner(System.in);
	        System.out.println("Enter Number: ");
	        int choice = scan.nextInt(); 
		switch (choice) {
		  case 1:
			  c=a+b;
		    System.out.println("Addtion of a and b :"+ c);
		    break;
		  case 2:
			  c=a-b;
		    System.out.println("Substraction of a and b:"+c);
		    break;
		  case 3:
			  c=a*b;
			    System.out.println("multification of a and b:"+c);
			    break;
		  case 4:
			  c=a/b;
			    System.out.println("division of a and b:"+c);
			    break;
		}

	}

}
