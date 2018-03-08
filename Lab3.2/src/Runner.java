
public class Runner {
	public static void main(String[] args) {
	/*
	 * Nicholas Huynh
	 * Finished: 3/7/2018
	 * labs 3.2 and 3.3	
	 */
		
		//merge
		String [] test1 = {"apple","cucumber","microsoft","zorro"};
		String [] test2 = {"banana","cherry","mahoghany","oreos","pinata"};
		String [] test4 = {"d","e", "c","a","b"};
		int[] test3 = {3, 4, 2, 7, 12, 22, 0, 1};
		
		
		long start = System.nanoTime();
		String[] mergeResult = MergeAndPart.merge(test1,test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took: " + time + "nanoseconds");
		for (String x : mergeResult)
			{
				System.out.println(x + " ");
			}
		
		
		//partition
		start = System.nanoTime();
		int pivotFianlPos = MergeAndPart.partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took: " + time + "nanoseconds" );
		System.out.println("Final Pivot Position: " + pivotFianlPos);
		for (int y : test3)
			{
				System.out.print(y + " ");
			}
		
		
		//mergeSort
		start = System.nanoTime();
		String[] mergeSortArray = FinalSorts.mergeSort(test4);
		end = System.nanoTime();
		time = end - start;
		System.out.println("MergeSort took" + time + "nanoseconds");
		for (String z: mergeSortArray)
			{
			System.out.print(z + " ");
			}
		
		
		//quicksort
		start = System.nanoTime();
		QuickSort.quickSort(test3, 0, test3.length-1);
		end = System.nanoTime();
		time = end - start;
		System.out.println("quickSort took: " + time + "nanoseconds");
		for (int b: test3)
			{
				System.out.print(b + " ");
			}
	}
	
}

