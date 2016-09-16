package pkg1;
import java.util.Scanner;
public class FootballPlayerScore {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	

	int ATT;
	int COMP;
	int YDS;
	int TD;
	int INT;
	
	System.out.println("How many passes did you attempt?");
	ATT=input.nextInt();
	
	System.out.println("What was your number of completions?");
	COMP=input.nextInt();
	
	System.out.println("What was your number of passing yards?");
	YDS=input.nextInt();
	
	System.out.println("What was your number of touchdown passes?");
	TD=input.nextInt();
	
	System.out.println("What was your number of interceptions?");
	INT=input.nextInt();
	
	input.close();

	double a = ((COMP/ATT-.3)*5);
	a = (a<0)? 0:((COMP/ATT-.3)*5);
	
	double b = ((YDS/ATT-3)*.25);
	b = (b<0)? 0:((YDS/ATT-3)*.25);
	
	double c = ((TD/ATT)*20);
	c = (c<0)? 0:((TD/ATT)*20);
	
	double d = (2.375-((INT/ATT)*25));
	d = (d<0)? 0:(2.375-((INT/ATT)*25));
	
	double passerRating = (((a+b+c+d)/6)*100);
	
	System.out.print("Your passer rating is "); 
	System.out.printf("%.2f", passerRating);
	System.out.println(".");
		
	
	}
	
}
