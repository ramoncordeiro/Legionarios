/*Todos os atributos e funções membros devem estar relacionados a classe
  
1. Pelo menos 4 atributos x
2. Pelo menos 4 funções membros sem incluir get e set

Requisitos de implementação
3. Cinco classes: uma superclasse e duas subclasses, e duas classes relacionadas ao projeto
4. Sempre usar o super para o máximo de reaproveitamento de código
5. Diagrama de classes (obrigatório salvar também o png do diagrama no gitHub) 
6. Todos os atributos devem ser inicializados. Fez validação de dados? X
7. Dois construtores X 
8. Um atributo static. X
9. Um atributo const static
Correta modelagem dos statics?
10. Um array X
11. Método static – deve ser chamado no main
12. Sobrescrita de método: chamar dentro do método da classe. Usar o @override
13. Usar Protected acessando diretamente os atributos na classe derivada
14. Usar suas classes no main
Opcionais que garantem pontos extras:
Trabalhar com ENUM
Trabalhar com pacotes
*/
package legionarios_program;


public class Personagem {
   //LEMBRAR DE INSERIR OU CORRIRIR ALGUMAS VARIAVEIS PARA STATIC.
    //FAZER SOBRESCRITA NO SET NOME E SET ARMA.
    private int id; //cada personagem terá um identifiador para diferencia-lo de outros da mesma classe.
    private static String nome; //nome da classe do personagem,na classe derivada será inserido este atributo.
    private int saude; //indica se personagem está ou não ferido (0% - 100%); 
    private String familia;//cada personagem pertence a uma gens Romana que no Jogo chama-se familia.
    private int arma[] = new int[3]; //Personagem terá 3 armas distintas 1 principal e 2 secundárias.
    
    
    //Construtor da Classe
    //ANALISAR SE POSSO UTILIZAR O SET DENTRO DO CONSTRUTOR
    public Personagem(int id, String nome, int saude, String familia) {
        setId(id);
        setNome(nome);
        setSaude(saude);
        setFamilia(familia);
        print();
        //this.id = id;
        //this.nome = nome;
        //this.saude = saude;
        //this.familia = familia;
    }
    
    //Construtor DEFAULT.ANLISAR SE PRECISA CORRIGIR
    public Personagem() {
        this.id = 0;
        this.nome = "";
        this.saude = 100;
        this.familia = "";
    }
    
    
   
    

    

   

//CONSTRUTOR
    /*public Personagem(int id,String nome,int saude,String familia){
        getId();
        getNome();
        getSaude();
        
    }*/
    
    
//----------------------DECLARAÇÃO DOS METODOS GET E SET DOS ATRIBUTOS.------------------------
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        System.out.println("Por favor insira o ID ");   
        this.id = id;
    }

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the saude
     */
    public int getSaude() {
        return saude;
    }

    /**
     * @param saude the saude to set
     */
    public void setSaude(int saude) {
        this.saude = saude;
    }
    
    /**
     * @return the arma
     */
    public int[] getArma() {
        return arma;
    }

    /**
     * @param arma the arma to set
     */
    public void setArma(int[] arma) {
        this.arma = arma;
    }

    
    
    // --------------------------- DECLARAÇÃO DOS MÉTODOS DA CLASSE ---------------------------------
    
   
    
    public int Curar(int saude){
        saude = saude + 10;
        return saude;
    }
       
    
    public int reduzirSaude(int saude){
        saude = saude - 10;
        if(saude<=30){
            System.out.println("Atencao! Personagem está em perigo de vida "+saude);
        }
        return saude;
    }

       
    final void print(){
        System.out.println("Personagem Criado com Sucesso\n");
        getId();
        getNome();
        getSaude();
        getFamilia();
    }
    
    
}//finaliza classe personagem