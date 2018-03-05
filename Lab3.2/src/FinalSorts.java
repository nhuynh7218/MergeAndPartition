import java.util.Arrays;

public class FinalSorts {
	public static String [] mergeSort(String [] list)
	{
		if (list.length == 1)
		{
			return list;
		}
		
		else 
		{
			
		
		String front[] = Arrays.copyOfRange(list, 0, list.length/2);
		String back[] = Arrays.copyOfRange(list, list.length/2, list.length);
		
		return MergeAndPart.merge(mergeSort(front), mergeSort(back));
		}
	}
	
	public static int partitionFinal(int[] list1, int front, int back)
	{
	int pivot = front;
	

	}
}
