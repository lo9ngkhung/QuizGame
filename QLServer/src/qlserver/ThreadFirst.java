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
import qlserver.Server1;
import static qlserver.Server1.Setthongtin;

/**
 *
 * @author longp
 */
public class ThreadFirst extends Thread {

    private final Socket socket;

    public ThreadFirst(Socket pSocket) {
        this.socket = pSocket;
    }

    
    @Override
    public void run() {
        
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            // String str = null;             
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
