
public class DivAndCon {
	
	public static void main(String args[]){
		int arr[] = new int[50000000];
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) ((Math.random()*100) + 1);
		}
		
		findPeak o1 = new findPeak();
		
		int end = arr.length-1;
		int location = o1.findPeak(arr, 0, end);
		
		System.out.println("There is a peak at array index " + location);
	if(location == arr.length-1){
		System.out.print("The value of the peak is: " + arr[location]);
		System.out.print("\nThe side of the peak is " + arr[location - 1]);
	}else if(location == 0){
		System.out.print("The value of the peak is: " + arr[location] + "\nThe side of the peak is " + arr[location + 1]);
	}
	else{
		System.out.print("The value of the peak is: " + arr[location] + "\nThe two sides of the peak are " + arr[location - 1] + " and " + arr[location + 1]);
	}
		
	long endTime = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println("\n\nThe program ran in "+ totalTime+" millisecends");
}

}
