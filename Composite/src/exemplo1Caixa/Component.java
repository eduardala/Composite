/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1Caixa;

/**
 *
 * @author debor
 */
public abstract class Component {
    protected String nome;
    
    public String getNome(){
        return this.nome;
    }
    public void getPrint(){
        System.out.println(this.nome);
    }
     
}
