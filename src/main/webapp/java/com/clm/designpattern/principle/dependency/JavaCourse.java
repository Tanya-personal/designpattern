package com.clm.designpattern.principle.dependency;

import org.apache.log4j.Logger;

public class JavaCourse implements ICourse {

  @Override
  public void studyCourse() {
//    System.out.println("cli学习java课程");
    Logger logger = Logger.getLogger(Test.class);
    logger.info("cli学习java课程");

  }
}
