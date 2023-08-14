package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int i1 = 5 * Integer.parseInt(a) * Integer.parseInt(a) + 3;
        int i2 = 5 * Integer.parseInt(b) * Integer.parseInt(b) + 3;
        if (i1 > i2) return 1;
        if (i1 < i2) return -1;
        return a.compareTo(b);
    }
}
