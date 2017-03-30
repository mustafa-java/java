
import java.util.Scanner;
/*
 * this program show the magic of math 
 * the magic square i made it for 4x4 matrix
 * and this way i was use i think it probable
 * work with 8x8 
 * 
 */


public class class2 {
		
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int x=01;
		int[][] ad =new int[4][4];
		for(int u=0;u<4;u++){
			for(int i=0;i<4;i++){
				ad[i][u]=x;
			x++;}
		}
		for(int u=0;u<4;u++){
			for(int i=0;i<4;i++){
				if(ad[i][u]<10)
			System.out.print(" ");
		
					
			System.out.print(ad[i][u]+" ");
			}
		System.out.println();

		}System.out.println();
		
		x=ad[1][0];
		ad[1][0]=ad[2][3];
		ad[2][3]=x;
		x=ad[2][0];
		ad[2][0]=ad[1][3];
		ad[1][3]=x;
		x=ad[0][1];
		ad[0][1]=ad[3][2];
		ad[3][2]=x;
		x=ad[0][2];
		ad[0][2]=ad[3][1];
		ad[3][1]=x;
		
		int sum=0;
		for(int u=0;u<4;u++){
			for(int i=0;i<4;i++){
				if(ad[i][u]>10)
					System.out.print(ad[i][u]+" ");
				else
				System.out.print(ad[i][u]+" ");
			if(ad[i][u]<10)
				System.out.print(" ");
				sum+=ad[i][u];
			
			}
			System.out.print(" ---"+ sum);
			System.out.println(); sum=0;
		}
	
		
		
		
		
		
		
		
	}

}