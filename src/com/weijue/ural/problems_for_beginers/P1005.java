package com.weijue.ural.problems_for_beginers;
import java.util.Scanner;

public class P1005
{
	private static int left = 0;
	private static int right = 0;
	private static int v[] = new int[20];
	private static int best = Integer.MAX_VALUE;
	private static int n;

	private static void deal(int k)
	{
		if (k == n)
		{
			int temp = Math.abs(left - right);
			if (temp < best)
				best = temp;
			return;
		}
		left += v[k];
		deal(k + 1);
		left -= v[k];
		right += v[k];
		deal(k + 1);
		right -= v[k];
	}

	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		for (int i = 0; i < n; i++)
			v[i] = cin.nextInt();
		deal(0);
		System.out.println(best);
	}
}
