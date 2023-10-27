package com.tsy;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TestRegex2 {
    public static void main(String[] args) throws IOException {
        //创建一个URL对象
        URL url = new URL("https://baijiahao.baidu.com/s?id=1780064217901531743&wfr=spider&for=pc");
        //连接上这个网站
        URLConnection conn = url.openConnection();
        //创建一个对象去读取网络中的数组
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();


    }
}
