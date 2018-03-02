package com.example.novak.androidcontroler;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
    private Socket socket;
    private Scanner scanner;
    ClientSocket(InetAddress serverAddress, int serverPort) throws Exception {
        this.socket = new Socket(serverAddress, serverPort);
        this.scanner = new Scanner(System.in);
    }
    public void start() throws IOException {
        String input;
        while (true) {
            input = scanner.nextLine();
            PrintWriter out = new PrintWriter(this.socket.getOutputStream(), true);
            out.println(input);
            out.flush();
        }
    }
    public InetAddress getSocketAddress() {
        return this.socket.getInetAddress();
    }

    public int getPort() {
        return this.socket.getLocalPort();
    }

}



