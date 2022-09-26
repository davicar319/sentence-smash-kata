package com.aceprogramming.codewars.kata.sentencesmash;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class SmashWords {

    private SmashWords() {
    }
    public static String smash(String[] words) {
        return words == null ? null : doSmash(words);
    }
    private static String doSmash(String... words) {
        return Arrays.stream(words)
                .map(String::trim)
                .collect(Collectors.joining(" "))
                .trim();
    }
}
