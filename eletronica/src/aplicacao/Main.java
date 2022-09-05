package aplicacao;

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import entidade.Clientes;
import entidade.Equipamento;
import entidade.Formas_Pagamento;
import entidade.Orcamento;

public class Main {

	public static void main(String[] args) {
	
       Connection conecta = null;
        
        try {
            //Indicação da conexão com o MySQL através do protocolo JDBC
            //além do IP do servidor (localhost)
            //base de dados ou schema (javamysql)
            //usuário para autenticação (root)
            //senha do usuário root
            
            conecta = DriverManager.getConnection("jdbc:mysql://localhost/eletronica?" +"user=root&password=lu.99867067");
            
            
              
           System.out.println("Conexão realizada com sucesso.");		
		
		
		Scanner ler = new Scanner(System.in);
	  
		//classe Clientes
       System.out.print("Digite os dados do cliente:");	
       
       
        
        System.out.println("Digite o nome do cliente:");
        String nome  = new Scanner(System.in).nextLine();
        System.out.println("Digite o endereco:");
        String endereco = new Scanner(System.in).nextLine();
        System.out.println("Digite seu numero de telefone:");
        int telefone = ler.nextInt();
        
        Clientes cliente = new Clientes(nome, endereco, telefone);
  
        String sql = "INSERT INTO clientes(nome, endereco, telefone) VALUES(?,?,?)";  





        try {  
              PreparedStatement stmt = conecta.prepareStatement(sql);  
              stmt.setString(1, cliente.getNome()) ;  
              stmt.setString(2, cliente.getEndereco());
              stmt.setInt(3, cliente.getTelefone());
              stmt.execute();  
              stmt.close();  





        } catch (SQLException u) {  
              throw new RuntimeException(u);  
      }   
       
        System.out.println("Digite o equipamento: ");
        String equipamento = new Scanner(System.in).nextLine();
        System.out.println("Digite o codigo do equipamento: ");
        int cod_equipamento = ler.nextInt();
        System.out.println("Digite a data de entrada do equipamento: ");
        int data_entrada = ler.nextInt();
        System.out.println("Digite o fabricante do equipamento: ");
        String fabricante = new Scanner(System.in).nextLine();
        System.out.println("Digite o imei do equipamento: ");
        int imei = ler.nextInt();
        System.out.println("Digite o defeito relatado do equipamento: ");
        String defeito_relatado = new Scanner(System.in).nextLine();
        
        System.out.println("Informe a forma de pagamento: ");
        int forma_pagamento = ler.nextInt();
        
        //num_orcamento;
        System.out.println("Diagnostico defeitos: ");
        String diagnostico_defeito = new Scanner(System.in).nextLine();
        System.out.println("Digite ovalor do conserto:R$ ");
        int valor_conserto = ler.nextInt();
        System.out.println("Aprovacao cliente: ");
        String aprovacao_cliente = new Scanner(System.in).nextLine();
        System.out.println("Data da entrega do equipamento: ");
        int data_entrega = ler.nextInt();
    
 
 
        } catch (SQLException ex) {
            //Caso ocorram erros na tentativa de conex�o com o MySQL
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
 
}

	
	}
}

