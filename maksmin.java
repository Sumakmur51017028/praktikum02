import java.util.Scanner;
public class maksmin{
	public static void main (String[] args)
		{
		Scanner input= new Scanner (System.in);
		System.out.print("Berapa banyak yang diinput= ");
		int array= input.nextInt();
		int nilai[]=new int[array];
		int min, maks;
		for (int i=0;i<array;i++)
		{
			System.out.print("Masukkan angka ke-"+i+" : ");
			nilai[i]=input.nextInt();
			}
			min=nilai[0];
			maks=nilai[0];
			System.out.println("Nilai-nilai yang diinputkan adalah: ");
			for (int i=0;i<array;i++)
			{
				System.out.print(nilai[i]+", ");
				if(nilai[i]<min)
				min=nilai[i];
				if(nilai[i]>maks)
				maks=nilai[i];
				}
				System.out.println();
				System.out.println("Min : "+min+"\nMax : "+maks);
	}
}