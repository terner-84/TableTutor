/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.treehouse.mvp.tabletutor;

import java.util.Date;

/**
 *
 * @author hanus
 */
public class Data {
    private String jmeno;
    private double cisloDouble;
    private int cisloInt;
    private Date datum;

    public Data(String jmeno, double cisloDouble, int cisloInt, Date datum) {
        this.jmeno = jmeno;
        this.cisloDouble = cisloDouble;
        this.cisloInt = cisloInt;
        this.datum = datum;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public double getCisloDouble() {
        return cisloDouble;
    }

    public void setCisloDouble(double cisloDouble) {
        this.cisloDouble = cisloDouble;
    }

    public int getCisloInt() {
        return cisloInt;
    }

    public void setCisloInt(int cisloInt) {
        this.cisloInt = cisloInt;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
    
    
}
