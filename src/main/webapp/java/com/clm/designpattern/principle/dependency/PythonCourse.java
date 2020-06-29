package com.clm.designpattern.principle.dependency;

public class PythonCourse implements ICourse {

  @Override
  public void studyCourse() {
    System.out.println("cli学习Python课程");
  }
}
