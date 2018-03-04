
public class FinalSorts {
	public static String [] mergeSort(String [] list)
	{
		if (list.length <= 1)
		{
			return list;
		}
		return (MergeAndPart.merge(list, list));
	}
}
