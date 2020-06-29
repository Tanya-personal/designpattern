package com.clm.designpattern.principle.dependency;

public class Cli {

  private ICourse iCourse;

  public Cli(ICourse iCourse) {
    this.iCourse = iCourse;
  }

  public void studyImoocCourse(){
    iCourse.studyCourse();
  }

  public void setiCourse(ICourse iCourse) {
    this.iCourse = iCourse;
  }
}
