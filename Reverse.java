package practice;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.next();
		String s2="";
		for(char x:s1.toCharArray()) {
			s2=x+s2;
		}
		System.out.println("reversed string is:"+s2);

	}

}
