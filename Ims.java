/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;

/**
 *
 * @author ADARSH
 */
public class Ims {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        splashscreen splashscreen = new splashscreen();
        splashscreen.setVisible(true);
        Login Login = new Login();
        try
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(1);
                splashscreen.loadingnum.setText(Integer.toString(i)+"%");
                splashscreen.loadingbar.setValue(i);
                if(i==100)
                {
                    splashscreen.setVisible(false);
                    Login.setVisible(true);
                }
            }
        }catch(Exception e)
        {
            
        }
    }
    
}
