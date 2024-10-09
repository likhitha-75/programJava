package practice;
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int i=1,res;
		while(i<=10) {
			res=n*i;
			System.out.println(n+"*"+i+"="+res);
			
		}

	}

}
