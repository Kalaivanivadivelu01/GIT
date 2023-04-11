package tcs.org;

public class FirstLargest {
public static void main(String[] args) {
	int[] a= {1,56,897,9886,5};
	int maxnum=a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i]>maxnum ){
			maxnum=a[i];
			
		}
		
	}
	System.out.println(maxnum);
}
}
