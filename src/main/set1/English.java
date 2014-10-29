package main.set1;

import java.util.HashSet;
import java.util.Set;

public class English {
    
    private static final Set<String> COMMON_WORD_SET;
    static {
        COMMON_WORD_SET = new HashSet<String>();
        COMMON_WORD_SET.add("the");
        COMMON_WORD_SET.add("be");
        COMMON_WORD_SET.add("to");
        COMMON_WORD_SET.add("of");
        COMMON_WORD_SET.add("and");
        COMMON_WORD_SET.add("a");
        COMMON_WORD_SET.add("in");
        COMMON_WORD_SET.add("that");
        COMMON_WORD_SET.add("have");
        // changing I to i for lower case consistency
        COMMON_WORD_SET.add("i");
        COMMON_WORD_SET.add("it");
        COMMON_WORD_SET.add("for");
        COMMON_WORD_SET.add("not");
        COMMON_WORD_SET.add("on");
        COMMON_WORD_SET.add("with");
        COMMON_WORD_SET.add("he");
        COMMON_WORD_SET.add("as");
        COMMON_WORD_SET.add("you");
        COMMON_WORD_SET.add("do");
        COMMON_WORD_SET.add("at");
        COMMON_WORD_SET.add("this");
        COMMON_WORD_SET.add("but");
        COMMON_WORD_SET.add("his");
        COMMON_WORD_SET.add("by");
        COMMON_WORD_SET.add("from");
        COMMON_WORD_SET.add("they");
        COMMON_WORD_SET.add("we");
        COMMON_WORD_SET.add("say");
        COMMON_WORD_SET.add("her");
        COMMON_WORD_SET.add("she");
        COMMON_WORD_SET.add("or");
        COMMON_WORD_SET.add("an");
        COMMON_WORD_SET.add("will");
        COMMON_WORD_SET.add("my");
        COMMON_WORD_SET.add("one");
        COMMON_WORD_SET.add("all");
        COMMON_WORD_SET.add("would");
        COMMON_WORD_SET.add("there");
        COMMON_WORD_SET.add("their");
        COMMON_WORD_SET.add("what");
        COMMON_WORD_SET.add("so");
        COMMON_WORD_SET.add("up");
        COMMON_WORD_SET.add("out");
        COMMON_WORD_SET.add("if");
        COMMON_WORD_SET.add("about");
        COMMON_WORD_SET.add("who");
        COMMON_WORD_SET.add("get");
        COMMON_WORD_SET.add("which");
        COMMON_WORD_SET.add("go");
        COMMON_WORD_SET.add("me");
        COMMON_WORD_SET.add("when");
        COMMON_WORD_SET.add("make");
        COMMON_WORD_SET.add("can");
        COMMON_WORD_SET.add("like");
        COMMON_WORD_SET.add("time");
        COMMON_WORD_SET.add("no");
        COMMON_WORD_SET.add("just");
        COMMON_WORD_SET.add("him");
        COMMON_WORD_SET.add("know");
        COMMON_WORD_SET.add("take");
        COMMON_WORD_SET.add("person");
        COMMON_WORD_SET.add("into");
        COMMON_WORD_SET.add("year");
        COMMON_WORD_SET.add("your");
        COMMON_WORD_SET.add("good");
        COMMON_WORD_SET.add("some");
        COMMON_WORD_SET.add("could");
        COMMON_WORD_SET.add("them");
        COMMON_WORD_SET.add("see");
        COMMON_WORD_SET.add("other");
        COMMON_WORD_SET.add("than");
        COMMON_WORD_SET.add("then");
        COMMON_WORD_SET.add("now");
        COMMON_WORD_SET.add("look");
        COMMON_WORD_SET.add("only");
        COMMON_WORD_SET.add("come");
        COMMON_WORD_SET.add("its");
        COMMON_WORD_SET.add("over");
        COMMON_WORD_SET.add("think");
        COMMON_WORD_SET.add("also");
        COMMON_WORD_SET.add("back");
        COMMON_WORD_SET.add("after");
        COMMON_WORD_SET.add("use");
        COMMON_WORD_SET.add("two");
        COMMON_WORD_SET.add("how");
        COMMON_WORD_SET.add("our");
        COMMON_WORD_SET.add("work");
        COMMON_WORD_SET.add("first");
        COMMON_WORD_SET.add("well");
        COMMON_WORD_SET.add("way");
        COMMON_WORD_SET.add("even");
        COMMON_WORD_SET.add("new");
        COMMON_WORD_SET.add("want");
        COMMON_WORD_SET.add("because");
        COMMON_WORD_SET.add("any");
        COMMON_WORD_SET.add("these");
        COMMON_WORD_SET.add("give");
        COMMON_WORD_SET.add("day");
        COMMON_WORD_SET.add("most");
        COMMON_WORD_SET.add("us");
    }
    
    public static double howLikely(String s) {
        String lower = s.toLowerCase();
        String[] words = lower.split("\\s+");
        int numWords = words.length;
        int numCommonWords = 0;
        for (String word : words) {
            if (COMMON_WORD_SET.contains(word)) {
                numCommonWords++;
            }
        }
        return 1.0 * numCommonWords / numWords;
    }

}
