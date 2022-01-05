/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import static qlserver.Server1.user;

/**
 *
 * @author longp
 */
public class ThreadThongtin extends Thread {

    private final Socket socket;

    public ThreadThongtin(Socket pSocket, int count) {
        this.socket = pSocket;
        int clientNo = count;
    }

    @Override
    public void run() {

        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            String str = dis.readUTF();
            String[] arrStr = str.split("///");
            String s1 = arrStr[1];

            boolean str1 = ConnectDth.getIdMASV(s1);
            if (str1 == true) {
                dos.writeUTF("Fail");
            } else {
                dos.writeUTF("Success");
            }

            dis.close();
            dos.close();
            socket.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
