/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinity.logics;

import com.infinity.gui.MainDash;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *
 * @author Lahiru
 */
public class SeverLogger implements Runnable {

    private ServerSocket sSocket;

    public synchronized void run() {
        try {
            while (true) {                
                Thread.sleep(100);
                Socket inSocket = sSocket.accept();
                byte[] b = new byte[1024];
                inSocket.getInputStream().read(b);
                String s = new String(b);
                String[] split = s.split("~");
                MainDash.txtLogState.append(split[0]+"\n");                
            }
            
        } catch (Exception ex) {
        }
    }

    public SeverLogger() throws Exception{
        try {
            this.sSocket = new ServerSocket(8889);
            new Thread(this).start();
        } catch (IOException ex) {
           
        }
    }
    
}
