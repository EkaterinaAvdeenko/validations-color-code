package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        String regex = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        Pattern p = Pattern.compile(regex);
        // Если строка пустая, то вернуть ноль
        // вернуть false
        if (color == null) {
            return false;
        }
        // Pattern class содержит matcher() метод
        Matcher m = p.matcher(color);
        return m.matches();

    }
}





