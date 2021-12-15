package bytebankHerdadoConta;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta =new ContaCorrente(123, 321);
		
		conta.deposita(200);
		try {
		conta.saca(210);
		}catch(SaldoInsuficienteExcepetion e) {
			System.out.println("EX :" +e.getMessage());
		} 
		System.out.println(conta.saldo);
		
	}
}
