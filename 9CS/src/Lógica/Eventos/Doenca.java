/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica.Eventos;

import Lógica.Carta;
import Lógica.Evento;
import Lógica.Inimigo;
import Lógica.Mundo;
import java.util.List;

/**
 *
 * @author me
 */
public class Doenca extends Evento{

    public Doenca(Carta carta, int numero, List<Inimigo> inim){
        super(carta, numero, inim);
<<<<<<< HEAD
        nome = "Doenca";      
=======
        nome = "Ataque de Catapulta";
        
>>>>>>> 7c362e166336f5e3b30949681994d9dacec19346
    }

    @Override
    protected void acao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
