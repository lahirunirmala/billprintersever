/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infinity.logics;

import com.infinity.gui.MainDash;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Lahiru
 */
public class StartNortify implements Runnable{
    private String host, ip;

    public StartNortify(String host,String ip) {
        this.host = host;
        this.ip =ip;
      
    }
   

    public void run() {
        try {
            Socket s = new Socket(ip, 8888);
            s.getOutputStream().write(new String("AYT~").getBytes());
              MainDash.txtLogState.append("Sending .."+host+" on"+ip+" ....\n");
              
        } catch (UnknownHostException ex) {
           MainDash.txtLogState.append("....."+host+" on"+ip+" Not Found ....\n");
        }catch (ConnectException ex){
            MainDash.txtLogState.append("....."+host+" on"+ip+" Not Conected yet ....\n");
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
}
