package com.weijue.ural.problems_for_beginers;
import java.util.Scanner;

public class P1068
{
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		int result = 0;
		int n = cin.nextInt();
		if (n >= 1)
			for (int i = 1;i <= n;i++)
				result += i;
		else
			for (int i = n;i <= 1;i++)
				result += i;
		System.out.println(result);
	}
}
