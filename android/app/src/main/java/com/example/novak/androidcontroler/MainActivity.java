package com.example.novak.androidcontroler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.InetAddress;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    try {
        ClientSocket client = new ClientSocket(
                InetAddress.getByName("10.0.22.93"),
                Integer.parseInt("5050"));

        System.out.println("\r\nConnected to Server: " + client.getSocketAddress());
        client.start();
    }catch (Exception e) {e.printStackTrace();}

    }
}
