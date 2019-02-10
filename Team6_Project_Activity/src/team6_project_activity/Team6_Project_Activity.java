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
public class Team6_Project_Activity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Order o = new Order("Ordered");
        Customer c = new Customer("Johnson","6590 Sunnybrooke");
        o.display();
        c.display();
       
    }
    
}
