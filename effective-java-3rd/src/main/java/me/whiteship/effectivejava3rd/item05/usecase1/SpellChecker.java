package me.whiteship.effectivejava3rd.item05.usecase1;

import java.util.List;
import java.util.Objects;

public class SpellChecker {

    //    private static final Lexicon dictionary = new KoreanDicationry();
    private Lexicon dictionary = null;
    
    /*private SpellChecker() {
        // Noninstantiable
    }*/

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

//    public static final SpellChecker INSTANCE = new SpellChecker();

    public static boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
//        SpellChecker.INSTANCE.isValid("dhshin");
//        SpellChecker.isValid("hello");
        Lexicon lexicon = new KoreanDicationry();
        SpellChecker spellChecker = new SpellChecker(lexicon);
        spellChecker.isValid("hello");
    }
}


interface Lexicon {
}

class KoreanDicationry implements Lexicon {
}

