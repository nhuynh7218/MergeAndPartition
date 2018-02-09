
public class Merge {
	public static String[] merge(String[] list1, String[] list2) 
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int totalLength = list1.length + list2.length;
		String[] mergeArray = new String[totalLength];
		while(i < list1.length && j < list2.length)
		{
			int value1 = (list1[i].compareTo(list2[j]));
			if (value1 < 0)
			{
				String small = list1[i];
				String big = list2[j];
				mergeArray[k] = small;
				mergeArray[k+1] = big;
				i++;
				j++;
				k++;
			}
			else
			{
				String big = list1[i];
				String small = list2[j];
				mergeArray[k] = small;
				mergeArray[k+1] = big;
				i++;
				j++;
				k++;
			}
		}
		return mergeArray;
		
	}
}
