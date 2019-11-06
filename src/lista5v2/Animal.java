/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5v2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bruno.191196
 */
public abstract class Animal extends Posicao
                             implements Movel{
  
  public static Map<TipoAnimal, Integer> quantidadeAnimais;
  public static int passaro=0, peixe=0, pessoa=0, tigre=0;
  
  Animal(int x, int y){
    super(x, y);
    quantidadeAnimais = new HashMap();
    quantidadeAnimais.put(TipoAnimal.PASSARO, passaro);
    quantidadeAnimais.put(TipoAnimal.PEIXE, peixe);
    quantidadeAnimais.put(TipoAnimal.PESSOA, pessoa);
    quantidadeAnimais.put(TipoAnimal.TIGRE, tigre);
  }
}
