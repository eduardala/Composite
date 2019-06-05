/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo2Video;

/**
 *
 * @author eduardadelima
 */
public interface ArquivoComponent {
   
    public String getNomedoArquivo();
    public void printNomeDoArquivo();  
    public void adicionar(ArquivoComponent novoArquivo);
    public void remover(String nomeDoArquivo) throws Exception;
}
