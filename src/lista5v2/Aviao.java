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
public class Aviao extends Veiculo
                   implements Aereo{
  
  @Override
  public void voa(Posicao posDestino){
    if (checaPosicao(posDestino)==true) {
      if (InterfaceGrafica.mapa[posDestino.x][posDestino.y]==TipoTerraAgua.TERRA) {
        System.out.println("Avião voando de X: " + x + ", Y: " + y + " "
                         + "até X: " + posDestino.x + ", Y: " + posDestino.y);
        if (x!=posDestino.x) {
          while(x!=posDestino.x) {
            if (posDestino.x>x) {
              x++;
            } else {
              if (posDestino.x<x) {
                x--;
              }
            }
          }
        } else {
          while(y!=posDestino.y) {
            if (posDestino.y>y) {
              y++;
            } else {
              y--;
            }
          }
        }
      } else {
        System.out.println("O avião não pode pousar na água");
      }
    } else {
      System.out.println("O avião não pode ser movido");
    }
  }
  
  Aviao(int x, int y){
    super(x, y);
  }
}
