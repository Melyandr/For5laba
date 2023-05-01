package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OutputTagsTest {
    public String testExpected = "aa af sdf " + "\naaa asdfiufadsioudsfh"
            + "\nbbb" + "\nc a doiuhafds ia aiuh fipo"+"\nz";

    OutputTagsFinder outTest = new OutputTagsFinder();

    public String inPut = "<!DOCTYPE html>\n" +
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
            "</html>able>age from. Comparison new ham melancholy " +
            "</table>son themselves.";
    public String resultString = outTest.findOutputTags(inPut);

    @Test
    public void comparingTest() {
        assertEquals(testExpected, resultString);
    }
}