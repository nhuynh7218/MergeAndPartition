
public class Runner {
	public static void main(String[] args) {
		String [] test1 = {"apple","cucumber","microsoft","zorro"};
		String [] test2 = {"banana","cherry","mahoghany","oreos","pinata"};
		int[] test3 = {3, 4, 2, 7, 12 ,22 , 0, 1};
	
		long start = System.nanoTime();
		String[] mergeResult = Merge.merge(test1,test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took: " + time + "nanoseconds");
		System.out.println((mergeResult));
	}
}
