package com.albb.pojo;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author: shb
 * @create: 2020-02-29 21:33
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        Socket socket=null;
        BufferedReader in=null;
        PrintWriter out=null;
        String say="";
        try {
            socket=new Socket("192.168.1.5",9999);
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (in!=null || out!=null){
                System.out.print("您要发送的内容：");
                say=scanner.nextLine();
                out.println(say);
                out.flush();
                String msg="";
                if((msg=in.readLine())!=null){
                    System.out.println("服务器说："+msg);
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out!=null)out.close();
            if(in!=null)in.close();
        }
    }
}
