import java.util.Scanner;
public class pallindrome {

public static void main(String palli[])
{
	String a,r="";
	int i,k;
	System.out.print("Enter the word");
	Scanner SC = new Scanner(System.in);
	a=SC.nextLine();
	k=a.length()+1;
	for(i=k-1;i<=0;i--)
	{
		r=r+a.charAt(i);
	}
	if(a.equals(r))
	{
		System.out.println("Pallindrome");
	}
	else
		System.out.print("Not a pallindrome");
	
}
}