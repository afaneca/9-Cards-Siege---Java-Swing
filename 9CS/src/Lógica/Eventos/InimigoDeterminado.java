/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica.Eventos;

import Lógica.Ações.*;
import Lógica.Carta;
import Lógica.DRM;
import Lógica.Evento;
import Lógica.Inimigo;
import Lógica.Inimigos.*;
import Lógica.Mundo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author me
 */
public class InimigoDeterminado extends Evento implements Serializable{
    List<Inimigo> inimigosAfetados;
    
    public InimigoDeterminado(Carta carta, int numero, List<Inimigo> inim){
        super(carta, numero, inim);
        nome = "Inimigo Determinado";
        
        // -1 para ataques contra Ariete
        inimigosAfetados = new ArrayList<>();
        inimigosAfetados.add(new Ariete());
        drms.add(new DRM(this, new AtaqueDeArqueiros(carta.getFortaleza()), -1, inimigosAfetados));
        drms.add(new DRM(this, new AtaqueDeAguaFervente(carta.getFortaleza()), -1, inimigosAfetados));
        drms.add(new DRM(this, new AtaqueDeCloseCombat(carta.getFortaleza()), -1, inimigosAfetados));
    }

    
}
