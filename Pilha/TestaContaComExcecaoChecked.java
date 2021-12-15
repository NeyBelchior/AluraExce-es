package Pilha;

public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		
		Conta c =new Conta();
		try {c.deposita();}
		catch (MinhaExcecaoHerdandoDiretoDeException e) {
			System.out.println("tratamento");
		}
		
	}
}
