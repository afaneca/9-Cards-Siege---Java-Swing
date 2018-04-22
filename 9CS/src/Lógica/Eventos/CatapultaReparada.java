/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica.Eventos;

import Lógica.Ações.RepararMuralha;
import Lógica.Carta;
import Lógica.DRM;
import Lógica.Evento;
import Lógica.Fortaleza;
import Lógica.Inimigo;
import Lógica.Mundo;
import java.util.List;

/**
 *
 * @author me
 */
public class CatapultaReparada extends Evento {

    public CatapultaReparada(Carta carta, int numero, List<Inimigo> inim){
        super(carta, numero, inim);
        nome = "Catapulta Reparada";
        drms.add(new DRM(new RepararMuralha(carta.getFortaleza()), 1)); // +1 para ações de reparação da muralha
    }

    @Override
    protected void acao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
