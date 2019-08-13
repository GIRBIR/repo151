package average;
import java.util.Scanner;
 
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float avg;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter subject1 marks");
		int n1=scan.nextInt();
		System.out.println("enter subject2 marks");
		int n2=scan.nextInt();
		System.out.println("enter subject3 marks");
		int n3=scan.nextInt();
		System.out.println("enter subject4 marks");
		int n4=scan.nextInt();
		System.out.println("enter subject5 marks");
		int n5=scan.nextInt();
		avg=(n1+n2+n3+n4+n5)/5;
		if(avg>=75) {
			System.out.println("student is pass");
		}
		
		else {
			System.out.println("student is fail");
		
			
			
			
		}

	}

}
