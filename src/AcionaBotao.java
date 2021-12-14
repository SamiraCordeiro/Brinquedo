/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class AcionaBotao {
    public static void main(String[] args) {
        Aviao av = new Aviao();
        controleRemoto c = new controleRemoto(av);
        av.mover();
        
    }
}
