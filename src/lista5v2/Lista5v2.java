/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5v2;

/**
 *
 * @author bruno.191196
 */
public class Lista5v2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    InterfaceGrafica mapa = new InterfaceGrafica();
    
    Aviao aviao = new Aviao(0,0);
    aviao.voa(new Posicao(50, 0));
    aviao.voa(new Posicao(50, 0));
    aviao.voa(new Posicao(0, 50));
    aviao.voa(new Posicao(50, 50));
    
    System.out.println();
    
    Barco barco = new Barco(0,50);
    barco.nada(new Posicao(50, 50));
    barco.nada(new Posicao(50, 50));
    barco.nada(new Posicao(50, 0));
    barco.nada(new Posicao(25, 25));
    
    System.out.println();
    
    Carro carro = new Carro(0, 0);
    carro.anda(new Posicao(50, 0));
    carro.anda(new Posicao(50, 0));
    carro.anda(new Posicao(50, 50));
    carro.anda(new Posicao(25, 25));
    
    System.out.println();
    
    Passaro passaro = new Passaro(0, 0);
    passaro.voa(new Posicao(0, 0));
    passaro.voa(new Posicao(0, 50));
    passaro.voa(new Posicao(50, 0));
    passaro.voa(new Posicao(25, 25));
    
    System.out.println();
    
    Peixe peixe = new Peixe(0, 50);
    peixe.nada(new Posicao(0, 50));
    peixe.nada(new Posicao(0, 0));
    peixe.nada(new Posicao(25, 50));
    
    System.out.println();
    
    Pessoa pessoa = new Pessoa(0, 0);
    pessoa.anda(new Posicao(0, 0));
    pessoa.anda(new Posicao(0, 40));
    pessoa.anda(new Posicao(0, 60));
    
    System.out.println();
    
    pessoa = new Pessoa(0, 51);
    pessoa.nada(new Posicao(0, 60));
    
    Tigre tigre = new Tigre(0, 0);
    tigre.anda(new Posicao(0, 0));
    tigre.anda(new Posicao(50, 0));
    tigre.anda(new Posicao(50, 50));
    tigre.anda(new Posicao(25, 25));
  }
  
}
