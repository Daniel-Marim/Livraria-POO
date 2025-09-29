
package com.mycompany.livraria;

import com.formdev.flatlaf.FlatLightLaf; 
import com.mycompany.livraria.view.Cliente.Login; 
import java.awt.EventQueue;

/**
 *
 * @author mathe
 */
public class Livraria {

    public static void main(String[] args) {

        FlatLightLaf.setup();
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}