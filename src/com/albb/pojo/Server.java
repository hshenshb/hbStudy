package com.albb.pojo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author: shb
 * @create: 2020-02-29 21:14
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        ServerSocket server=null;
        Socket client=null;
        BufferedReader in=null;
        PrintWriter out=null;
        String say="";
        try {
             server=new ServerSocket(9999);
              client=server.accept();
            System.out.println(client.getInetAddress().getHostAddress()+"已连接");
            in=new BufferedReader(new InputStreamReader(client.getInputStream()));
            out=new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
            while (in!=null || out!=null){
                String msg="";
                if((msg=in.readLine())!=null){
                    System.out.println("客户端："+msg);
                }
                System.out.print("您要发送的内容：");
                say=scanner.nextLine();
                out.println(say);
                out.flush();

            }



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out!=null)out.close();
            if(in!=null)in.close();
        }

    }

}
