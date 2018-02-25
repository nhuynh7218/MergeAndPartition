
public class SwapMethods {
	public static void swap(int[] elements, int index1, int index2)
	{
		 int temp = elements[index1];
		 elements[index1] = elements[index2];
		 elements[index2] = temp;
	}
}
