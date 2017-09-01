package com.example.trw.sampleunittest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by TRW on 6/8/2560.
 */

public class Sample {

    public static final String REGEX = "\\d{4}-\\d{4}-\\d{2}";

    public static boolean checkPhoneNumber(String number) {

        if (number == null) {
            return false;
        }

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(number);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
}

