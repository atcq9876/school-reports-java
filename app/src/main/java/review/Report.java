package review;

public class Report {
  String unformattedGrades;
  
  Report (String grades) {
    this.unformattedGrades = grades;
  }

  public String format() {
    if (unformattedGrades == "Green") {
      return "Green: 1";
    } else if (unformattedGrades == "Amber") {
      return "Amber: 1";
    } else {
      return "Red: 1";
    }
  }
}
