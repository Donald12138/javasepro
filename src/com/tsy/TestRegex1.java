package com.tsy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex1 {
    public static void main(String[] args) {
        //正则表达式练习

        String str = "Java待定是啊第七位jAva111，打定五点jaVa12年度赛不嗲不嗲,等死啊嗲javA5";

        String regex1 = "(?i)java(?=\\d{3})";
        String regex2 = "(?i)java(?:\\d{3})";
        String regex3 = "(?i)java(?!\\d{3})";

        String regex4 = "ab+";
        String regex5 = "ab+?";

        //1.获取正则表达式的对象
        Pattern p = Pattern.compile(regex1);
        //2.获取文本匹配器的对象
        //拿着m去读取str，找符合p规则的子串
        Matcher m = p.matcher(str);

        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }

}
