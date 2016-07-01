/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.personstree;

/**
 *
 * @author michaelcavey
 */

public class Person {
    private int p_id;
    private String first_name;
    private String last_name;
    private String birthday;    

    public int getP_id() {
        return p_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setP_id(int id) {
        this.p_id = id;
    }

    public void setFirst_name(String name) {
        this.first_name = name;
    }

    public void setLast_name(String name) {
        this.last_name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
  
    /*
    @Override   // Code from http://howtodoinjava.com/core-java/cloning/a-guide-to-object-cloning-in-java/
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String display() {       
        return first_name + " " + last_name;
    }    
    */   
}

