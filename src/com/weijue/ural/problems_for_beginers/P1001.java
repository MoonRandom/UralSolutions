package com.weijue.ural.problems_for_beginers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Stack;

/**
 * 
 * @author gw
 *         <p>
 *         缓冲输入
 */
public class P1001
{
	public static void main(String args[]) throws IOException
	{
		StreamTokenizer cin = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		Stack<Double> numbers = new Stack<Double>();
		while (cin.nextToken() != StreamTokenizer.TT_EOF)
			numbers.push(cin.nval);
		while (!numbers.isEmpty())
			System.out.println(String.format("%.4f", Math.sqrt(numbers.pop())));
	}
}
