class Calculate<T extends Number>
{
	T Arr[];
	Calculate(T a[])
	{
		this.Arr=a;
	}
	double Average()
	{
		double Sum=0.0;
		for(int i=0;i<Arr.length;i++)
		{
			Sum=Sum+Arr[i].doubleValue();
		}
		return Sum/Arr.length;
	}
}
class UserTest
{
	public static void main(String args[])
	{
		Integer a[]={1,2,3,4};
		Calculate<Integer> ob=new Calculate<Integer>(a);
		double d=ob.Average();
		System.out.println("Average is"+d);
	}
}
	