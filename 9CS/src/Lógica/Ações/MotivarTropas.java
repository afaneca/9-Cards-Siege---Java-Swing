/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica.Ações;

import Lógica.Acao;
import Lógica.Fortaleza;
import java.io.Serializable;

/**
 *
 * @author me
 */
public class MotivarTropas extends Acao implements Serializable{
    
    public MotivarTropas(Fortaleza fortaleza){
        super("Motivar as Tropas", fortaleza);
        setReutilizavel(true);
    }
}
