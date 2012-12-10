package com.weijue.ural.problems_for_beginers;
import java.util.Scanner;

public class P1044
{
	private static int n = 4;
	private static int count[] = new int[37];

	private static void dealCount(int k, int sum)
	{
		if (k == 0)
		{
			count[sum]++;
			return;
		}
		for (int i = 0; i < 10; i++)
			dealCount(k - 1, sum + i);
	}

	public static void main(String[] args)
	{
		n = new Scanner(System.in).nextInt();
		dealCount(n / 2, 0);
		int result = 0;
		for (int i = 0; i < 37; i++)
			result += count[i] * count[i];
		if (n % 2 == 1)
			result *= 10;
		System.out.println(result);
	}
}
