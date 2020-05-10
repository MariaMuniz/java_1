package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;
public class App {
    public static void main(String[] args){
        try{
            DesafioMeuTimeApplication desafio = new DesafioMeuTimeApplication();
            desafio.incluirTime(1L,"Atletico", LocalDate.now(), "Preto", "Branco");
            desafio.incluirTime(2L,"Palmeiras", LocalDate.now(), "Verde", "Azul");
//		desafio.incluirTime(2L,"Cruzeiro", LocalDate.now(), "Branco com uma Lista Azul", "Azul com Lista Branca");
            desafio.incluirJogador(1L, 2L, "Carlos", LocalDate.now(), 100, new BigDecimal(2.00));
            desafio.incluirJogador(2L, 2L, "Robinho", LocalDate.now(),  80, new BigDecimal(3.00));
            desafio.incluirJogador(4L, 1L, "Adilson", LocalDate.parse("2014-12-31"),  100, new BigDecimal(3.00));
            desafio.incluirJogador(3L, 1L, "Davi", LocalDate.parse("2017-12-31"),  60, new BigDecimal(4.00));
            desafio.incluirJogador(5L, 1L, "Marcelo", LocalDate.parse("2013-12-31"),  100, new BigDecimal(3.00));
//		desafio.incluirJogador(5L, 1L, "Lucas", LocalDate.parse("2015-12-31"),  100, new BigDecimal(3.00));
//c
            desafio.definirCapitao(3L);
            desafio.definirCapitao(1L);
            System.out.println(desafio.buscarCapitaoDoTime(1L));
            System.out.println(desafio.buscarCapitaoDoTime(2L));
            System.out.println(desafio.buscarNomeJogador(1L));
//		System.out.println(desafio.buscarNomeJogador(1L));
            System.out.println(desafio.buscarNomeTime(1L));
//		System.out.println(desafio.buscarNomeTime(1L));
            System.out.println(desafio.buscarJogadoresDoTime(2L));
            System.out.println(desafio.buscarMelhorJogadorDoTime(1L));
            System.out.println(desafio.buscarJogadorMaisVelho(1L));
            System.out.println(desafio.buscarTimes());
            System.out.println(desafio.buscarJogadorMaiorSalario(1L));
            System.out.println(desafio.buscarSalarioDoJogador(4L));
            System.out.println(desafio.buscarTopJogadores(1));
            System.out.println(desafio.buscarCorCamisaTimeDeFora(1L, 2L));
        }
        catch(Exception ex){
            System.err.println("Exception: "+ex.getMessage());
        }
    }
}



