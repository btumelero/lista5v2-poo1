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
public class Pessoa extends Animal
                    implements Terrestre, Aquatico{
  
  private final int distanciaMaxima=5;
  private boolean afogou=false;
  
  @Override
  public void anda(Posicao posDestino){
    if (checaPosicao(posDestino)==true) {
      System.out.println("Pessoa andando de X: " + x + ", Y: " + y + " "
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
        while(y!=posDestino.y && afogou==false) {
          if (posDestino.y>y) {
            if (InterfaceGrafica.mapa[x][y+1]==TipoTerraAgua.TERRA) {
              y++;
            } else {
              System.out.println("A pessoa chegou até a margem e, por isso, começará a nadar.");
              nada(posDestino);
            }
          } else {
            if (InterfaceGrafica.mapa[x][y-1]==TipoTerraAgua.TERRA) {
              y--;
            } else {
              System.out.println("A pessoa chegou até a margem e, por isso, começará a nadar.");
              nada(posDestino);
            }
          }
        }
      }
    } else {
      System.out.println("A pessoa não pode ser movida");
    }
  }
  
  @Override
  public void nada(Posicao posDestino){
    if (checaPosicao(posDestino)==true) {
      System.out.println("Pessoa nadando de X: " + x + ", Y: " + y + " "
                       + "até X: " + posDestino.x + ", Y: " + posDestino.y);
      int aux=0;
      if (x!=posDestino.x) {
        while(x!=posDestino.x) {
          if (posDestino.x>x) {
            x++;
            if (InterfaceGrafica.mapa[x][y]==TipoTerraAgua.AGUA) {
              aux++;
            }
          } else {
            if (posDestino.x<x) {
              x--;
              if (InterfaceGrafica.mapa[x][y]==TipoTerraAgua.AGUA) {
                aux++;
              }
            }
          }
          if (aux==distanciaMaxima) {
            System.out.println("Pessoa se afogou");
            break;
          }
        }
      } else {
        while(y!=posDestino.y && afogou==false) {
          if (posDestino.y>y) {
            if (InterfaceGrafica.mapa[x][y+1]==TipoTerraAgua.AGUA) {
              y++;
              aux++;
            } else {
              System.out.println("O pessoa chegou até a margem e, por isso, começará a andar.");
              anda(posDestino);
            }
          } else {
            if (InterfaceGrafica.mapa[x][y-1]==TipoTerraAgua.AGUA) {
              y--;
              aux++;
            } else {
              System.out.println("O pessoa chegou até a margem e, por isso, começará a andar.");
              anda(posDestino);
            }
          }
          if (aux==distanciaMaxima) {
            System.out.println("Pessoa se afogou em X: " + x + ", Y: " + y);
            pessoa--;
            afogou=true;
          }
        }
      }
    } else {
      System.out.println("A pessoa não pode ser movida");
    }
  }
  
  Pessoa(int x, int y){
    super(x, y);
    pessoa++;
  }
}
