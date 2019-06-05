/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo2Video;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardadelima
 */
public class Main {

    public static void main(String[] args) {

        ArquivoComponent minhaPasta = new ArquivoComposite("minha pasta/");
        ArquivoComponent festa = new ArquivoComposite("festa/");
        
        ArquivoComponent VideoCerto = new ArquivoVideo("video.rmvb");
        ArquivoComponent VideoCertoEste = new ArquivoVideo("video(1).rmvb");

        ArquivoComponent videoSurpresaFinal = new ArquivoVideo("video festa Surprise.rmvb");
        videoSurpresaFinal.adicionar(VideoCerto);
        
        minhaPasta.adicionar(VideoCertoEste);
        minhaPasta.adicionar(VideoCerto);
        
        festa.adicionar(videoSurpresaFinal);
        minhaPasta.adicionar(festa);
        
        minhaPasta.printNomeDoArquivo();

    }
}
