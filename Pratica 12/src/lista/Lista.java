package lista;

public class Lista {    
    Lista prox; 
    int id;
    int cont=1;
    
    Lista(int id){
        this.id = id;
        prox = null;              
    }     
    Lista(){
        this.id = -1;
        prox = null;
    }    
    public Lista getProx() {
        return prox;
    }
    public void setProx(Lista prox) {
        this.prox = prox;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    } 
    public boolean listaVazia(){
        boolean vazia = false;
        if(this.prox == null && this.id == -1){
            vazia = true;
        }
        return vazia;
    }    
    public void inserir(int p, int id) {        
            if (prox == null || p == 1) {
                Lista aux = prox;
                prox = new Lista(id);
                prox.prox = aux;               
            } else {
                prox.inserir(p - 1, id);
            }
            this.cont++;        
    }
    /*public void inserir(int p, int id) {
        if (listaVazia()) {
            this.id = id;
            this.cont++;
        } else {
            if (prox == null || p == 1) {
                Lista aux = prox;
                prox = new Lista(id);
                prox.prox = aux;
                this.cont++;
            } else {
                prox.inserir(p - 1, id);
            }
        }
    }
    */
    public void remover(int p){
        if(p==1 || prox.prox==null){
            this.prox = this.prox.prox;
        }else{
            prox.remover(p-1);
        }
        this.cont--;
    }
     public int pesquisaPos(int p){
        int idn = -1;
        if(p==1){
            idn = this.id;
        }else{
            this.prox.pesquisaPos(p-1);
        }
        return idn;
    }    
    public int pesquisaChave(int id) {
        int posicao = 0;
        if (this.id != id) {
            this.prox.pesquisaChave(id);
            posicao = posicao + 1;
        }
        return posicao;
    }    
    public void fazListaVazia(){
        this.prox = null;
    }
    public int pesquisaZero(){
        return pesquisaZ(0);
    }    
    private int pesquisaZ(int p){ // p = zero
        int conta = 0;
        if(this.id == 0){
            conta = conta + 1;
        }else{
            conta = conta + this.prox.pesquisaZ(p+1);
        }
        return conta;
    }    
    public void escreve(Lista a){
        System.out.print(a.id+" ");
        if(a.prox !=null){            
            escreve(a.prox);
        }
    }    
    public Lista concatenar(Lista a,Lista b){
        if(a.prox==null){
            a.prox = b;
        }else{
            concatenar(a.prox,b);
        }
        return a;
    }    
    //!!!!!
    public Lista  particionar(Lista a){
        return particionar(1,a);
    }    
    private Lista particionar(int p,Lista a){
       if(p==(a.cont/2)){
            Lista metade = a.prox; //segunda metade da lista
            a.prox = null;//primeira metade da lista            
        }else{
            particionar(p+1,a.prox);
        } 
       return a;
    }
    //!!!
    public Lista clonar (Lista a){        
        Lista clone = a;
        return clone;
    }
    public Lista unir(Lista a,Lista b){
       Lista lista = concatenar(a,b);
       return unir(lista);
    }
    private Lista unir(Lista lista) {
        int idAux = lista.id;
        if (lista.prox != null) {
            if (lista.id == idAux) {
                lista.prox.remover(id);
            }
            unir(lista.prox);
        }
        return lista;
    }
    


}
