import java.util.Scanner;
public class latihan5
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		int i;
		System.out.println("masukkan bilangan: ");
		i=input.nextInt();
		System.out.println();
		
		if(i<0)
		{
			System.out.println(" bilangan negatif");
		}
		else if(i>=0)
		{
			System.out.println("bilangan positif");
		}
		
	}
}