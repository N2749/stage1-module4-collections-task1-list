package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        IntStream.range(0, sourceList.size()).filter(i -> i % 3 == 2).mapToObj(sourceList::get).collect(Collectors.toList()).forEach((s) -> {
            result.add(s);
            result.add(s);
        });
        return result;
    }
}
