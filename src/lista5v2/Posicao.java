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
public class Posicao {
  protected int x, y;
  
  protected boolean checaPosicao(Posicao posDestino){
    if (posDestino.x>100 || posDestino.x<0 || posDestino.y>100 || posDestino.y<0) {
      System.out.println("Destino fora das dimensões do mapa");
      return false;
    } else {
      if (x!=posDestino.x && y!=posDestino.y) {
        System.out.println("Objetos só podem ser movidos em linha reta");
        return false;
      } else {
        if (x==posDestino.x && y==posDestino.y) {
          System.out.println("O Objeto já está na posição indicada");
          return false;
        } else {
          return true;
        }
      }
    }
  }
  
  Posicao(int x, int y){
    this.x = x;
    this.y = y;
  }
}
