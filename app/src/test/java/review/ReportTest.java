package review;

import static org.junit.Assert.*;
import org.junit.Test;

public class ReportTest {
    @Test public void testSingleGreenInput() {
      String grade = "Green";
      Report report = new Report(grade);
      assertEquals(report.format(), "Green: 1");
    }

    @Test public void testSingleAmberInput() {
      String grade = "Amber";
      Report report = new Report(grade);
      assertEquals(report.format(), "Amber: 1");
    }

    @Test public void testSingleRedInput() {
      String grade = "Red";
      Report report = new Report(grade);
      assertEquals(report.format(), "Red: 1");
    }

    @Test public void testUncountedValue() {
      String grade = "blah";
      Report report = new Report(grade);
      assertEquals(report.format(), "Uncounted: 1");
    }

    @Test public void testTwoGreenValues() {
      String grade = "Green, Green";
      Report report = new Report(grade);
      assertEquals(report.format(), "Green: 2");
    }
}
