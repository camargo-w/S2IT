package main;

import questao8.GerarC;
import questao9.BinaryTree;

public class Main {

	public static void main(String[] args){
		
		// Quest�o 8 - Gerando n�mero C
		Main.gerarNumeroC();
		
		// Quest�o 9 - Somar nodes subsequentes
		Main.somarNodesSubsequentes();
	}
	
	public static void gerarNumeroC(){
		System.out.println("===============================\nQuest�o 8:\n");
		GerarC.run("10256", "512");
	}
	
	public static void somarNodesSubsequentes(){
		
		long soma = 0L;
		
		BinaryTree root = new BinaryTree(1);
		root.inserir(root, 2);
		root.inserir(root, 3);
		root.inserir(root, 4);
		root.inserir(root, 5);
		
		soma = root.somarNosSubsequentes(root);
		System.out.println("===============================\nQuest�o 9: Resultado = " + soma);
	}
}
