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

public class EX7 {
    public static void main(String args[]) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Link: ");
            String link_path = scanner.nextLine();
            URL url = new URL(link_path);
            URLConnection conn = url.openConnection();
            InetAddress address = InetAddress.getByName(url.getHost());
            conn.setRequestProperty("host_name", url.getHost());
            conn.setRequestProperty("ip_addresss", address.toString());
            conn.connect();
            System.out.println("After save cookie \n");
            System.out.println(conn.getRequestProperty("host_name"));
            System.out.println(conn.getRequestProperty("ip_addresss"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
