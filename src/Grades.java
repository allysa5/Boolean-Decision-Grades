import java.util.Scanner;

public class Grades {
		public static void main (String [] args){
	   System.out.print("Enter your test score:");
	   Scanner scan = new Scanner(System.in); 
			int score = scan.nextInt();
			char grade = 'F';
	
			//I'm not hopeful

			if (score > 95)
			    grade = 'A';
		
			else if (score > 89)
				grade = 'A';
			else if (score > 79)
			    grade = 'C';
			else if (score > 69)
			    grade = 'D';
			else 
			    grade = 'F';
			System.out.print(grade);
			if (score%10 < 3)
				System.out.println("-");
			if (score%10 > 7)
				System.out.println("+");
				

		}
}
