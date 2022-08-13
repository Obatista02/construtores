package aplication;

import java.util.Scanner;

import entities.Banco;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Banco banco;
		System.out.print("Digite o numero da conta: ");
		int numConta = sc.nextInt();
		System.out.println("Nome Titular: ");
		String tituConta = sc.next();
		System.out.print("Deseja iniciar o deposito? (s/n)");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.print("Digite o valor para saldo: ");
			double saldo = sc.nextDouble();
			banco = new Banco(numConta, tituConta, saldo);
		} else {
			banco = new Banco(numConta, tituConta);
		}
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(banco);

		System.out.println();
		System.out.print("Entre com o valor para deposito:");
		double valorDeposito = sc.nextDouble();
		banco.deposito(valorDeposito);
		System.out.println(banco);

		System.out.println();
		System.out.print("Entre com o valor para Saque:");
		double valorSaque = sc.nextDouble();
		banco.saque(valorSaque);
		System.out.println(banco);

		sc.close();
	}

}
