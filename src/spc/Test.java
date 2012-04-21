/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spc;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Lahiru
 */
public class Test implements Runnable{
 final private  String host;
final private  String msg;
    public Test(String host,String msg) {
        this.host = host;
        this.msg=msg;
        new Thread(this).start();
    }
    public void run() {
        
        sendMAessage(host,msg);
        
    }
    private void sendMAessage(String host,String msg){
    try {
            Socket s = new Socket(host, 8888);
            s.getOutputStream().write(msg.getBytes());
            
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
          
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Test("127.0.0.1", "SDW~");
    }
}
