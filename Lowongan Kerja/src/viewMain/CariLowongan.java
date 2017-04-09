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
import java.awt.event.MouseAdapter;
import java.util.List;
import javax.swing.JList;

public class CariLowongan extends javax.swing.JPanel{
    
    public CariLowongan() {
        initComponents();
    }

    public void setjList1(List<String> jList1) {
        this.jList1 = (JList<String>) jList1;
    }
    public void addAdapter(MouseAdapter e) {
        jList1.addMouseListener(e);
    }
}
