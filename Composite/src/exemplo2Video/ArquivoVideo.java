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
public class ArquivoVideo implements ArquivoComponent {
    
    String nomeDoArquivo;
    
    public ArquivoVideo(String nomeDoArquivo) {
	this.nomeDoArquivo = nomeDoArquivo;
    }     

    @Override
    public String getNomedoArquivo() {
        return this.nomeDoArquivo;
    }

    @Override
    public void printNomeDoArquivo() {
        System.out.println(this.nomeDoArquivo);
    }

    @Override
    public void adicionar(ArquivoComponent novoArquivo) {
    }

    @Override
    public void remover(String nomeDoArquivo) throws Exception{
    }
}
