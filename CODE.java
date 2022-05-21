package loan;
import java.util.*;
public class loans {
	String name;                                                      // USING PUBLIC CLASS loans FOR LOAN AND EMI CALCULATIONS
	float reqiured;
	float interest;      //CREATING A JAVA CLASS
	float duration;
	float monthlyemi;
	float totalloan;
	loans(String s,float req,float inte,float dura){                 //JAVA CONSTRUCTOR
		this.name=s;
		this.reqiured=req;
		this.interest=inte;                                           //DECLARING class loans elements.
		this.duration=dura;
		this.totalloan=((req*inte)/1200)*dura+req;
		this.monthlyemi=totalloan/dura;
	System.out.print("Congrats! your loan have been approved, on an interest rate of 6.3% your monthly emi is "+monthlyemi+" and your total loan including interest is "+totalloan);
	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our loan services, we provide loans at interest rate of 6.3%");
		System.out.println("Kindly enter your name");
		String s=sc.nextLine();                                              // NAME OF USER
		
		System.out.println("Enter the required amount :");                    // TAKING INPUTS FROM USER.
		float req=sc.nextFloat();                                              //AMOUNT REQUIRED BY USER
		System.out.println("Kindly enter the number of months in which you would llike to pay the emi.");
		float dura=sc.nextFloat();                                             // DURATION (IN MONTHS) FOR PAYMENTS 
		float inte=6.3f;                                                      //DECLARING INTEREST RATE
		loans approved=new loans(s,req,inte,dura);                     // CREATING AN INSTANCE OF CLASS USING JAVA CONSTRUCTOR FOR CLASS loans.
		sc.close();

	}

}
