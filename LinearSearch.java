

public class LinearSearch {
	public static void main(String args[]){
	int arr[] = new int[50000000];
	long startTime = System.currentTimeMillis();
	
	for(int i = 0; i < arr.length; i++){
		arr[i] = 1+i;
		
	}
	
	for(int j = 1; j < arr.length-2; j++){
		
		if(arr[j]>= arr[j-1] && arr[j]>= arr[j+1])
			System.out.print("There is a peak at " + j + "\nThe value of the peak is " + arr[j] + "\nThe sides of the peak is " + arr[j-1] + " and " + arr[j+1]);
	}
	if(arr[0]>=arr[1]){
		System.out.println("There is a peak at 0" );
	}
	if(arr[arr.length-1] >= arr[arr.length-2]){
		System.out.println("There is a peak at " + (arr.length-1));
	}
	
	
	long endTime = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println("\n\nThe program ran in "+ totalTime+" millisecends");
	
	}
}

	
	
