package application;
import java.util.Scanner;

import entities.Usuario;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         
      //Conhecer e importar a classe Scanner
      Scanner sc = new Scanner (System.in);
      Usuario user = new Usuario(1021, "067-8", "Mario Andrade", 237.48);
      
      //Exibir as mensagens para o nosso usuário
      System.out.println("Por favor, digite o número da Agência!");

      //Obter pela Scanner os valores digitados no terminal
      System.out.print("Usuário: ");
      int numero = sc.nextInt();

      //Exibir a mensagem conta criada
      if (numero == user.getNumero()) {
        System.out.println("Olá " +user.getNomeCliente()+ ", obrigado por criar uma conta em nosso banco, sua agência é "
        +user.getAgencia()+ ", conta " + user.getNumero()+ " e seu saldo "+user.getSaldo()+ " já está disponível para saque.");
      } else {
        System.out.println("Número de agência invalido!");
      }

      sc.close();
    }
}
