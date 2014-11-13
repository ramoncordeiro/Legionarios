/* Classe Esqudrao: Essa classe guarda todos os legionários que estão na Batalha 
O Objetivo desta é agrupar estes personagem de modo que seja similar a um batalhão em guerra.
 Originalmente um esqudrão (Legião) possui de 1000 a 6000 soldados.Entretanto como esta é uma
aplicação com fins didáticos a Classe esquadrão terá no máximo 10 e no mínimo 3 Legionários.
*/

package br.ufpa.classesRelacionadas;

import br.ufpa.Personagens.Legionario;



public class Esquadrao {
    int qtdLegionarios=0;
    final int qtdmaxLegionarios=10;//Cada esquadrão terá um número máximo de legionários
    private String familia;
    private Legionario[] agrupamento; //Agrupamento de legionários (esquadrao)

   // ---------------------------- Construtor --------------------------------------
    public Esquadrao(String familia) {
        Legionario l = new Legionario();
        
        this.familia = familia;
           qtdLegionarios++;
         }//fecha métoco construtor.

    public Esquadrao(){
        this.familia = "";
    }
 //------------------------------------- Getters e Setters -------------------------------------------
     /**
     * @return the familia
     */
    public String getFamilia() {
        return familia;
    }

    /**
     * @param familia the familia to set
     */
    public void setFamilia(String familia) {
        System.out.println("Insira a Familia ");
        this.familia = familia;
    }

    /**
     * @return the agrupamento
     */
    public Legionario[] getAgrupamento() {
        return agrupamento;
    }

    /**
     * @param agrupamento the agrupamento to set
     */
    public void setAgrupamento(Legionario[] agrupamento) {
        this.agrupamento = agrupamento;
    }
    
    
    
    
    
    
  //------------------------------------- Métodos da Classe ----------------------------------------  
   
    public void addLegionario(){
         if(qtdLegionarios>=10){
            System.out.println("Esquadrão com capacidade máxima!");
            //VERIFICAR A FUNCIONALIDADE DE SYSTEM.EXIT.
            System.exit(qtdLegionarios);
           }
         else{
               for (int i = 0; i < 10; i++) {
                     if(agrupamento[i]!= null){
                         agrupamento[i] = new Legionario();
                     }
                 }
    
  
                 }
    
        }
    
    
    
    
    
    
}
