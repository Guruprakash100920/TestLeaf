package Week2.day2;

public class Intersection {

	public static void main(String[] args) {
		 int a[]={4,3,13,5,8,6}; 
		 int b[]={1,2,4,6,8,9};
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<b.length;j++)
			 {
				 if(a[i]==b[j])
				 {
					 System.out.println("the Intersection numbers are: " +a[i]);
				 }
			 } 

	}

	}

}
