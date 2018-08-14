/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.treehouse.mvp.tabletutor;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hanus
 */
public class TernerTableModel extends AbstractTableModel {
    public static int[] COLUMN_WIDTHS = {8,14,14,24};
    private final String[] COLUMN_NAMES = {"Jméno", "Číslo Integer", "Číslo Double", "Datum"};
    private List<Data> dataList;
    public TernerTableModel(List<Data> dataList) {
        this.dataList = dataList;
    }

    @Override
    public int getRowCount() {
        return dataList.size();
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }
    
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Data dt = dataList.get(rowIndex);
        Object returnValue = null;
        switch (columnIndex) {
            case 0:
                returnValue = dt.getJmeno();
                break;
            case 1:
                returnValue = dt.getCisloInt();
                break;
            case 2:
                returnValue = dt.getCisloDouble();
                break;
            case 3:
                returnValue = dt.getDatum();
                break;
            default:
                returnValue = null;
        }
        return returnValue;
    }
}
