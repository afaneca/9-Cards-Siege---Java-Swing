/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Estados.AguardaCarta;
import Estados.AguardaInicio;
import Estados.AguardaSelecaoDeAcao;
import Estados.DiaTerminado;
import Estados.IEstados;
import Estados.JogoTerminado;
import Lógica.Carta;
import Lógica.Constantes;
import Lógica.Evento;
import Lógica.Eventos.AtaqueDeCatapulta;
import Lógica.Eventos.CatapultaReparada;
import Lógica.Eventos.CoberturaDaEscuridao;
import Lógica.Eventos.Colapso;
import Lógica.Eventos.Doenca;
import Lógica.Eventos.EscudosDeFerro;
import Lógica.Eventos.FatigaInimiga;
import Lógica.Eventos.Fe;
import Lógica.Eventos.FlechasFlamejantes;
import Lógica.Eventos.GuardasDistraidos;
import Lógica.Eventos.InimigoDeterminado;
import Lógica.Eventos.MauTempo;
import Lógica.Eventos.MorteDeUmLider;
import Lógica.Eventos.OleoQuente;
import Lógica.Eventos.PortaFortificada;
import Lógica.Eventos.Reuniao;
import Lógica.Eventos.SalvaDeFlechas;
import Lógica.Eventos.SuprimentosEstragados;
import Lógica.Mundo;
import ui.GUI.menuInicialView;

/**
 *
 * @author me
 */
public class Controlador { // CONTROLLER
    private Mundo m; // MODEL
    private menuInicialView menuInicial; // VIEW
    boolean sair;
    private String motivoFimDoJogo;
    Evento eventoAtual;
    Carta cartaVirada;
    
    public Controlador(Mundo m, menuInicialView menuInicial){
        this.m = m;
        this.menuInicial = menuInicial;
    }
    
    public void run() {
        while (!sair) {      
            IEstados estado = m.getEstado();  
            
            
            if(estado instanceof AguardaInicio){
                menuInicial.setVisible(true);

            }
                //m.novoJogo();
            else if(estado instanceof AguardaCarta){
                virarCarta();
            }
            
            else if(estado instanceof AguardaSelecaoDeAcao){
                //processaAcoes();
            }
                
            
            else if(estado instanceof DiaTerminado){
                //fimDoDia();
            }
                
            
            else if(estado instanceof JogoTerminado){
                //fimDoJogo();
                sair = true;
            }
                
       }
        
    }
    
    private void virarCarta(){
       menuInicial.setVisible(false);
       cartaVirada = m.virarCarta();
       eventoAtual = m.eventoAtual(cartaVirada);
       
       
       
//       // ANTES DE TUDO, VERIFICA SE EXISTEM SOLDADOS NO TUNEL
//       if(m.soldadosEmLinhasInimigas()){
//           System.out.println("Temos soldados corajosos em linhas inimigas.");
//           ui_PressioneNoEnterPara("rodar o dado e determinar o seu destino.");
//           
//           int resultado = m.sorteDosSoldados();
//           if(resultado > Constantes.SOLDADOS_EM_LINHAS_INIMIGAS_SEM_SORTE.getValor()){
//               System.out.println("A sorte está do seu lado! O resultado do dado foi " + resultado + " e os soldados continuam indetetados em linhas inimigas.");
//           }else{
//               System.out.println("A sorte não está do seu lado! O resultado do dado foi " + resultado + " e os soldados foram capturados pelos inimigos");
//               m.soldadosCapturados();
//           }
//       }else
//           System.out.println("Não tem soldados em linhas inimigas. Todos estão em segurança dentro do Castelo.");
//       
//       
//       ui_PressioneNoEnterPara("virar uma carta.");
//       // VIRA A CARTA NO TOPO DO BARALHO
//       System.out.println("Encontrou a carta " + cartaVirada + ".");
//       System.out.println("Enfrentará agora o Evento " + eventoAtual + ".");
//       
//       // DESCOBRE QUAL O EVENTO ATUAL E APLICA-O
//       if(eventoAtual instanceof AtaqueDeCatapulta)
//           EVENTO_ataqueDeCatapulta(eventoAtual);
//       else if(eventoAtual instanceof CatapultaReparada)
//           EVENTO_catapultaReparada();
//       else if(eventoAtual instanceof CoberturaDaEscuridao)
//           EVENTO_coberturaDaEscuridao();
//       else if(eventoAtual instanceof Colapso)
//           EVENTO_colapso();
//       else if(eventoAtual instanceof Doenca)
//           EVENTO_doenca();
//       else if(eventoAtual instanceof EscudosDeFerro)
//           EVENTO_escudosDeFerro();
//       else if(eventoAtual instanceof FatigaInimiga)
//           EVENTO_fatigaInimiga();
//       else if(eventoAtual instanceof Fe)
//           EVENTO_fe();
//       else if(eventoAtual instanceof FlechasFlamejantes)
//           EVENTO_flechasFlamejantes();
//       else if(eventoAtual instanceof GuardasDistraidos)
//           EVENTO_guardasDistraidos();
//       else if(eventoAtual instanceof InimigoDeterminado)
//           EVENTO_inimigoDeterminado();
//       else if(eventoAtual instanceof MauTempo)
//           EVENTO_mauTempo();
//       else if(eventoAtual instanceof MorteDeUmLider)
//           EVENTO_morteDeUmLider();
//       else if(eventoAtual instanceof OleoQuente)
//           EVENTO_oleoQuente();
//       else if(eventoAtual instanceof PortaFortificada)
//           EVENTO_portaFortificada();
//      else if(eventoAtual instanceof Reuniao)
//           EVENTO_reuniao();
//       else if(eventoAtual instanceof SalvaDeFlechas)
//           EVENTO_salvaDeFlechas();
//       else if(eventoAtual instanceof SuprimentosEstragados)
//           EVENTO_suprimentosEstragados();
//       
//       // MOSTRA OS DRMS ASSOCIADOS AO EVENTO
//       mostraDRMS(eventoAtual);
//       
//       // AVANÇO DO INIMIGO
//       avancaInimigos(eventoAtual);
//       verificaCondicoesFataisImediatas(); /* FALTA FAZER COM QUE ESTAS CONDIÇÕES SEJAM VERIFICADAS IMEDIATAMENTE */
//
//       // MÉTODO PARA VERIFICAR AS CONDIÇÕES QUE DETERMINAM O FIM DO JOGO AO FINAL DE CADA TURNO 
//       verificaCondicoesFatais();   
   } 
    
}