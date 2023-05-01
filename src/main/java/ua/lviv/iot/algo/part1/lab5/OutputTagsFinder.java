package ua.lviv.iot.algo.part1.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OutputTagsFinder {

    public static final Pattern PATTERN_HTML = Pattern.compile(
            "<((span|strong|table))>(.*?)<\\/\\1>");

    public String findOutputTags(final String string) {
        List<String> myArray = new ArrayList<>();

        Matcher matcher = PATTERN_HTML.matcher(string);

        while (matcher.find()) {
            String match = matcher.group(3);
            myArray.add(match);
        }
        Collections.sort(myArray);
    return String.join("\n", myArray);
    }
}