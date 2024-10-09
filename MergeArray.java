package practice;

public class MergeArray {

	public static void main(String[] args) {
		int a[]= {89,77,66};
		int b[]= {6,7,8,9,10};
	    int a1=a.length;
	    int b1=b.length;
	    int c1=a1+b1;
	    int c[]=new int[c1];
	    for(int i=0;i<=a.length-1;i++) {
	    	c[i]=a[i];
	    
	    }
	    for(int i=0;i<=b.length-1;i++) {
	    	c[a1+i]=b[i];
	    }
	    System.out.println("merged array is:");
	    for(int i=0;i<=c.length-1;i++) {
	    	System.out.print(c[i]+" ");
	    }
	}

	

}
