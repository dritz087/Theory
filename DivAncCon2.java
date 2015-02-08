

public class DivAncCon2 {

	public static void main(String[] args) {
		int arr[][] = new int[100][100];
		long startTime = System.currentTimeMillis();
		
		for(int r = 0; r<100;r++){
			for (int c = 0; c<100;c++){
				arr[r][c] = (int)(Math.random()*100+1);
			}
		}

		
		Peak2D o1 = new Peak2D();
		
		int[] location = o1.findPeak(arr,100,100);
		int value = arr[location[0]][location[1]];
		System.out.println("There is a peak at [" + location[0] + "," + location[1] + "] with the value of " + value);
		
		if((location[0] != 0) && (location[1] != 0) && (location[0] != 99) && (location[1] != 99)){
		System.out.println("The values above and below are: " + arr[location[0]][location[1]+1] + " and " + arr[location[0]][location[1]-1]);
		System.out.println("The values to the right and left are: " + arr[location[0]+1][location[1]] + " and " + arr[location[0]-1][location[1]]);
		}
		else if(location[0] == 0 && (location[1] != 0 && location[1]!=99)){
			System.out.println("The values above and below are: " + arr[location[0]][location[1]+1] + " and " + arr[location[0]][location[1]-1]);
			System.out.println("The value to the right is: " + arr[location[0]+1][location[1]]);
		}
		else if(location[0] == 99 &&(location[1] != 0 && location[1]!=99)){
			System.out.println("The values above and below are: " + arr[location[0]][location[1]+1] + " and " + arr[location[0]][location[1]-1]);
			System.out.println("The value to the left is: " + arr[location[0]-1][location[1]]);
		}
		else if(location[0] == 99 &&(location[1] == 0)){
			System.out.println("The value below is: " + arr[location[0]][location[1]+1]);
			System.out.println("The value to the left is: " + arr[location[0]-1][location[1]]);
		}
		else if(location[0] == 99 &&(location[1] == 99)){
			System.out.println("The value above is: " + arr[location[0]][location[1]+1]);
			System.out.println("The value to the left is: " + arr[location[0]-1][location[1]]);
		}
		else if(location[0] == 0 &&(location[1] == 0)){
			System.out.println("The value below is: " + arr[location[0]][location[1]+1]);
			System.out.println("The value to the right is: " + arr[location[0]+1][location[1]]);
		}
		else if(location[0] == 0 &&(location[1] == 99)){
			System.out.println("The value above is: " + arr[location[0]][location[1]-1]);
			System.out.println("The value to the right is: " + arr[location[0]+1][location[1]]);
		}
		else if(location[1] == 0 &&(location[0] != 0 && location[0] != 99)){
			System.out.println("The value below is: " + arr[location[0]][location[1]+1]);
			System.out.println("The values to the right and left are: " + arr[location[0]+1][location[1]] + " and " + arr[location[0]-1][location[1]]);
		}
		else{
			System.out.println("The value above is: " + arr[location[0]][location[1]-1]);
			System.out.println("The values to the right and left are: " + arr[location[0]+1][location[1]] + " and " + arr[location[0]-1][location[1]]);
		}
		
		
		
		
		
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("\nThe program ran in "+ totalTime+" millisecends");
	}
	
}
