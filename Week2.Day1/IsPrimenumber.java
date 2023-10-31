package Week2.day1;

public class IsPrimenumber {

	public static void main(String[] args) {
		int num=3;
        int check=0;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                check++;
                break;
            }
        }
        if(check==0)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
	}

}
