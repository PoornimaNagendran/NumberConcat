import java.util.Scanner;
public class NumberConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result="";
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int n;
		int temp;
		System.out.println("Enter size of array");
		n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
for(int i=0;i<n;i++)
{
	for(int j=0;j<n-1;j++)
	{
		if(a[j]<a[j+1])
	{
		temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
	}
	}
}
for(int i=0;i<n;i++)
{
	result=result+String.valueOf(a[i]);
}
System.out.println(result);
	}

}
