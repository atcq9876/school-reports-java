## Description
School reports
Help teachers find out how students perform on tests
String of comma separated values (test results)
Build a simple report of test results

## Input/output

Input                                 Output
"Green, Green, Amber, Red, Green"     "Green: 3\nAmber: 1\nRed: 1"
"Green, Green"                        "Green: 2"
"green"                               "Green: 1"
"red, brown"                          "Red: 1\nUncounted: 1"
"Green,amber,Red"                     "Green: 1\nAmber: 1\nRed: 1"
"Green,,Green,Red,"                   "Green: 2\nRed: 1"
non-string value                      Error: "Input should be a comma-separated string"
