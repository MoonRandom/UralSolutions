package com.weijue.ural.problems_for_beginers;

import java.util.Arrays;
import java.util.Scanner;

public class P1025
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		int k = cin.nextInt();
		int v[] = new int[k];
		for (int i = 0;i < k;i++)
			v[i] = cin.nextInt();
		Arrays.sort(v);
		int result = 0;
		for (int i = 0;i < k / 2 + 1;i++)
			result += (v[i] / 2 + 1);
		System.out.println(result);
	}

}
