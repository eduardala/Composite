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
public class caixa extends Component {

    // composite
     protected ArrayList<Component> lista;

    public caixa() {
    }
    protected caixa(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    public void add(Component c) {
        this.lista.add(c);
    }
    public void remove(Component c) {
        lista.remove(c);
    }
    public Component getChild(int filho) {
        return (Component)lista.get(filho);
    }
    public ArrayList<Component> getChildrens(){
        return this.lista;
    }
    @Override
    public void getPrint(){
        System.out.println(this.nome);
        for(Component l: lista){
            l.getPrint();
        }
    }


    

}