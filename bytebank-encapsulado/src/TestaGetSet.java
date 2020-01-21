
public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337,246);
		
		System.out.println(conta.getNumero());
		
		Cliente marcio = new Cliente();
		marcio.setNome("Marcio Oliveira");
		
		conta.setTitular(marcio);
		
		System.out.println(conta.getTitular().getNome());
	}
}
