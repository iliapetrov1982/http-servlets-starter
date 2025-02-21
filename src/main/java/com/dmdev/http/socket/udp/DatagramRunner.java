package com.dmdev.http.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class DatagramRunner {
    public static void main(String[] args) throws IOException {
        var inetAddress = InetAddress.getByName("localhost");
        try(var datagramSocket = new DatagramSocket();) {
            var bytes = "hello from UDP client".getBytes();
            DatagramPacket packet =new DatagramPacket(bytes, bytes.length, inetAddress, 7777);
            datagramSocket.send(packet);
        }
    }
}
