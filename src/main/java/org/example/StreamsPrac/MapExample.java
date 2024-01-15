package org.example.StreamsPrac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("data,cherry","berries");
        List<String> upperCaseWords = words.stream()
                .map(word-> word.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperCaseWords);
        List<String> wordsInCapitalLetters = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(wordsInCapitalLetters);
    }
}

