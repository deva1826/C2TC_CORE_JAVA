package assigment1;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the name:");
		String name=s.nextLine();
		
		System.out.println("enter the reg:");
		long no=s.nextLong();
		
		System.out.println("enter the grade:");
		char grade=s.next().charAt(0);
		
		System.out.println("enter the percentage:");
		float per=s.nextFloat();
		
		System.out.println(name);
		System.out.println(no);
		System.out.println(grade);
		System.out.println(per);
	}

}
