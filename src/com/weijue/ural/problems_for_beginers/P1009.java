package com.weijue.ural.problems_for_beginers;
import java.util.Scanner;

public class P1009
{

	private static long f[][] = new long[100][2];
	private static int n, k;

	private static void initF()
	{
		for (int i = 0; i < 100; i++)
			for (int j = 0; j < 2; j++)
				f[i][j] = -1;
	}

	private static long getResult(int i, int flag)
	{
		if (i == 1)
		{
			if (flag == 0)
				return 1;
			else
				return k - 1;
		}
		if (f[i][flag] == -1)
		{
			if (flag == 0)
				f[i][flag] = getResult(i - 1, 1);
			else
				f[i][flag] = (getResult(i - 1, 1) + getResult(i - 1, 0))
						* (k - 1);
			return f[i][flag];
		} else
		{
			return f[i][flag];
		}
	}

	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		k = cin.nextInt();
		initF();
		System.out.println(getResult(n, 1));
	}
}
