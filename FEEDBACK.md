## Feedback from Kieran

**Score as of Dec 5, 2021:** 60/75

* We discussed the reason why the project, when pulled from the repository, 
  does not compile, and that the tests run for you, +20 points
  
* The runtimes listed in README.md are still all wrong.  As mentioned previously,
  the correct runtimes are given in zyBook, so this is still -15 points

**Score as of Nov 20, 2021:** 40/75

* Your code does not compile.  One reason for this is that the package name
  declared on line 1 of each .java file does not match the path and name of the directory
  in which that .java file is stored.  This is rule of Java.  For example, the class named `SelectionSortPriorityQueue`,
  which is declared to be in the package named `comp271.sorting`, must be stored in a file named 
  **SelectionSortPriorityQueue.java**, and that file must be stored in directory path of **comp271/sorting**.
  * Code does not compile for incorrect package/directory relationship: -15 points
  
* The other reason this code does not compile is that there is no build tool to 
  tell the Java compiler (`javac`)  where to locate third-party libraries like 
  `org.junit.jupiter.api.Test`, which is imported into each of your test classes.  
  One of the things we get from a build tool like Gradle, is ***dependency management***.  
  ***Dependency management*** is what would make the JUnit imports available to your code.  
  The build tool also manages the directory structure of the project, which helps avoid the  
  problem described above.  The assignment specifically called for a **Gradle** project.
  * Not compiling for lack of build tool to locate dependencies and code to compile: no additional points off
  
* Your test programs do not run. You have test classes, but they don't run if they don't compile.  
  * Tests don't run: -5 points

* Your summaries and explanations in the README are all incorrect.  The correct answers are
  written in the textbook.
  * Incorrect running time of Selection Sort: -5 points
  * Incorrect running time of Merge Sort: -5 points
  * Incorrect running time of Quick Sort: -5 points
  
If you want to increase your score you can fix these problems and resubmit anytime until the end
of the term, and you can resubmit as many times as you like.  

