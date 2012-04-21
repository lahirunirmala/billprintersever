/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.infinity.gui;

import com.stefankrause.xplookandfeel.XPLookAndFeel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Lahiru
 */
public class Main {
    public static void main(String[] args) {
        try {
           // LookAndFeel theme1 = new XPLookAndFeel();
            //UIManager.setLookAndFeel(theme1);
            new MainDash().setVisible(true);
        } catch (Exception ex) {
         
        }
    }
}
