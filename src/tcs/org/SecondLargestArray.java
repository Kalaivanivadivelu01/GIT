package tcs.org;

public class SecondLargestArray {
public static void main(String[] args) {
	int temp;
	int[] a= {1,2,56,77,88,99};
	
	 
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			
			if (a[i]>a[j]) {
				 temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		
		
	}
	
	System.out.println(a[a.length-3]);
}
}
