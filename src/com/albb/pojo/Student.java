package com.albb.pojo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author: shb
 * @create: 2020-02-28 11:33
 **/
public class Student  {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://p6.qhimg.com/t0123d79ef15831e817.jpg");
        URLConnection conn = url.openConnection();
        InputStream in = conn.getInputStream();
        FileOutputStream out = new FileOutputStream("e:/b.jpg");
        int a;
        while ((a=in.read())!=-1){
            out.write(a);
        }
        out.flush();
        in.close();
        out.close();


    }
}
class b extends Student{
    Student student=new Student();
    public void a(){
        student=new b();
    }


}
