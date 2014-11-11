package br.ufpa.classesRelacionadas;

import br.ufpa.Personagens.Personagem;


public class Esquadrao {
    int qtdLegionarios;
    final int qtdmaxLegionarios=1000;//Cada esquadrão terá um número máximo de legionários
    private String familia;

   // ---------------------------- Construtor --------------------------------------
    public Esquadrao(int qtdLegionarios) {
         if(qtdLegionarios>=1000){
            System.out.println("Esquadrão com capacidade máxima!");
            //VERIFICAR A FUNCIONALIDADE DE SYSTEM.EXIT.
            System.exit(qtdLegionarios);
         }
         else{
            //Inserir AQUI O CONSTRUTOR DA CLASSE LEGIONÁRIO.
              this.qtdLegionarios = qtdLegionarios;
              setFamilia(familia);
              qtdLegionarios++;
         }
    }//fecha métoco construtor.

  //------------------------------------- Métodos da Classe ----------------------------------------  
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
    
    
    
}
