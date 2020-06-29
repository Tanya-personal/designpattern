package com.clm.designpattern.principle.openclose;

public class JavaDiscountCourse extends JavaCourse {

  public JavaDiscountCourse(Integer id, String name, Double price) {
    super(id, name, price);
  }

  public Double getOriginalPrice() {
    return super.getPrice();
  }

  @Override
  public Double getPrice() {
    if (getOriginalPrice() > 300d) {
      return getOriginalPrice() * 0.8;
    } else if (getOriginalPrice() <= 300d && getOriginalPrice() > 200d) {
      return getOriginalPrice()
          * 0.9;
    } else {
      return super.getPrice();
    }
  }
}
