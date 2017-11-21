package fila;

//import java.lang.reflect.Array;

public class Fila {

		  int[] objetos = new int[10];
		  private int contador = 0;
		  private int aux;
		  
		  public void insere(int t) {
			  if(contador < 10)
			  {
			  objetos[contador] = t;
			  contador++;
			  }
			  else
			  {
				  System.out.println("Lista cheia!");
			  }
			 
		  }

		  public void remove() {
		    if(vazia())
		    {
		    	System.out.println("Lista já está vazia");
		    }
		    else
		    {
		    	for(int i = 0; i < contador; i++)
		    	{
		    		if(i == 10)
		    		{
		    			objetos[i] = 0;
		    		}
		    		else
		    		{
		    		objetos[i] = objetos[i + 1]; 
		    		}
		    	}
		    }
		  }

		  public boolean vazia() {
		    if(objetos == null || objetos.length == 0)
		    {
		    	return true;
		    }
		    else
		    {
		    return false;
		    }
		  }
		  
		  public void imprimir()
		  {
			  for(int i = 0; i < contador; i++)
			  {
				  if(objetos[i] != 0)
				  {
					  System.out.println(objetos[i]);
				  }				  
			  }
		  }
}
