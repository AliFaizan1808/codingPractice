package com.string.maipulation;

import java.util.HashSet;
import java.util.Set;

public class StringPermutations {

	public static Set<String> findPermutations(String str) {
		Set<String> permutations = new HashSet<>();
		findPermutationsHelper("", str, permutations);
		return permutations;
	}

	private static void findPermutationsHelper(String prefix, String remaining, Set<String> permutations) {
		int n = remaining.length();
		if (n == 0) {
			permutations.add(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				findPermutationsHelper(prefix + remaining.charAt(i),
						remaining.substring(0, i) + remaining.substring(i + 1, n),
						permutations);
			}
		}
	}

	public static void main(String[] args) {
		String input = "abc";
		Set<String> result = findPermutations(input);
		System.out.println("Permutations of " + input + ":");
		for (String permutation : result) {
			System.out.println(permutation);
		}
	}
}
