
public class Runner {
	public static void main(String[] args) {
		//merge
		String [] test1 = {"apple","cucumber","microsoft","zorro"};
		String [] test2 = {"banana","cherry","mahoghany","oreos","pinata"};
		String [] test4 = {"d","e", "c","a","b"};
		int[] test3 = {3, 4, 2, 7, 12, 22, 0, 1};
		int[] test5 = {5, 8, 2, 6, 7, 1, 9};
		
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
		QuickSort.quickSort(test5, 0, test5.length);
		end = System.nanoTime();
		time = end - start;
		System.out.println("MergeSort took" + time + "nanoseconds");
		for (int q: test5)
			{
			System.out.print(q + " ");
			}
	}
	
}

