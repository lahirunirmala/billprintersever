/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infinity.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import javax.swing.JOptionPane;

/**
 *
 * @author Lahiru
 */
public class HostHandler {

    File file = new File("./host");

    public Hashtable<String, String> getFromHD() {

        Hashtable<String, String> data = new Hashtable<String, String>();
        FileInputStream fin = null;
        ObjectInputStream ois = null;


        try {

            fin = new FileInputStream(file);
            ois = new ObjectInputStream(fin);
            data = (Hashtable<String, String>) ois.readObject();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "File Not Found", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
        } finally {
            try {
                ois.close();
                fin.close();

            } catch (IOException ex) {
            }
        }
        return data;

    }

    public void writeToHD(Hashtable<String, String> a) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
        } catch (Exception e) {
        } finally {
            try {
                oos.flush();
                fos.flush();
                oos.close();
                fos.close();
            } catch (IOException ex) {
            }
        }
    }
}
    
