package com.weijue.ural.problems_for_beginers;
import java.util.Scanner;

public class P1014
{
	private static int n;
	private static int k1 = 0, k2 = 0, k3 = 0, k4 = 0;

	private static void print(int c, int d)
	{
		for (int i = 0; i < c; i++)
			System.out.print(d);
	}

	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		if (n == 0)
		{
			System.out.println(10);
			return;
		}
		if (n == 1)
		{
			System.out.println(1);
			return;
		}
		while (n != 1)
		{
			if (n % 2 == 0)
			{
				n /= 2;
				k1++;
			} else if (n % 3 == 0)
			{
				n /= 3;
				k2++;
			} else if (n % 5 == 0)
			{
				n /= 5;
				k3++;
			} else if (n % 7 == 0)
			{
				n /= 7;
				k4++;
			} else
			{
				System.out.println(-1);
				return;
			}
		}
		int k5 = k1 % 3;
		int k6 = k2 % 2;
		if (k5 == 0 && k6 == 0)
		{
			print(k3, 5);
			print(k4, 7);
			print(k1 / 3, 8);
			print(k2 / 2, 9);
		} else if (k5 == 1 && k6 == 0)
		{
			print(1, 2);
			print(k3, 5);
			print(k4, 7);
			print(k1 / 3, 8);
			print(k2 / 2, 9);
		} else if (k5 == 0 && k6 == 1)
		{
			print(1, 3);
			print(k3, 5);
			print(k4, 7);
			print(k1 / 3, 8);
			print(k2 / 2, 9);
		} else if (k5 == 2 && k6 == 0)
		{
			print(1, 4);
			print(k3, 5);
			print(k4, 7);
			print(k1 / 3, 8);
			print(k2 / 2, 9);
		} else if (k5 == 1 && k6 == 1)
		{
			print(k3, 5);
			print(1, 6);
			print(k4, 7);
			print(k1 / 3, 8);
			print(k2 / 2, 9);
		} else if (k5 == 2 && k6 == 1)
		{
			print(1, 2);
			print(k3, 5);
			print(1, 6);
			print(k4, 7);
			print(k1 / 3, 8);
			print(k2 / 2, 9);
		}
		System.out.println();
	}
}
