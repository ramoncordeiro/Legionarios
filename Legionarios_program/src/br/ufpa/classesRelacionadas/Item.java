//Esta é a classe dos itens que cada persoagem terá.
// Se o personagem for um aldeão os Itens serão Machado,inchada,martelo (por exemplo)
// Se o personagem for um Militar os Itens poderão ser: Espada, adaga, escudo.

/* INSERIR NA HORA DA BUSCA DE ITENS, OU REPENSAR USAR ARRAYLIST
 for(int=0; i<3;i++){
    getItens()[i].setItem(null);
}
    
*/

package br.ufpa.classesRelacionadas;


public class Item {
    private String item;
    
//----------------------------------------------Construtor-----------------------------------------------    
    
    public Item(String item1, String item2, String item3) {
        this.item = item1;
       
    }

    public Item() {
        item = "";
        
    }

    


    
    
    
//-------------------------------------------- GETTERS E SETTERS ---------------------------------------    
    
    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

   
}
