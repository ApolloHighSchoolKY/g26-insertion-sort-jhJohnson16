import java.util.ArrayList;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;
		System.out.println("Unsorted Aray " + Arrays.toString(myNumners));

		//Add the first number to the array list
			sorted.add(myNumbers(0));

			//Check with each of the numbers in the sorted list
			for(int i=1; i<myNumbers.length; i++){
				inserted = false;
				int spot = 0;

				while(inserted = false && spot < sorted.size()){
					if(myNumbers[i] < sorted.get(spot)){
						sorted.add(spot, myNumbers[i]);
						inserted = true;
					}
					spot++;
				}
				if(inserted == false)
					sorted.add(myNumbers[i]);
			}
				for(int j = 0; j<myNumbers.length; j++){
					myNumbers[j] = sorted.get(j);
				}
				//If this number is less than one in the sorted list,
				
				//insert it there

			//If it was not inserted, stick it on the end.
				

		//End Loop for unsorted list

		System.out.println(sorted);

		//Move the data back to the array

		//Print the contents of the array
		System.out.println("Sprted Array: " + Array.toString(myNumbers));
    }


}
