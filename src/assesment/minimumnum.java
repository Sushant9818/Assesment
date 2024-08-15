package assesment;
import java.util.Scanner; 
public class minimumnum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int Firstnumber = scan.nextInt(); 
        System.out.println("Enter Second Number: ");
        int Secondnumber = scan.nextInt(); 
        System.out.println("Enter Third Number: ");
        int Thirdnumber = scan.nextInt(); 
        System.out.println("First number is" + Firstnumber);
        System.out.println("Second number is" + Secondnumber);
        System.out.println("Second number is" + Thirdnumber);
        
        if(Firstnumber<Secondnumber && Firstnumber<Thirdnumber) {
        	System.out.println("The First Number is Smallest"+ Firstnumber);
        }
        if(Secondnumber<Firstnumber && Secondnumber<Thirdnumber) {
        	System.out.println("The Second Number is Smallest" + Secondnumber);
        }
        if(Thirdnumber<Firstnumber && Thirdnumber<Secondnumber) {
        	System.out.println("The Third Number is Smallest" + Thirdnumber );
        }
        
	}

}
