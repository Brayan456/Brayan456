public class estudio{
	public static void main(String[] args) {
		int[][] matriz=new int[5][5];
		int contador=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				matriz[i][j]=contador+1;
			}
			contador=contador+1;
		}
		
	}
	
	/*public void recursiva(int matriz) {
		if(i==0) {
			
		}
		
				
		
	}*/
}