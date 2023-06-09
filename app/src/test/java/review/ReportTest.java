package review;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReportTest {
    @Test public void testSingleGreenInput() {
      String grade = "Green";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Green: 1");
    }

    @Test public void testSingleAmberInput() {
      String grade = "Amber";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Amber: 1");
    }

    @Test public void testSingleRedInput() {
      String grade = "Red";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Red: 1");
    }

    @Test public void testUncountedValue() {
      String grade = "blah";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Uncounted: 1");
    }

    @Test public void testTwoGreenValues() {
      String grade = "Green, Green";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Green: 2");
    }

    @Test public void testTwoAmberValues() {
      String grade = "Amber, Amber";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Amber: 2");
    }

    @Test public void testTwoRedValues() {
      String grade = "Red, Red";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Red: 2");
    }
    
    @Test public void testTwoDifferentValues() {
      String grade = "Green, Amber";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Green: 1\nAmber: 1");
    }

    @Test public void testTwoMoreDifferentValues() {
      String grade = "Amber, Red";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Amber: 1\nRed: 1");
    }

    @Test public void testTwoMoreDifferentValues2() {
      String grade = "Uncounted, Red";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Red: 1\nUncounted: 1");
    }

    @Test public void testTwoDifferentNonConsecutiveValues() {
      String grade = "Green, Red";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Green: 1\nRed: 1");
    }

    @Test public void testTwoDifferentNonConsecutiveValues2() {
      String grade = "Amber, Uncounted";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Amber: 1\nUncounted: 1");
    }

    @Test public void testMultipleValues() {
      String grade = "Amber, Amber, Uncounted, Green";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Green: 1\nAmber: 2\nUncounted: 1");
    }

    @Test public void testLowerCaseValues() {
      String grade = "amber, green, red";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Green: 1\nAmber: 1\nRed: 1");
    }

    @Test public void testNoSpaces() {
      String grade = "amber,green,red";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Green: 1\nAmber: 1\nRed: 1");
    }

    @Test public void testDoubleCommas() {
      String grade = "amber,,green";
      Report report = new Report(grade);
      assertEquals(report.getFormattedReport(), "Green: 1\nAmber: 1");
    }

    @Test public void testEmptyString() {;
      Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        String grade = "";
        new Report(grade);
      });
      
      String expectedMessage = "Please enter a comma-separated string list of grades";
      String actualMessage = exception.getMessage();

      assertTrue(actualMessage.contains(expectedMessage));
    }
}
