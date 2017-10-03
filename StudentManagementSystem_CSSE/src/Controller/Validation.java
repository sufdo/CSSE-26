/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Rishni
 */
public class Validation {
    public static Boolean isEmpty(String textfield1,String textfield2)
    {
        String TextValue1=textfield1;
        String Textvalue2=textfield2;
        if(TextValue1.isEmpty()||Textvalue2.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Cant leave fields empty");
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
