
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 246);
		
//		conta.setAgencia(-50);
//		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		System.out.println(Conta.getTotal());
	}
}
