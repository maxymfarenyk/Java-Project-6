package com.company;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		boolean T = true;
		int j = 0;
		while (j < 100) {
			j += 1;
			if (j % 2 == 0)
				continue;
			System.out.println(j);

			}
		int x = 0;
		do {
			x += 3;
			System.out.println(x);
		} while (x < 0);
	}
}