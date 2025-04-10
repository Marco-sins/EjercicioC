package paquete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		List<Integer> list = Util.numeros(scan);
		System.out.println("Se han introducido " + list.size() + " numeros");
		System.out.println("La media de todos los numeros impares es: " + Util.media_impares(list));
		System.out.println("El numero par mas grande par es: " + Util.max_par(list));
	}
	
}
