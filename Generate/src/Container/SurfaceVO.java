package Container;

public class SurfaceVO {
	
    private float[][][] Surface3DXYZ=new float[3][100][100];
    
    public SurfaceVO(float[][][] Surface3DXYZ) {
    	
    	
    	this.Surface3DXYZ=Surface3DXYZ;
    }
    
    public void print() {
    for(int i=0;i<100;i++) {
    	
    	for(int j=0;j<100;j++) {
    		
    		System.out.println(Surface3DXYZ [0][i][j]+" , " +Surface3DXYZ [1][i][j] + " , "+ Surface3DXYZ [2][i][j]);
    	}
    }
    }   

}
