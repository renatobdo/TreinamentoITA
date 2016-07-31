package Week5;

public class Principal {
	public static void main(String[] args){
		Pilha p = new Pilha(50);
		p.empilhar("Eduardo");
		p.empilhar("Maria");
		p.empilhar("Jose");
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
	//	p.setTopo(6);
		
		System.out.println(p.desempilhar().toString().toUpperCase());
		System.out.println(p.topo().toString().toUpperCase());
		System.out.println(p.tamanho());
	}

}
