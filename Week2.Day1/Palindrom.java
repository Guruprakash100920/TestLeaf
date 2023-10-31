package Week2.day1;

public class Palindrom {

	public static void main(String[] args) {
		int num = 12321;
		int rev = 0;
		int copy = num;
		while (num > 0)
		{
			int t = num%10;
			rev = rev * 10+t;
			num = num/10;
			
		}
         if (copy ==rev)
        	 System.out.println("Palindrom");
         else
        	 System.out.println("not a Palindrom");
	}

}
