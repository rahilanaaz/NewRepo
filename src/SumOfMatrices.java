
public abstract class SumOfMatrices {

	public static void main(String[] args) {
		
		int array1[][] = {{100,200},{300,400}};
		int array2[][] = {{500,600},{700,800}};
		
		int result[][] = new int[2][2];
		
		for(int i=0; i<array1.length; i++) {
			for(int j=0;j<array1.length; j++) {
				
				result[i][j] = array1[i][j]+array2[i][j];
				System.out.println(result[i][j]);
			}
		}
		
		

	}

}
