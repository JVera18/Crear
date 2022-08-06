/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.impl;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author USER
 */
public class imgTabla extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        if(value instanceof JLabel){
            JLabel lbl = (JLabel)value;
            return lbl;
        }
    
        if(value instanceof JButton){
            JButton button = (JButton)value;
            if (isSelected) {
      button.setForeground(table.getSelectionForeground());
      button.setBackground(table.getSelectionBackground());
    } else {
      button.setForeground(table.getForeground());
      button.setBackground(UIManager.getColor("Button.background"));
    }
            return button;
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
    }
    
    
}
