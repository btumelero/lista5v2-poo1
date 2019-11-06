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
public class InterfaceGrafica {
  static TipoTerraAgua[][] mapa;
  
  public void moveObjeto(Movel movel, Posicao posDestino){
    if (movel instanceof Terrestre) {
      ((Terrestre) movel).anda(posDestino);
    } else {
      if (movel instanceof Aquatico) {
        ((Aquatico) movel).nada(posDestino);
      } else {
        ((Aereo) movel).voa(posDestino);
      }
    }
  }
  
  InterfaceGrafica(){
    mapa = new TipoTerraAgua[100][100];
    for (int x=0; x<100; x++) {
      for (int y=0; y<100; y++) {
        if (y>=45 && y<=55) {
          mapa[x][y] = TipoTerraAgua.AGUA;
        } else {
          mapa[x][y] = TipoTerraAgua.TERRA;
        }
      }
    }
  }
}
