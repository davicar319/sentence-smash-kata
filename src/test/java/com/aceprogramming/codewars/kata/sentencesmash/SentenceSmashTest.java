package com.aceprogramming.codewars.kata.sentencesmash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SentenceSmashTest {

    @Test
    void testNull() {
        Assertions.assertNull(SmashWords.smash(null));
    }

    @Test
    void testEmpty() {
        assertEquals("", SmashWords.smash(new String[]{}));
    }

    @Test
    void testEmptyString() {
        assertEquals("", SmashWords.smash(new String[]{""}));
    }

    @Test
    void testEmptyStrings() {
        assertEquals("", SmashWords.smash(new String[]{"", "", ""}));
    }

    @Test
    void testSpace() {
        assertEquals("", SmashWords.smash(new String[]{" "}));
    }

    @Test
    void testSpaces() {
        assertEquals("", SmashWords.smash(new String[]{" ", "  ", " "}));
    }

    @Test
    void testSingleWord() {
        assertEquals("Have", SmashWords.smash(new String[]{"Have"}));
    }

    @Test
    void testSingleWordWithSpaceAtFront() {
        assertEquals("Have", SmashWords.smash(new String[]{" Have"}));
    }

    @Test
    void testSingleWordWithSpaceAtFrontAndBack() {
        assertEquals("Have", SmashWords.smash(new String[]{" Have "}));
    }

    @Test
    void testMultipleWords() {
        assertEquals("Have a nice day", SmashWords.smash(new String[] {"Have", "a", "nice", "day"}));
    }

    @Test
    void testMultipleWordsWithSpaces() {
        assertEquals("Have a nice day", SmashWords.smash(new String[] {" Have ", " a ", " nice ", " day "}));
    }
}
