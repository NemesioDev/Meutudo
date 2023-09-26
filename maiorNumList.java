package TesteFelipe;

import java.util.ArrayList;
import java.util.List;

public class maiorNumList {
	
	public static void main(String[] args) {
		
		 List<Integer> numeros = new ArrayList<>();
	        numeros.add(10);
	        numeros.add(5);
	        numeros.add(8);
	        numeros.add(22);
	        numeros.add(15);
	        numeros.add(7);
	        numeros.add(30);

	        int maior = encontrarMaiorNumero(numeros);
	        System.out.println("O numero maior dentro da lista é: " + maior);
	    }

	    public static int encontrarMaiorNumero(List<Integer> numeros) {

	        int maior = numeros.get(6);  

	        for (int numero : numeros) {
	            if (numero > maior) {
	                maior = numero;
	            }
	            
	            
	        }

	        return maior;
	        
	        
	    }

	




		
		
		
	}


