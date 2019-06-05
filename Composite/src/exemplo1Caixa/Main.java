/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1Caixa;

import java.util.ArrayList;

/**
 *
 * @author debor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Component> lista = new ArrayList<>();
        caixa caixa1 = new caixa("Caixa Utensilios Domesticos");
        caixa caixa2 = new caixa("Caixa Talheres");

        item faca = new item("Faca");
        item colher = new item("Colher");
        item concha = new item("Concha de silicone");

        caixa1.add(concha); 
        caixa2.add(faca);
        caixa2.add(colher);
        caixa1.add(caixa2);
        caixa1.getPrint();
        System.out.println("==========");
        
        lista = caixa2.getChildrens();
        for (Component l : lista) {
            System.out.println(l.getNome());
        }
        System.out.println("==========");
        caixa1.remove(concha);
        caixa1.getPrint();

    }

}
