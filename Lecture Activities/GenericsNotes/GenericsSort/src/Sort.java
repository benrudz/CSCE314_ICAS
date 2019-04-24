
public class Sort {
	public static <T extends Comparable<? super T>> void bubbleSortAscending(T[] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
			for(int j = 0; j < a.length - 1 - i; j++)
			{
				if(a[j+1].compareTo(a[j]) < 0)
				{
					T tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
	}
	
	public static <T extends Comparable<? super T>> void bubbleSortDescending(T[] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
			for(int j = 0; j < a.length - 1 - i; j++)
			{
				if(a[j+1].compareTo(a[j]) > 0)
				{
					T tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
	}
}
