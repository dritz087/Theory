

public class Peak2D {
	
	
	public int[] findPeak(int array[][], int col, int row){
		int arr[] = new int[2];
		
		int search = (int)col/2;
		int max = array[search][0];
		int ycord = 0;
		
		for(int i = 0; i<row-1;i++){
			if(array[search][i] > max){
				max = array[search][i];
				ycord = i;
			}
		}
		
		if(col == 1){
			arr[0]= search;
			arr[1]= ycord;
			return arr;
		}
		
		if(max < array[search-1][ycord]){
			return findPeak(array, search, row);
		}else if(max< array[search+1][ycord]){
			return findPeak(array,(search+col),row);
		}
		else{
			arr[0] = search;
			arr[1] = ycord;
			return arr;
		}
		
		
		
		
		
	}
}
