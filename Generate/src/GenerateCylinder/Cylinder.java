package GenerateCylinder;

import java.util.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the external radius of Cylinder");
		
		int R1=in.nextInt();
		
		System.out.println("Enter the internal radius of Cylinder");
		
		int R2=in.nextInt();
		
		//considering the origin of Cylinder at origin
		
	System.out.println("Enter the height of Cylinder");
	
	int h=in.nextInt();

	System.out.println("enter the number of point");
	
	int point=in.nextInt();
	
	float[][][] arr= new float [3][point][point];     float [][][] brr=new float[3][point][point];
	

	for(int i=0;i<point;i++) {
		for(int j=0;j<point;j++) {
			
			 double X_angle = Math.toRadians( ThreadLocalRandom.current().nextDouble(360)); 
			 
			 float X_Coordinate1=R1*(float)(Math.cos(X_angle));
			 
			  float X_Coordinate2=R2*(float)(Math.cos(X_angle));
			  
			  arr[0][i][j]=X_Coordinate1;
			  brr[0][i][j]=X_Coordinate2;
			  
			  
			  float Y_Coordinate1=R1*(float)(Math.sin(X_angle));
			  
			  float Y_Coordinate2=R2*(float)(Math.sin(X_angle));
			  
			  arr[1][i][j]=Y_Coordinate1;
			  
			  brr[1][i][j]=Y_Coordinate2;
			  
			
			
			float z=(float)ThreadLocalRandom.current().nextDouble(h+1);
			
			arr[2][i][j]=z;
			brr[2][i][j]=z;
			
			
			
		}
	}
	
     int p=50;
	
	float[][][] base=new float[3][p][p];
	
	
	float [][][] top=new float [3][p][p];
	
	Random rand = new Random(); 
	
	
	
	for(int i=0;i<p;i++) {
		
		for(int j=0;j<p;j++) {
			
			int radius=R2+rand.nextInt(R1-R2);
			
			double X_angle = Math.toRadians( ThreadLocalRandom.current().nextDouble(360)); 
			
			float X_Coordinate=radius*(float)(Math.cos(X_angle));
			
			  float Y_Coordinate=radius*(float)(Math.sin(X_angle));
			  
			  
			 //bottom of the cylinder;
			 base[0][i][j]=X_Coordinate;
			 
			 base[1][i][j]=Y_Coordinate;
			 
			 base[2][i][j]=0;
			 
			 
			 //top of the cylinder
			 top[0][i][j]=X_Coordinate;
			 
			 top[1][i][j]=Y_Coordinate;
			 
			 top[2][i][j]=h;
			  
			  
		}
	}

		
		
		
		
		
		
		
	}

}
