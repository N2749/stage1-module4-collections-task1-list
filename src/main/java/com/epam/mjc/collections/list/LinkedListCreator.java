package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {

    /* _If the number from the `List<Integer>` is odd, then insert this number at the beginning of the `LinkedList<Integer>`,
    otherwise, insert the number at the end_ of the `LinkedList<Integer>`.*/
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer integer : sourceList) {
            if (integer % 2 == 1) {
                result.addFirst(integer);
                continue;
            }
            result.add(integer);
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        creator.createLinkedList(List.of(47, 3, 25, 13, 7));
    }
}
