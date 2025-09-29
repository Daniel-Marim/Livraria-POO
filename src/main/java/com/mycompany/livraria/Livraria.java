/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livraria;

import com.formdev.flatlaf.FlatLightLaf; // 1. Importa a biblioteca do tema
import com.mycompany.livraria.view.Cliente.Cadastro;
import com.mycompany.livraria.view.Cliente.Login; // 2. Importa sua tela de Login
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
                new Cadastro().setVisible(true);
            }
        });
    }
}