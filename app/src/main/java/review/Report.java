package review;

public class Report {
  private String[] unformattedGradesArray;
  private Integer green = 0;
  private Integer amber = 0;
  private Integer red = 0;
  private Integer uncounted = 0;
  
  Report (String grades) {
    if (grades == "") { throw new IllegalArgumentException("Please enter a comma-separated string list of grades"); }
    this.unformattedGradesArray = grades.replaceAll(" ", "").toLowerCase().split(",");
  }

  public String getFormattedReport() {
    this.countGrades();
    String formattedReport = "";

    if (green > 0) { formattedReport = "Green: " + green; }
    if (amber > 0 && formattedReport != "") { formattedReport += "\n"; }
    if (amber > 0) { formattedReport += ("Amber: " + amber); }
    if (red > 0 && formattedReport != "") { formattedReport += "\n"; }
    if (red > 0) { formattedReport += ("Red: " + red); }
    if (uncounted > 0 && formattedReport != "") { formattedReport += "\n"; }
    if (uncounted > 0) { formattedReport += ("Uncounted: " + uncounted); }

    return formattedReport;
  }

  private void countGrades() {
    for (String grade : unformattedGradesArray) {
      System.out.println(grade);
      if (grade.equals("green")) {
        green++;
      } else if (grade.equals("amber")) {
        amber++;
      } else if (grade.equals("red")) {
        red++;
      } else if (grade.equals("")) {
        continue;
      } else {
        uncounted++;
      }
    }
  }
}
