import java.util.Scanner;
public class pesawat
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int tipepesawat;
		System.out.print("masukkan tipe pesawat: ");
		tipepesawat=input.nextInt();
		System.out.println();
		
		if(tipepesawat==1)
		{
			System.out.println("pesawat garuda");
		}
		else if(tipepesawat==2)
		{
			System.out.println("pesawat batik");
		}
		else if(tipepesawat==3)
		{
			System.out.println("pesawat lion");
		}
		else
		{
			System.out.println("maaf anda salah memasukkan tipe pesawat");
		}
		
		
	}
		
}