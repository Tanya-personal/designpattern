package com.clm.designpattern.principle.openclose;

import org.apache.log4j.Logger;

public class Test {

  public static void main(String[] args) {
    ICourse course = new JavaDiscountCourse(18, "java入门", 290d);


    Logger logger = Logger.getLogger(Test.class);

    logger.info("课程ID："+course.getId()+" 课程名称："+course.getName()+" 课程价格："+course.getPrice() +" 课程原价"+((JavaDiscountCourse) course).getOriginalPrice());



    logger.error("error");
    logger.debug("debug");
    logger.info("info");
    logger.warn(logger.getName()+",warn");
  }

}
