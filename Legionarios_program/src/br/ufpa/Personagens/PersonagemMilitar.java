
package br.ufpa.Personagens;
import br.ufpa.classesRelacionadas.Item;

//FAZER SOBRESCRITA DO tipAtaque na CLASSE LEGIONARIO;
//na documentação da Classe especificar que tipAtaque refere-se H x H, Distancia, espada, arco.
public class PersonagemMilitar extends Personagem{
   private int ataque;
   private int defesa;
   private int corrida; //define a velocidade de corrida ( pique ) que o personagem consegue atingir.
   private String tipAtaque; // Arco e Flexa ou Espada

   
//-------------------------------------------------Construtores----------------------------------------------------   
    public PersonagemMilitar(int ataque, int defesa, int corrida, String tipAtaque, int id, String nome, int saude, String familia) {
        super(id, nome, saude, familia);
        this.ataque = ataque;
        this.defesa = defesa;
        this.corrida = corrida;
        this.tipAtaque = tipAtaque;
    }

    public PersonagemMilitar() {
     super();
     this.ataque = 0;
     this.defesa = 0;
     this.corrida = 0;
     this.tipAtaque = "";
    }
    
//------------------------------------------GETTERS E SETTERS -----------------------------------------   
    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getCorrida() {
        return corrida;
    }

    public void setCorrida(int corrida) {
        this.corrida = corrida;
    }

    public String getTipAtaque() {
        return tipAtaque;
    }

    public void setTipAtaque(String tipAtaque) {
        this.tipAtaque = tipAtaque;
    }
    
    @Override
    public void setNome(String nome){
        nome = "Personagem Militar";
        this.nome = nome;
            System.out.println(this.nome);
    }

    @Override
    public void setItens(Item[] Itens) {
        super.setItens(Itens); //To change body of generated methods, choose Tools | Templates.
    }

    
        
   

//------------------------------------ METODOS DA CLASSE ----------------------------------------------

    public int aumentarAtaque(){ 
        if (getAtaque()<= 95) {
            this.ataque += 5 ;
        }
        return getAtaque();
}
    
    public int aumentarDefesa(){
        if (getDefesa()<= 95) {
            this.defesa += 5 ;
        }
        return getAtaque();
    }

    public int aumentarCorrida(){
        if (getCorrida()<= 95) {
            this.corrida += 5 ;
        }
        return getAtaque();
    }
    
    

}//fim classe