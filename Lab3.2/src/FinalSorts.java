import java.util.Arrays;

public class FinalSorts {
	public static String [] mergeSort(String [] list)
	{
		if (list.length <= 1)
		{
			return list;
		}
		String front[] = Arrays.copyOfRange(list, 0, list.length/2);
		String back[] = Arrays.copyOfRange(list, list.length/2, list.length);
		
		return MergeAndPart.merge(mergeSort(front), mergeSort(back));
	}
	
	//public static int
}
