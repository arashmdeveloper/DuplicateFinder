package com.dopicatefinder;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.dopicatefinder.finder.IDuplicateFinder;
import com.dopicatefinder.finder.IntegerDuplicateFinder;

public class DuplicateFinder {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 7, 2, 4, 9, 7, 2, 5, 6);
		IDuplicateFinder<Integer> finder = new IntegerDuplicateFinder();
		Set<Integer> duplicates = finder.find(numbers);
        System.out.println("Repeated numbers: " + duplicates);
	}

}
