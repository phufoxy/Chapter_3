package com.company;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX6 {
    public static void main(String args[]) throws Exception {
        try {
            List<URL> myList = new ArrayList<>();//make a new list
//            blacklist
            myList.add(new URL("http://www.java2s.com"));
            myList.add(new URL("https://fotour.herokuapp.com/"));
            System.out.println("Enter Link Web: ");
            Scanner scanner = new Scanner(System.in);
            String link_path = scanner.nextLine();
            URL link = new URL(link_path);
            if (myList.contains(link)) {
                System.out.println("Trang Web Đã Bị Cấm");
            } else {
                String content = "";
                try {
                    URL url1 = new URL(link.toString());
                    DataInputStream dis = new DataInputStream(url1.openStream());
                    while ((content = dis.readLine()) != null)
                        System.out.println(content);
                } catch (MalformedURLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
