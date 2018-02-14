
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
			//compares the 2 indexes
			int small = list1[i].compareTo(list2[j]);
			//if list1 index is smaller than list2, makes the list3 value k equal to it and i goes up 1
			if (small < 0)
				{
					mergeString[k] = list1[i];
					i++;
				}
			//opposite, makes list2 = list3
			else
				{
					mergeString[k] = list2[j];
					j++;
				}
			//moves the index	
			k++;
		}
		return mergeString;
		
	}
}
