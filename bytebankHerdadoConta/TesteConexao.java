package bytebankHerdadoConta;

public class TesteConexao {
    public static void main(String[] args) {

    	
    	
    	
    	try(Conexao conexao =new Conexao()){
    		conexao.leDados();
    	
    		
    	}catch (IllegalStateException e) {
    	  System.out.println(e.getMessage());
		}
    	System.out.println("Jeus");
    	
    	
    	
    	
 
    	
    	
    	
    	
   //	---------------------------------------------------
    /*	Conexao con = null;
    	try {
		    con =new Conexao(); 
			con.leDados();  		
		} catch (IllegalStateException e ){
			System.out.println("Deu erro na conexão");
			//a maquina virtual garante que sempre finaly sera executado 
		}finally {
			System.out.println("Finnaly");
			if(con!=null) {
			con.close();
		}}*/
   

    	
    }
}