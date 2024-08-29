package arrays;

public class string_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String[] arr; //declaring an array 
		arr = new String[4]; //allocating size of an array
		
		//intialising the array 
		arr[0] = "Manju";
		arr[1] = "Prasanna";
		arr[2] = "Naresh";
		arr[3] = "Madhu";
		
		for (int i =0;i<arr.length;i++)
			System.out.println("Name" + i + " @ index" + i +  "=" + arr[i] );
	}

}
