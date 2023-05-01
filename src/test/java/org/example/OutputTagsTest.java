package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OutputTagsTest {

    String testExpected="aa af sdf "+"\naaa asdfiufadsioudsfh"+"\nbbb"+"\nc a doiuhafds ia aiuh fipo"+"\nz";
    OutputTags outTest= new OutputTags();
    String inPut="<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "  <title>Regex Testing Example</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "  <h1>Regex Testing Example</h1>\n" +
            "  <table>\n" +
            "    <tr>\n" +
            "      <td><span>c a doiuhafds ia aiuh fipo</span></td>\n" +
            "      <td><strong>aaa asdfiufadsioudsfh</strong></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "      <td><span>bbb</span></td>\n" +
            "      <td><strong>z</strong></td>\n" +
            "    </tr>\n" +
            "  </table>\n" +
            "  <span>aa af sdf </span>\n" +
            "</body>\n" +
            "</html>able>age from. Comparison new ham melancholy </table>son themselves.";
   String resultString=outTest.out(inPut);



    @Test
    void comparingTest() {

        assertEquals(testExpected,resultString );
    }
}