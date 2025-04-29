package com.dopicatefinder.finder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntegerDuplicateFinder implements IDuplicateFinder<Integer> {
	
	@Override
	public Set<Integer> find(List<Integer> list){
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for(Integer number:list) {
			if(seen.contains(number))
					duplicate.add(number);
			else seen.add(number);
		}
		return duplicate;
	}

}
