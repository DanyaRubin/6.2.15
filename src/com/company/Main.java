package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int i = 0;
        while (sc.hasNext()) {
            if (i % 2 != 0) {
                deque.add(sc.nextInt());
            } else {
                sc.nextInt();
            }
            i++;
        }
        for(Iterator<Integer> descItr = deque.descendingIterator(); descItr.hasNext();) {
            System.out.print(" " + descItr.next());
        }
    }
}
