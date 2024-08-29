package arrays;

public class arrays_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr; //declaring an array 
		arr = new int[4]; //allocating size of an array
		
		//intialising the array 
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		for (int i =0;i<arr.length;i++)
			System.out.println("Element @ index" + i +  "=" + arr[i] );
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
*/
	}

}
