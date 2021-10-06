/*
*fibanocci series
*/
public class fibanocci {
public static void main(String[] args) {
	
     int number1 = 0;
     int number2 = 1;
     int sum;
     int total = 10;

     System.out.print(number1);

     for(int i=1;i<total-1;++i){
 
       System.out.print(" " + number2);
       sum = number1 + number2;
       number1 = number2;
       number2 = sum;   
}
}
}
