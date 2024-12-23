package com.practice.october;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import java.util.*;

public class Test {
    public static List<String> bitPattern(List<Integer> num) {
        int n = num.size();
        StringBuilder earlierPattern = new StringBuilder();
        StringBuilder laterPattern = new StringBuilder();

        Set<Integer> seenEarlier = new HashSet<>();
        Set<Integer> seenLater = new HashSet<>(num); // Initialize with all elements

        // Iterate through the array to generate both strings
        for (int i = 0; i < n; i++) {
            int current = num.get(i);

            // Generate earlier pattern
            if (seenEarlier.contains(current)) {
                earlierPattern.append('1');  // Seen before
            } else {
                earlierPattern.append('0');  // First time seen
            }
            seenEarlier.add(current); // Add to seenEarlier set

            // Generate later pattern
            if (seenLater.contains(current)) {
                laterPattern.append('1');  // Still exists after removal
            } else {
                laterPattern.append('0');  // No longer exists
            }
            seenLater.remove(current);  // Remove current element
        }

        return Arrays.asList(earlierPattern.toString(), laterPattern.toString());
    }

    public static void main(String[] args) {
        // Example input: [1, 1, 2, 3, 1]
        List<Integer> num = Arrays.asList(1, 1, 2, 3, 1);
        List<String> result = bitPattern(num);

        System.out.println("Earlier pattern: " + result.get(0));
        System.out.println("Later pattern: " + result.get(1));
    }
}
