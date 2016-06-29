/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uijavafx.objects;

/**
 *
 * @author seryozha
 */
public class Person {
 
    private String name;
    private String surName;
    private int age;
    private String phoneNumber;
    private String address;
    
    Person( String name, String surName, int age,
        String phoneNumber, String address){
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getSurName(){
        return this.surName;
    }
    public int getAge(){
        return this.age;
    }
    
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getAddress(){
        return this.address;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSurName(String surName){
        this.surName = surName;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address){
        this.address = address; 
    }
}
