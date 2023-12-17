package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {

  public static boolean validateColorCode(String color) {
    String regex = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
    Pattern p = Pattern.compile(regex);
    if (color == null) {
      return false;
    }
    Matcher m = p.matcher(color);
    return m.matches();

  }
}





