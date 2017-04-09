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

public class CreateBerkas extends javax.swing.JPanel {
    public CreateBerkas() {
        initComponents();
    }

    public String getjTextField1() {
        return jTextField1.getText();
    }

    public Object getjButton1() {
        return jButton1;
    }
    public void addListener(ActionListener e) {
        jButton1.addActionListener(e);
    }
}
