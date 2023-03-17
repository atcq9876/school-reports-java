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
}
