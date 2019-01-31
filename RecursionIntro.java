
public class RecursionIntro {
	
	public static double median3(int[] a)
	{
		return medianHelper(a, 0, a.length);
	}
	
	public static double medianHelper(int[] a, int index, int length)
	{
		
		if(length == 1)
			return a[index];
		if(length == 2)
			return medianReader(a[index], a[index+1]);
		if(length % 3 == 0)
			return medianR0(a, length/3, index);
		if(length % 3 == 1)
			return medianR1(a, length/3, length - (2*length/3), length/3, index);
		return medianR1(a, length - (2*length/3), length/3, length - (2*length/3), index);
	}
	
	public static double medianR0(int[] a, int size, int index)
	{
		if(size == 1)
			return medianReader(a[index], a[index+1], a[index+2]);
		if(size == 2)
			return medianReader(medianReader(a[index], a[index+1]), medianReader(a[index+2], a[index+3]), medianReader(a[index+4], a[index+5]));
		if(size == 3)
			return medianReader(medianR0(a, 1, index), medianR0(a, 1, index+3), medianR0(a, 1, index+6));
		return medianR1(a, size, size, size, index);
			
	}
	
	public static double medianR1(int[] a, int first, int mid, int last, int index)
	{
		double f = 0, m = 0, l = 0;
		
		if(first == 1)
			f = a[index];
		else if(first == 2)
			f = medianReader(a[index], a[index+1]);
		else if(first == 3)
			f = medianReader(a[index], a[index+1], a[index+2]);
		else if(first > 3)
			f = medianHelper(a, index, first);
		
		if(mid == 1)
			m = a[index+first];
		else if(mid == 2)
			m = medianReader(a[index+first], a[index+first+1]);
		else if(mid == 3)
			m = medianReader(a[index+first], a[index+first+1], a[index+first+2]);
		else if(mid > 3)
			m = medianHelper(a, index+first, mid);
		
		if(last == 1)
			l = a[index+first+mid];
		else if(last == 2)
			l = medianReader(a[index+first+mid], a[index+first+mid+1]);
		else if(last == 3)
			l = medianReader(a[index+first+mid], a[index+first+mid+1], a[index+first+mid+2]);
		else if(last > 3)
			l = medianHelper(a, index+first+mid, last);
		
		return medianReader(f,m,l);
	}
	
	public static double medianReader(double x, double y)
	{
		return (x + y) / 2.0;
	}
	
	public static double medianReader(double x, double y, double z)
	{
		
		if((x < y && y < z) || (z < y && y < x))
			return y;
		else if((y < x && x < z) || (z < x && x < y))
			return x;
		return z;
	}
	
	public static void printsparsetable(int start, int end)
	{
		System.out.println(start + " " + fibby(start));
		if(start <= end)
			printsparsetableHelper(fibby(start+1), fibby(start), start+1, end);
	}
	
	public static void printsparsetableHelper(int current, int last, int start, int end)
	{
		if(start <= end)
		{
			if(current != last)
			{
				System.out.println(start + " " + current);
			}
			printsparsetableHelper(fibby(start+1), current, start+1, end);
		}
		
	}
	
	public static int fibby(int x)
	{
		if(x == 0)
			return 1;
		return fibby(x / 4) + fibby((3 * x) / 4);
	}
	
	public static long eduodd(long x)
	{
		if(x < 0)
			return -1 * eduodd(-1 * x);
		
		if(x < 10)
		{			
			if(x % 2 == 0)
			{
				return x + 1;
			}
			return x - 1;
		}
		return (10 * eduodd(x / 10) + (eduodd(x % 10)));
	}

}
