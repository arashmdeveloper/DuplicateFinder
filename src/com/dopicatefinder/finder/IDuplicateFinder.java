package com.dopicatefinder.finder;

import java.util.List;
import java.util.Set;

public interface IDuplicateFinder<T> {
	
	Set<T> find(List<T> list);

}
