
public class MergeAndPart {
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
		while (i < list1.length && j < list2.length && k <totalLength)
		{
			//compares the 2 indexes
			int small = list1[i].compareTo(list2[j]);
			//if list1 index is smaller than list2, makes the list3 value k equal to it and i goes up 1
			if (small <= 0)
				{
					mergeString[k] = list1[i];
					i++;
					
				}
			//opposite, makes list2 = list3
			if(small > 0)
				{
					mergeString[k] = list2[j];
					j++;
				}
			//moves the index	
			k++;
		}
		//if there are no more elements to check in list1, it adds the remaining elements from list2
		if (i == list1.length)
		{
			for(int x = j; x < list2.length; x++)
			{
				mergeString[k] = list2[x];
			}
		}
		//if there are no more elements to check in list2, it adds the remaining elements from list1
		if(j == list2.length)
			for(int x = i; x < list1.length; x++)
			{
				mergeString[k] = list1[x];
			}
		return mergeString;
		
	}
	
	public static int partition(int[] list)
	{
		
		int length = list.length;
		int left = 0;
		int right = 0;
		int[] leftSide = new int[length/2];
		int[] rightSide = new int[length/2];
		for(int i = 0; i < length; i++)
			{
				if (list[i+1] <= list[0])
				{
					leftSide[left] = list[i+1];
					i++;
					left++;
				}
				if (list[i+1] > list[0])
				{
					rightSide[right] = list[i+1];
					i++;
					right++;
				}
			}
		return leftSide;
		
	}
}
