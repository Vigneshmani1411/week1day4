package week1.day4;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 100;
		int originalNumber =input;
		int sum=0;
		while (input>0) {
		int rem = input % 10;
			 sum= sum + (rem*rem*rem) ;
			input = input / 10;
			
		}
			if(sum ==originalNumber) {
				System.out.println("Armstrong Number");
			}else {
				System.out.println("Not a armstrong number");
			}
			
			
	}

}
