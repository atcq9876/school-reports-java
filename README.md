# School reports coding challenge (Java)

## Description
School reports
For this challenge, I built a test-driven Java program which helps teachers find out how students have performed in their tests.
The program takes a string of comma separated values (test results), and neatly formats these results into a report.
See below for example input and output of the program.

__Input__                           |   __Output__
------------------------------------|--------------------------------------------
Input                               |  Output
"Green, Green, Amber, Red, Green"   |  "Green: 3\nAmber: 1\nRed: 1"
"Green, Green"                      |  "Green: 2"
"green"                             |  "Green: 1"
"red, brown"                        |  "Red: 1\nUncounted: 1"
"Green,amber,Red"                   |  "Green: 1\nAmber: 1\nRed: 1"
"Green,,Green,Red,"                 |  "Green: 2\nRed: 1"
""                                  |  Exception: "Input should be a comma-separated string"