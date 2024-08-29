package arrays;

public class avg_marks {

	public static void main(String[] args) {
		int ages[] = {20,21,22,23,43};
		
		float avg,sum = 0;
		int length = ages.length;
		
		for(int age: ages) {
			sum+=age;
		}
		avg= sum/length;
	    System.out.println
	    ("The average age is: " + avg);
	}

}
