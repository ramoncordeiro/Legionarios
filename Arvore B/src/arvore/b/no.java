
package arvore.b;

public class no {
    private int dado;
    private ArvoreB ant;
    private ArvoreB prox;
    private no raiz;

    public no(int dado, ArvoreB ant, ArvoreB prox) {
        setDado(dado);
        setAnt(ant);
        setProx(prox);
        setRaiz(raiz);
    }

    /**
     * @return the dado
     */
    public int getDado() {
        return dado;
    }

    /**
     * @param dado the dado to set
     */
    public void setDado(int dado) {
        this.dado = dado;
    }

    /**
     * @return the ant
     */
    public ArvoreB getAnt() {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(ArvoreB ant) {
        this.ant = null;
    }

    /**
     * @return the prox
     */
    public ArvoreB getProx() {
        return prox;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(ArvoreB prox) {
        this.prox = null;
    }

    /**
     * @return the raiz
     */
    public no getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(no raiz) {
        this.raiz = raiz;
    }
    
    
}
