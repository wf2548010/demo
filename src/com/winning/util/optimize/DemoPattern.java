package com.winning.util.optimize;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoPattern {
    /**
     * 密码强度校验
     * @param args
     */
    public static void main(String[] args){
        String reg = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).{8,30}";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher("Was!1233");
        System.out.println(matcher.matches());
    }

}
