/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author longp
 */
public class ThreadThi extends Thread {

    int clientNo;
    public static String tr = ConnectDth.getAllCauHoi();
    private final Socket socket;

    public ThreadThi(Socket pSocket, int counter) {
        this.socket = pSocket;
        clientNo = counter;
    }

    public void run() {
        try {

            int core = 0;
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            if (true) {

                dos.writeUTF(tr);
                dos.flush();
               
                
            }
            dis.close();
            dos.close();
            socket.close();

        } catch (IOException ex) {
            Logger.getLogger(ThreadThi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
