package bytebankHerdadoConta;

public class TesteConexao2 {
    public static void main(String[] args) {
    	Conexao con = null;
    	try {
		    con =new Conexao(); 
			con.leDados();  		
			 		
			} catch (IllegalStateException e ){
				System.out.println("Deu erro na conexão");
				//a maquina virtual garante que sempre finaly sera executado 
		}finally {
			
		}
   

    	
    }
}