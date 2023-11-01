package Week2.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int a[]= {2,5,4,1,7,3,8};
		Arrays.sort(a);
		/* for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		} */
		
		int n=a.length;
		int sum=(n+1)*(n+2)/2;
		for(int j=0;j<a.length;j++) {
			sum=sum-a[j];			
		}
		System.out.println("Missing Element: " + sum);

	}

}
