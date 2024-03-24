package com.dmdev.http.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {

    public static void main(String[] args) throws IOException {
        var url = new URL("file:/Users/mac-ilia/Documents/java/udemy/network/http-servlets-starter/src/main/java/org/example/dmdev/http/socket/udp/DatagramRunner.java"); //
        var urlConnection = url.openConnection();

        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));
    }

    private static void checkGoogle() throws Exception {
        var url = new URL("https://www.google.com");
        var urlConnection = url.openConnection();
        urlConnection.setDoOutput(true);

        try (var outputStream = urlConnection.getOutputStream()) {
        }

        System.out.println(urlConnection.getHeaderFields());
    }
}
