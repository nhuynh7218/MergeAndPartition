
public class QuickSort {
	public static void quickSort(int list[], int small, int big)
	{
		if (small < big)
		{
			FinalSorts.partitionFinal(list,small, big);
		
		  int pivot = FinalSorts.partitionFinal(list, small, big);
	         
	      quickSort(list, small, pivot-1);
	      quickSort(list, pivot+1, big);
		}
		
		}
}
