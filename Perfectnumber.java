/*
*Perfect Number
*/
public class Perfectnumber {
	     
	public static void main(String args[])    
	{  
	int sum=0;  
	int n = 28;           
	int i=1;    
	for(i = 1; i <= n/2; i++ )  
	{  
	if(n % i == 0)  
	{    
	sum = sum + i;  
	}  
	}   
	if(sum==n)  
	{    
	System.out.println("the number is a perfect number."+n);  
	}   
	else  
	System.out.println("the number is not a perfect number."+n);   
	}  
	}  
