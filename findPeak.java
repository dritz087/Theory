

public class findPeak {
	
	
	public int findPeak(int array[], int start, int end){
		
		int i = (int)((start + end)/2);
		if(end - start == 1){
			if(start == 0){
				return start;
			}
			else return end;
		}
		if(array[i]<array[i-1]){
			return findPeak(array, start, i);
		}
		else if(array[i]<array[i+1]){
			return findPeak(array, i, end);
		}
		else{
			return i;
		}
		
	}
}
