package com.company;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class EX3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Enter web name(ex: http://www.sun.com/index.html ): ");
        Scanner sc = new Scanner(System.in);
        String host = "https://fotourfo.herokuapp.com";
        String content;
        try {
            URL url = new URL(host);
            DataInputStream dis  =  new DataInputStream(url.openStream());
            while((content = dis.readLine())!=null)
                System.out.println(content);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
