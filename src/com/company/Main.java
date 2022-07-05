package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 400; i++) {
            int random = new Random().nextInt(20);
            array.add(random);
            counter+= random;
            System.out.print(random + ", ");
        }
        System.out.println("\nSum: " + counter);

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(array);
            long sum = hashSet.stream().mapToInt(x -> x).sum();
        System.out.print(hashSet + ", ");
        System.out.println("\n" + sum);
        }
    }

