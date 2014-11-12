//Esta é a classe dos itens que cada persoagem terá.
// Se o personagem for um aldeão os Itens serão Machado,inchada,martelo (por exemplo)
// Se o personagem for um Militar os Itens poderão ser: Espada, adaga, escudo.


package br.ufpa.classesRelacionadas;


public class Item {
    private String item1;
    private String item2;
    private String item3;

//----------------------------------------------Construtor-----------------------------------------------    
    
    public Item(String item1, String item2, String item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public Item() {
        item1 = "";
        item2 = "";
        item3 = "";
    }

    


    
    
    
//-------------------------------------------- GETTERS E SETTERS ---------------------------------------    
    
    /**
     * @return the item1
     */
    public String getItem1() {
        return item1;
    }

    /**
     * @param item1 the item1 to set
     */
    public void setItem1(String item1) {
        this.item1 = item1;
    }

    /**
     * @return the item2
     */
    public String getItem2() {
        return item2;
    }

    /**
     * @param item2 the item2 to set
     */
    public void setItem2(String item2) {
        this.item2 = item2;
    }

    /**
     * @return the item3
     */
    public String getItem3() {
        return item3;
    }

    /**
     * @param item3 the item3 to set
     */
    public void setItem3(String item3) {
        this.item3 = item3;
    }
}
