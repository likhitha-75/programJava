package practice;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]={1,2,3,4,5};
		int beg=0;
		int end=a.length-1;
		while(beg<end){
			int temp=a[beg];
			a[beg]=a[end];
			a[end]=temp;
			beg++;
			end--;
		}
		
		System.out.println("reversed array is"+Arrays.toString(a));
		
		
		 

	}

}
