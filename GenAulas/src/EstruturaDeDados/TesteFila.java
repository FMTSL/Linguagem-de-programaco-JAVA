package EstruturaDeDados;

public class TesteFila {

	public static void main(String[] args) {
		
		Fila fila = new Fila (3);
		
		fila.enqueue(10);
		System.out.println("Item adicionado na fila: " + fila.pegarFim());

		fila.enqueue(20);
		System.out.println("Item adicionado na fila: " + fila.pegarFim());
		
		fila.enqueue(30);
		System.out.println("Item adicionado na fila: " + fila.pegarFim());
		
		fila.enqueue(40);
		
		fila.dequeue();
	}

}
