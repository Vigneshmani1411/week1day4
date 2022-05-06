package week1.day4;

public class Sumofdigits4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input = 123;
int sum =0;
int rem;
while (input>0) {
	rem = input % 10;
	sum = sum + rem ;
	input = input / 10;
}
System.out.println("input"+ input);
System.out.println("sum" + sum);
	}
}
