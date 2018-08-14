/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.treehouse.mvp.tabletutor;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author hanus
 */
public class TernerTableRenderer extends JLabel implements TableCellRenderer{

    private final TableCellRenderer tcr = new DefaultTableCellRenderer();
    Font f = new Font("Verdana", Font.BOLD, 14);
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel cell = (JLabel) tcr.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        cell.setHorizontalAlignment(value instanceof String ? SwingConstants.LEFT : SwingConstants.RIGHT);
        
        
        
        if (column == 1 && ((int) value == 95461)) {
            cell.setForeground(Color.red);
        } else {
            cell.setForeground(Color.BLUE);
        }
        
        if (isSelected) {
            cell.setFont(f);
            cell.setForeground(Color.WHITE);
        }
        
        return cell;
    }
    
}
