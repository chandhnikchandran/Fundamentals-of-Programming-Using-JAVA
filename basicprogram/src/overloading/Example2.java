package overloading;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		Dress d=new Dress();
		d.show();
		System.out.println("Enter Dress:");
		String dd=s.next();
		int j=0,sh=0,tsh=0,sa=0,sal=0,le=0,ku=0,fr=0;
		do {
		
		if(dd.equals("jeans"))
		{
			j=999;
		}
		else if(dd.equals("shirt"))
		{
			sh=899;
		}
		else if(dd.equals("T-shirt"))
		{
			tsh=680;
		}
		else if(dd.equals("saree"))
		{
			sa=1200;
		}
		else if(dd.equals("salwar"))
		{
			sal=970;
		}
		else if(dd.equals("kurta"))
		{
			ku=500;
		}
		else if(dd.equals("leggings"))
		{
			le=150;
		}
		else if(dd.equals("frock"))
		{
			fr=567;
		}
		else
		{
			System.out.println("Plz try Again");
		}
		}while(dd.equals(""));
		d.show(j,sh,tsh,sa,sal,le,ku,fr);
	}
	

}
class Dress
{

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Collections:");
		System.out.println("Mens Wear");
		System.out.println("----------");
		System.out.println("jeans\t Shirts\tT-Shirts");
		System.out.println("Ladies Wear");
		System.out.println("----------");
		System.out.println("jeans\t Shirts\tT-Shirts\tSaree\tSalwar\tkurta\tleggings");
		System.out.println("Kids Wear");
		System.out.println("----------");
		System.out.println("jeans\t Shirts\tT-Shirts\tFrock");
		
		
	}

	public void show(int j, int sh, int tsh, int sa, int sal, int le, int ku, int fr) {
		// TODO Auto-generated method stub
		int total=j+sh+tsh+sa+sal+le+ku+fr;
		System.out.println("Total Price:"+total);
	}
	
}