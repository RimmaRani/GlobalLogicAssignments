package ArrayMinMax;

class MinMax {
	public void Max(int a1[]) {
		
	int max=a1[0];
	int min=a1[0];
	for (int i=0;i<a1.length;i++)
	{
		if(max<a1[i])
		{
			max=a1[i];
		}
	}
	
	for (int j=0;j<a1.length;j++)
	{
		if(min>a1[j]);
	}
    System.out.println("Max elemnet is "+max);
	System.out.println("Min element is "+min);
}
	public static void main(String[] args) {
		int[] a1= new int[]{1,3,5,2,4,6};
		MinMax m=new MinMax();
		m.Max(a1);
		
	}
	
}