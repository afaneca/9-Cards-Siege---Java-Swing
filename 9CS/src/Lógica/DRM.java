/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author me
 */
public class DRM implements Serializable{ 
    // DICE RESULT MOFICATION
    protected Evento evento;
    protected int var; // variação no resultado
    protected Acao acao; // ação afetada pela variação
    protected List<Inimigo> inimigosAfetados; 
    protected boolean afetaInimigos;


    
    public DRM(Evento e, Acao acao, int var){ // CONSTRUTOR PADRÃO
        this.evento = e;
        this.var = var;
        this.acao = acao;
        inimigosAfetados = new ArrayList<>(evento.getInimigos());
        afetaInimigos = true;
    }
    
    public DRM(Evento e, Acao acao, int var, List<Inimigo> inimigos){ // CONSTRUTOR PARA QUANDO O DRM SÓ AFETAR INIMIGOS ESPECÍFICOS
        this.evento = e;
        this.var = var;
        this.acao = acao;
        inimigosAfetados = new ArrayList<>(inimigos);
        afetaInimigos = true;
    }

    public Acao getAcao() {
        return acao;
    }

    public int getVar() {
        return var;
    }
    
    
    public void setAfetaInimigos(boolean simOuNao){
        afetaInimigos = simOuNao;
    }
    
    public boolean isValida(){
        if(inimigosAfetados.isEmpty())
            return false;
        return true;
    }
    

    
    @Override
    public String toString(){
        String str;
        
        char sinal = (var > 0) ? '+' : ' '; // EXPRESSÃO TERNÁRIA
        
        str = "" + sinal + var + " para ação de " + acao;
        if(afetaInimigos){
            str += " sobre unidades do tipo " + inimigosAfetados.get(0);
            if(inimigosAfetados.size() > 1){
                for(int i = 1; i < inimigosAfetados.size() - 1; i++){
                    str += ", " + inimigosAfetados.get(i);
                }
                str += " e " + inimigosAfetados.get(inimigosAfetados.size() - 1);
            }
        }
            

        //return "+" + var + " para ação de " + acao;
        return str;
    }
}
