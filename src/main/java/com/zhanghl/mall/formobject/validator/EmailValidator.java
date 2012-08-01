package com.zhanghl.mall.formobject.validator;

import java.net.IDN;
import java.util.regex.Matcher;

public class EmailValidator {
    private static String ATOM = "[a-z0-9!#$%&'*+/=?^_`{|}~-]";
    private static String DOMAIN = "(" + ATOM + "+(\\." + ATOM + "+)*";
    private static String IP_DOMAIN = "\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\]";

    private java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(
            "^" + ATOM + "+(\\." + ATOM + "+)*@"
                    + DOMAIN
                    + "|"
                    + IP_DOMAIN
                    + ")$",
            java.util.regex.Pattern.CASE_INSENSITIVE
    );


    public boolean isValid(CharSequence value) {
        if ( value == null || value.length() == 0 ) {
            return true;
        }
        String asciiString = IDN.toASCII( value.toString() );
        Matcher m = pattern.matcher( asciiString );
        return m.matches();
    }
}
