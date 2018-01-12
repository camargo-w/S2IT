package questao9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
	
	int valor;
	BinaryTree left;
	BinaryTree right;

	public BinaryTree(int valor){
		this.valor = valor;
	}

	/**
	 * Realiza a inserção de um novo node na árvore
	 * @param node
	 * @param valor
	 */
	public void inserir(BinaryTree node, int valor) {
	    if (valor < node.valor) {
	        if (node.left != null) {
	            inserir(node.left, valor);
	        } else {
	            node.left = new BinaryTree(valor);
	        }
	    } else if (valor >= node.valor) {
	        if (node.right != null) {
	            inserir(node.right, valor);
	        } else {
	            node.right = new BinaryTree(valor);
	        }
	    }
	}
	
	/**
	 * Soma os nodes subsequentes de um node root
	 * @param root
	 * @return
	 */
	public long somarNosSubsequentes(BinaryTree root){
		
	    long somaEsquerda = 0;
	    long somaDireita = 0;

	    // criando e adicionado a collection para iteração
	    Queue<BinaryTree> nodes = new LinkedList<BinaryTree>();
	    nodes.add(root);

	    // inicializando lista com nodes a esquerda e direita do elemento root
	    List<BinaryTree> nodesEsquerda = new ArrayList<BinaryTree>();
	    List<BinaryTree> nodesDireita = new ArrayList<BinaryTree>();

	    // iterando sobre os nodes para fazer o somatório
	    while (!nodes.isEmpty()){

	    	BinaryTree temp = nodes.poll();

	        if (temp.left!=null){
	            somaEsquerda += temp.left.valor;
	            nodesEsquerda.add(temp.left);
	            nodes.add(temp.left);
	        }
	        
	        if (temp.right!=null){
	            somaDireita += temp.right.valor;
	            nodes.add(temp.right);
	            nodesDireita.add(temp.right);
	        }
	    }

	    return somaEsquerda + somaDireita;
	}
	
	public String toString(){
		return "BinaryTree valor=" + this.valor;
	}
}
