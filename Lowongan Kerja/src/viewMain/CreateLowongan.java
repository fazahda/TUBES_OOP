/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewMain;

/**
 *
 * @author faza
 */

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class CreateLowongan extends javax.swing.JPanel {
    public CreateLowongan() {
        initComponents();
    }

    public Object getjButton1() {
        return jButton1;
    }

    public String getjTextField1() {
        return jTextField1.getText();
    }

    public String getjTextField2() {
        return jTextField2.getText();
    }

    public String getjTextField3() {
        return jTextField3.getText();
    }
    public void addListener(ActionListener e) {
        jButton1.addActionListener(e);
    }
    
    
}
