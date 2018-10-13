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

public class AllowUserInteraction {

    public static void main(String args[]) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter Link: ");
//            String link = scanner.nextLine();
            URL url = new URL("http://www.java2s.com");
            URL url_item1 = new URL("https://fotour.herokuapp.com/");
            URLConnection conn = url.openConnection();
            InetAddress address = InetAddress.getByName(url.getHost());
//        System.out.println(address.toString());
            conn.setRequestProperty("host_name", url.getHost());
            conn.setRequestProperty("ip_addresss", address.toString());
            conn.connect();
            System.out.println("After save cookie \n");
            System.out.println(conn.getRequestProperty("host_name"));
            System.out.println(conn.getRequestProperty("ip_addresss"));
            List<URL> myList = new ArrayList<>();//make a new list
            myList.add(url_item1);//add element
            if (myList.contains(url)) {
                System.out.println("Trang Web Đã Bị Cấm");
            } else {
                String host = "https://fotourfo.herokuapp.com";
                String content;
                try {
                    URL url1 = new URL(url.toString());
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
