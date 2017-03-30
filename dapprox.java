
import java.util.Scanner;


/*
this method convert any number with floating point to the nearest 
decimal number and it's also static , to call it write Dapprox(any number);

**/

class dapprox{
	
	static int Dapprox(double a){
		int x;
		double y;
		y=a%1*10;
		y=(int) y;
		if (y>=5){
			a+=1;
			x=(int) a;
			System.out.println(x);
			return (x);
		}else if(y<5){
			x=(int) a;
			System.out.println(x);
		return x;
		}
		return 0;
	}
	




	
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter the number to approximation :");
		double a = in.nextDouble();
			
		 
		 	Dapprox(a);
	}
}
