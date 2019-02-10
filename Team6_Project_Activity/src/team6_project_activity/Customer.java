/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team6_project_activity;

/**
 *
 * @author 1895212
 */
public class Customer {
    String name;
    String address;
    
    public Customer(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    
    public void setName(String n)
    {
        this.name = n;
    }
    
    public void setAddress(String a)
    {
        this.address = a;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void display()
    {
        System.out.println("Customer name is: "+name+"\nCustomer address is: "+address);
    }

}
