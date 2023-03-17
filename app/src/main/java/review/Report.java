package review;

public class Report {
  String unformattedGrades;
  
  Report (String grades) {
    this.unformattedGrades = grades;
  }

  public String format() {
    if (unformattedGrades == "Green" || unformattedGrades == "Amber" || unformattedGrades == "Red") {
      return unformattedGrades + ": 1";
    } else {
      return "Uncounted: 1";
    }
  }
}
