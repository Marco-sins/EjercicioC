package paquete;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class UtilTest 
{
	@Test
	public void max_parTest()
	{
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++)
			list.add(i);
		int n = Util.max_par(list);
		Assert.assertEquals(10, n);
	}
	
	@Test
	public void media_imparesTest()
	{
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++)
			list.add(i);
		double n = Util.media_impares(list);
		Assert.assertEquals(5, n, 0.01);
	}
	
}
