package lista;

public class Principal {
    public static void main(String[] args) {
    Lista a = new Lista(0);  
    a.inserir(1, 1);
    a.inserir(2, 2);
    a.inserir(3, 3);
    System.out.println("Quantidade de elementos primeira lista "+a.cont);  
        
    Lista b = new Lista(0);
    b.inserir(4, 4);
    b.inserir(5, 5);
    b.inserir(6, 6);
    System.out.println("Quantidade de elementos segunda lista: "+b.cont);
    System.out.println("\n-------------------");
    
    
    System.out.println("Primeira lista: ");
    a.escreve(a);
    System.out.println("\nSegunda lista: ");
    b.escreve(b);
    Lista c = a.concatenar(a,b);
    System.out.println("\nListas concatenadas:");
    c.escreve(c);
    System.out.println("\n-------------------");
    
    System.out.println("\nLista a ser clonada:");
    a.escreve(a);
    Lista clone = a.clonar(a);    
    System.out.println("\nLista Clonada: ");
    clone.escreve(clone);
    
    
    
           
    
    }
    
}

