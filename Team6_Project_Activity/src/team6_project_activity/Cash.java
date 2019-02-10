/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team6_project_activity;

/**
 *
 * @author 1895198
 */
public class Cash extends Payment 
{
    float cashTendered;
    
    public Cash(float cashTendered)
    {
        this.cashTendered=cashTendered;
    }
    
    public void setCashtendered(float cashtendered)
    {
        this.cashTendered=cashTendered;
    }
    
    public float getCashTendered()
    {
        return this.cashTendered;
    }
    
}

