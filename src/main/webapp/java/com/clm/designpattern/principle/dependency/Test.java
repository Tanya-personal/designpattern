package com.clm.designpattern.principle.dependency;


public class Test {

  /* public static void main(String[] args) {
     Cli cli = new Cli(new PythonCourse());
     cli.studyImoocCourse();
   }
 */
  public static void main(String[] args) {
    Cli cli = new Cli(new FECourse());
    cli.setiCourse(new JavaCourse());
    cli.studyImoocCourse();
  }
}
