/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infinity.logics;

import com.infinity.gui.MainDash;
import com.infinity.io.HostHandler;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Lahiru
 */
public class Computers {
   
    public  static Hashtable<String,String> COMPUTER_SET;
    static {
    COMPUTER_SET=new HostHandler().getFromHD();
    }
    public Computers() {
        COMPUTER_SET=new HostHandler().getFromHD();
    }
   
    
    
    public void getComputers(){
Vector<String>computers =new Vector<String>();
        Enumeration<String> elements = COMPUTER_SET.elements();
        while (elements.hasMoreElements()) {
            String string = elements.nextElement();
            computers.add(string);
        }
        Collections.sort(computers);
        MainDash.lstHosts.setListData(computers);
                
    }
    public String getIpAddress(String id){
        String get = COMPUTER_SET.get(id);
        System.out.println(get);
        return get;
    }
}
