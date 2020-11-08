import java.util.*;
public class quiz_1 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		//declare the variable
		double feet, inches, weight;
		
		System.out.print("Input the inches : ");
		inches = in.nextDouble();
		System.out.print("Input the feet : ");
		feet = in.nextDouble();
		
		//calculate for female and male
		System.out.println("Female weight is " +(40+(5*feet))+ " kg");
		System.out.println("Male weight is " +(50+(5*feet))+ " kg");
	}

}
