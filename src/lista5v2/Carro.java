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
public class Carro extends Veiculo
                   implements Terrestre{
  
  @Override
  public void anda(Posicao posDestino){
    if (checaPosicao(posDestino)==true) {
      System.out.println("Carro andando de X: " + x + ", Y: " + y + " "
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
            if (InterfaceGrafica.mapa[x][y+1]==TipoTerraAgua.TERRA) {
              y++;
            } else {
              System.out.println("O carro chegou até a margem e, por isso, não pode ir além desta posição.");
              break;
            }
          } else {
            if (InterfaceGrafica.mapa[x][y-1]==TipoTerraAgua.TERRA) {
              y--;
            } else {
              System.out.println("O carro chegou até a margem e, por isso, não pode ir além desta posição.");
              break;
            }
          }
        }
      }
    } else {
      System.out.println("O carro não pode ser movido");
    }
  }
  
  Carro(int x, int y){
    super(x, y);
  }
}
