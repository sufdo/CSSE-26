/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import javax.swing.JOptionPane;

/**
 *
 * @author Rishni
 */
public class Validation {
    public Boolean isEmpty(String textfield)
    {
        String TextValue=textfield;
        if(TextValue.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter Faculty Name");
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
