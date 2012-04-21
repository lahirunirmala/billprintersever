/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infinity.logics;

import com.infinity.gui.MainDash;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Lahiru
 */
public class MessageSender implements Runnable{
final private  String host;
final private  String msg;
    public MessageSender(String host,String msg) {
        this.host = host;
        this.msg=msg;
        new Thread(this).start();
    }
    public void run() {
        MainDash.txtLogState.append("Sending Command to.."+host+" ....\n");
        sendMAessage(host,msg);
        
    }
    private void sendMAessage(String host,String msg){
    try {
            Socket s = new Socket(host, 8888);
            s.getOutputStream().write(msg.getBytes());
             MainDash.txtLogState.append("Done !!\n");
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
           MainDash.txtLogState.append("....."+host+" Not Found ....");
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
    
}
