
public class LinearSearch2 {
	public static void main(String args[]){
		int array2d[][]=new int[100][100];
		long startTime = System.currentTimeMillis();
		int temp = 1;
		
		for(int r = 0; r<100;r++){
			for (int c = 0; c<100;c++){
				array2d[r][c] = temp +1;
				temp++;
			}
		}
		
		for(int i = 1; i<99;i++){
			for(int j = 1;j<99;j++){
				if(array2d[i][j] > array2d[i+1][j] && array2d[i][j] > array2d[i][j+1] && array2d[i][j] > array2d[i+1][j] && array2d[i][j] > array2d[i-1][j]){
					 System.out.println("There is a peak at [" + i + "," + j + "] and the value is :" + array2d[i][j]);
					}	
			}
		}
		
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("\n\nThe program ran in "+ totalTime+" millisecends");
		
	}
}
