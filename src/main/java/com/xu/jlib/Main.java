package com.xu.jlib;

import java.lang.reflect.Field;

public class Main {

  private String str = A.str;
  
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

    System.out.println(new Main().str);


      Field intField = A.class.getDeclaredField("anInt");
    Field integerField = A.class.getDeclaredField("integer");
    Class<?> cls =   A.class.getDeclaredField("anInt").getType();

      cls =   integerField.getType();
      integerField.setAccessible(true);
      intField.setAccessible(true);
      Object v = integerField.get(new A());
      v = intField.get(new A());
      System.out.print(v);
  }
}
