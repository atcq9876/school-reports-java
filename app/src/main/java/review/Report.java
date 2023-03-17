package review;

public class Report {
  String[] unformattedGradesArray;
  Integer green = 0;
  Integer amber = 0;
  Integer red = 0;
  Integer uncounted = 0;
  
  Report (String grades) {
    this.unformattedGradesArray = grades.split(", ");
  }
  
  public void countGrades() {
    for (String grade : unformattedGradesArray) {
      System.out.println(grade);
      if (grade.equals("Green")) {
        green++;
        System.out.println(green);
      } else if (grade.equals("Amber")) {
        amber++;
      } else if (grade.equals("Red")) {
        red++;
      } else {
        uncounted++;
      }
    }
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
}
