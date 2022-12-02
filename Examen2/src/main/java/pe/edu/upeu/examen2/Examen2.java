/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pe.edu.upeu.examen2;

import pe.edu.upeu.examen2.gui.EstructuraTicTacToe;
import pe.edu.upeu.examen2.gui.Inicio;
import pe.edu.upeu.examen2.gui.SystemG;

/**
 *
 * @author HP
 */
public class Examen2 {

    public static void main(String[] args) {
        EstructuraTicTacToe model = new EstructuraTicTacToe();
        Inicio view = new Inicio();
        SystemG SysGamer = new SystemG(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
}
