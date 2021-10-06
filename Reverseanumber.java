/*
*Reverse a number
*/
public class Reverseanumber {
public static void main(String[] args) {
	int n =28;
	int reverse = 0;
	while(n>0) {
		int rem =n % 10;
		reverse = (reverse * 10) + rem;
		n=n/10;
	}
    System.out.println("the reverse number is :" +reverse);
}
}
