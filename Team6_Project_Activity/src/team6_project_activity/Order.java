/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team6_project_activity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 1895212
 */
public class Order {
    Date date = parseDate("10-02-2019");
    String status;
    Customer c = new Customer("Johnson","6590 Sunnybrooke");
    
    public Order(String status)
    {
        this.status = status;
    }
    
    public void setDate(Date d)
    {
        date = d;
    }
    
    public Date getDate(Date d)
    {
        return date;
    }
    
    public void setStatus(String s)
    {
        this.status = s;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void calcSubTotal(){
    
    }
    
    public void calcTax(){
        
    }
    
    public void calcTotal(){
   
    }
    
    public void calcTotalWeight(){
    
    }
    
    public void display()
    {
        System.out.println("Status is "+status+"\nDate is "+ date);
    }
        
    public static Date parseDate(String date) {
     try {
         return new SimpleDateFormat("dd-MM-yyyy").parse(date);
     } catch (ParseException e) {
         return null;
     }
  }

}

