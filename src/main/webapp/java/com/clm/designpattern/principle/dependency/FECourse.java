package com.clm.designpattern.principle.dependency;

public class FECourse implements ICourse {

  @Override
  public void studyCourse() {
    System.out.println("cli学习前端课程");
  }
}
