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
	
	public static int partitionFinal(int [] list, int left, int right)
    {
       
		int pivot = list[right]; 
		
		int i = left - 1; 
      
        for (int j = left; j < right; j++)
        {
            
            if (list[j] <= pivot)
            {
                i++;
               SwapMethods.swap(list, i, j);
            }
        }
        
      SwapMethods.swap(list, i+1, right);
      
        return i+1;
    }
}
