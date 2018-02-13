
public class Merge {
	public static String[] merge(String[] list1, String[] list2) 
	{
		//index for list 1
		int i = 0;
		//index for list 2
		int j = 0;
		//index for list 3
		int k = 0;
		int totalLength = list1.length + list2.length;
		
		String[] mergeString = new String[totalLength];
		while (i < list1.length && j <list2.length)
		{
			int small = list1[i].compareTo(list2[j]);
			if (small < 0)
				{
					mergeString[k] = list1[i];
					i++;
				}
			
			else
				{
					mergeString[k] = list2[j];
					j++;
				}
				k++;
		}
		return mergeString;
		
	}
}
