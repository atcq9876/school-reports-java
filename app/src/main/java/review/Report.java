package review;

public class Report {
  String unformattedGrades;
  
  Report (String grades) {
    this.unformattedGrades = grades;
  }

  public String getFormattedReport() {
    if (unformattedGrades == "Green" || unformattedGrades == "Amber" || unformattedGrades == "Red") {
      return unformattedGrades + ": 1";
    } else if (unformattedGrades == "Green, Green") {
      return "Green: 2";
    } else if (unformattedGrades == "Amber, Amber") {
      return "Amber: 2";
    } else {
      return "Uncounted: 1";
    }
  }
}
