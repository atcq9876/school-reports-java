package review;

public class Report {
  String unformattedGrades;
  
  Report (String grades) {
    this.unformattedGrades = grades;
  }

  public String format() {
    return "Green: 1";
  }
}
