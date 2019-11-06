/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5v2;

import java.util.ArrayList;

/**
 *
 * @author bruno.191196
 */
public abstract class Veiculo extends Posicao
                              implements Movel{
  public ArrayList<Posicao[]> trajetos = new ArrayList<>();
  
  public final void registraTrajeto(Posicao origem, Posicao destino){
    Posicao[] trajeto = new Posicao[2];
    trajeto[0] = origem;
    trajeto[1] = destino;
    trajetos.add(trajeto);
  }
  
  Veiculo(int x, int y){
    super(x, y);
  }
}
