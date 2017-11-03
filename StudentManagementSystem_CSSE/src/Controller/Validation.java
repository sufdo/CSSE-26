/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Constants.MessageConsts;
import javax.swing.JOptionPane;

/**
 *
 * @author Rishni
 */
public class Validation {
    public static Boolean isEmpty(String textfield1)
    {
        String TextValue1=textfield1;
        
        if(TextValue1.isEmpty())
        {
            JOptionPane.showMessageDialog(null, MessageConsts.NEED_FACULTY);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static Boolean isEmptyEvent(String textfield1)
    {
        String TextValue1=textfield1;
        
        if(TextValue1.isEmpty())
        {
            JOptionPane.showMessageDialog(null, MessageConsts.NEED_EVENT);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static Boolean isEmpty(String textfield1,String textfield2)
    {
        String TextValue1=textfield1;
        String Textvalue2=textfield2;
        if(TextValue1.isEmpty()||Textvalue2.isEmpty())
        {
            JOptionPane.showMessageDialog(null, MessageConsts.EMPTY_FIELDS);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static Boolean isEmpty(String textfield1,String textfield2,int textfield3,int textfield4,String textfield5)
    {
        String TextValue1=textfield1;
        String Textvalue2=textfield2;
        int Textfield3=textfield3;
        int Textfield4=textfield4;
        String Textvalue5=textfield5;
        
        if(TextValue1.isEmpty()||Textvalue2.isEmpty() || Textfield3==0 || Textfield4 ==0 || Textvalue5.isEmpty())
        {
            JOptionPane.showMessageDialog(null, MessageConsts.EMPTY_FIELDS);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static Boolean isEmptyEvent(String textfield1,String textfield2,int textfield3,String textfield4,String textfield5,String textfield6,String textfield7)
    {
        String TextValue1=textfield1;
        String Textvalue2=textfield2;
        int Textfield3=textfield3;
        String Textfield4=textfield4;
        String Textvalue5=textfield5;
        String Textfield6=textfield6;
        String Textvalue7=textfield7;
        
        if(TextValue1.isEmpty()||Textvalue2.isEmpty() || Textfield3==0 || Textfield4.isEmpty() || Textvalue5.isEmpty()|| Textfield6.isEmpty() || Textvalue7.isEmpty())
        {
            JOptionPane.showMessageDialog(null, MessageConsts.EMPTY_FIELDS);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static Boolean isEmptyEvent(String textfield2,int textfield3,String textfield4,String textfield5,String textfield6,String textfield7)
    {
        String Textvalue2=textfield2;
        int Textfield3=textfield3;
        String Textfield4=textfield4;
        String Textvalue5=textfield5;
        String Textfield6=textfield6;
        String Textvalue7=textfield7;
        
        if(Textvalue2.isEmpty() || Textfield3==0 || Textfield4.isEmpty() || Textvalue5.isEmpty()|| Textfield6.isEmpty() || Textvalue7.isEmpty())
        {
            JOptionPane.showMessageDialog(null, MessageConsts.EMPTY_FIELDS);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //validating nic
    public static Boolean checkNIC(String nic)
    {
        if(!nic.matches("^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][vV]$"))
        {
            JOptionPane.showMessageDialog(null, MessageConsts.NIC_INVALID);
            return false;
        }
        else
        {
            return true;
        }
    }
    
}
