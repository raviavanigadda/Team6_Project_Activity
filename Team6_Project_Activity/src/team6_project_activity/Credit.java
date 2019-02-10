/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1894475
 */
package team6_project_activity;
import java.util.Date;


public class Credit
{
    String name;
    String type;
    Date expDate;
    public Credit(String name,String type,Date expDate)
    {
        this.name=name;
        this.type=type;
        this.expDate=expDate;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return this.name;
    }
    public void settype(String type)
    {
        this.type=type;
    }
    public String gettype()
    {
        return this.type;
    }
    public void setexpDate(Date expDate)
    {
        this.expDate=expDate;
    }
    public Date getexpDate()
    {
        return this.expDate;
    }
    public void authorized()
    {
        
    }
   
            
           
    
}