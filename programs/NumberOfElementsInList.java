package com.sweety.programs.java8;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class NumberOfElementsInList {

	public <T> long numberOfElementsInList(List<T> list) {
		return list.stream().count();
	}

	public <T> long numberOfElementsInListInRecurssiveWay(List<T> list, int count) {

		if (list.isEmpty()) {
			return count;
		}

		return numberOfElementsInListInRecurssiveWay(list.subList(1, list.size()), ++count);

	}

}
