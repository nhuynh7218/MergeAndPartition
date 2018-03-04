
public class QuickSort {
	public static void quickSort(int list[], int small, int big)
	{
		if (small < big)
		{
			MergeAndPart.partition(list,small, big);
		}
	}
}
