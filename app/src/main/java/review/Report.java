package review;

public class Report {
  String unformattedGrades;
  
  Report (String grades) {
    this.unformattedGrades = grades;
  }

  public String format() {
    if (unformattedGrades == "Green") {
      return "Green: 1";
    } else {
      return "Amber: 1";
    }
  }
}
