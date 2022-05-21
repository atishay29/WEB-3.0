package loan;
import java.util.*;
public class loans {
	public static class record{
		String name;
	float reqiured;
	float interest;      //CREATING A JAVA CLASS
	float duration;
	float monthlyemi;
	float totalloan;
	record(String s,float req,float inte,float dura){                 //JAVA CONSTRUCTOR
		this.name=s;
		this.reqiured=req;
		this.interest=inte;
		this.duration=dura;
		this.totalloan=((req*inte)/1200)*dura+req;
		this.monthlyemi=totalloan/dura;
	System.out.print("Congrats! your loan have been approved, on an interest rate of 6.3% your monthly emi is "+monthlyemi+" and your total loan including interest is "+totalloan);
	
	}
	}
	
	
		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our loan services, we provide loans at interest rate of 6.3%");
		System.out.println("Kindly enter your name");
		String s=sc.nextLine();                             //TAKING NAME OF APPLICANT
		
		System.out.println("Enter the required amount :");
		float req=sc.nextFloat();                           // TAKING REQUIRED AMOUNT
		System.out.println("Kindly enter the number of months in which you would llike to pay the emi.");
		float dura=sc.nextFloat();                            //TAKING DURATION OF LOAN
		float inte=6.3f;                                       //DECLARING INTEREST RATE
		record approved=new record(s,req,inte,dura);                          // CREATING INSTANCE OF MAIN CLASS
		              //  USING JAVA CONSTRUCTOR FOR CLASS record.
		sc.close();

	}

}
