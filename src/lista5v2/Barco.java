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
public class Barco extends Veiculo
                   implements Aquatico{
  
  private final int distanciaMaxima=50;
  
  @Override
  public void nada(Posicao posDestino){
    if (checaPosicao(posDestino)==true) {
      System.out.println("Barco movendo de X: " + x + ", Y: " + y + " "
                       + "até X: " + posDestino.x + ", Y: " + posDestino.y);
      int aux=0;
      if (x!=posDestino.x) {
        while(x!=posDestino.x) {
          if (posDestino.x>x) {
            x++;
            aux++;
          } else {
            if (posDestino.x<x) {
              x--;
              aux++;
            }
          }
          if (aux==distanciaMaxima) {
            System.out.println("Combustível acabou em X: " + x + ", Y: " + y);
            break;
          }
        }
      } else {
        while(y!=posDestino.y) {
          if (posDestino.y>y) {
            if (InterfaceGrafica.mapa[x][y+1]==TipoTerraAgua.AGUA) {
              y++;
            } else {
              System.out.println("O barco chegou até a margem e, por isso, não pode mover além desta posição.");
              break;
            }
          } else {
            if (InterfaceGrafica.mapa[x][y-1]==TipoTerraAgua.AGUA) {
              y--;
            } else {
              System.out.println("O barco chegou até a margem e, por isso, não pode mover além desta posição.");
              break;
            }
          }
          if (aux==distanciaMaxima) {
            System.out.println("Combustível acabou");
            break;
          }
        }
      }
    } else {
      System.out.println("O barco não pode ser movido");
    }
  }
  
  Barco(int x, int y){
    super(x, y);
  }
}
