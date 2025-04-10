package paquete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Util 
{
	public static int max_par(List<Integer> list)
	{
		int n = 0;
		Iterator<Integer> it = list.iterator();
		
		while (it.hasNext())
		{
			int j = it.next();
			if (j > n)
				n = j;
		}
		return (n);
	}
	
	public static double media_impares(List<Integer> list)
	{
		double media = 0;
		int i = 0;
		Iterator<Integer> it = list.iterator();
		
		while (it.hasNext())
		{
			int n = it.next();
			if (n % 2 == 1)
			{
				media += n;
				i++;
			}
		}
		media /= i;
		return (media);
	}	
	
	public static List<Integer> numeros(Scanner scan)
	{
		int n;
		List<Integer> list = new ArrayList<Integer>();
		
		
		System.out.println("Ingresa un numero, si es negativo acaba el bucle");
		n = scan.nextInt();
		while (n >= 0)
		{
			list.add(n);
			System.out.println("Ingresa un numero si es negativo acaba el bucle");
			n = scan.nextInt();
		}
		return (list);
	}
}
