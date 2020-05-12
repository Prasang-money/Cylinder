package Container;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateEllipsoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		System.out.println("Enter the value of all three axis of Ellipsoid: 1-A:\n2-B:\n3-C:");
		
		Scanner in=new Scanner(System.in);
		
		int a=in.nextInt();
		
		int b=in.nextInt();
		
		int c=in.nextInt();
		
	int point=100;
	
		float[][][] array=new float[3][point][point];
		
		
		for(int i=0;i<point;i++) {
			
			for(int j=0;j<point;j++) {
				
				
				 double Z_angle =  Math.toRadians( ThreadLocalRandom.current().nextDouble(181));
			        
			        double X_angle = Math.toRadians( ThreadLocalRandom.current().nextDouble(360)); 
			        
			        
			        float X_Coordinate=a*(float)(Math.sin(Z_angle)*Math.cos(X_angle));
			        
			        
			           array[0][i][j]=X_Coordinate;
			           
			        float Y_Coordinate=b*(float)(Math.sin(Z_angle)*Math.sin(X_angle));
			         
			         array[1][i][j]=Y_Coordinate;
			         
			        
			         float Z_Coordinate=c*(float)(Math.cos(Z_angle));
			         
			            array[2][i][j]=Z_Coordinate;
			            
			            
			}
		}
		
		SurfaceVO obj=new SurfaceVO(array);
		obj.print();
		
		
		
	}

}
