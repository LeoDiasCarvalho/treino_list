package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionario;

/**
 * @author LéoDias
 *
 */
public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		List<Funcionario> lista = new ArrayList<>();
		Funcionario func = new Funcionario();
		
		System.out.print("Quantos funcionários deseja cadastrar: ");
		int quantidade = sc.nextInt();
		
		int id = 0;
		String nome = "";
		Date dataNascimento = null;
		double salario = 0.0;
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println();
			System.out.println("Funcionário #" + (i + 1));
			System.out.print("Id: ");
			id = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			
			System.out.print("Data Nascimento: ");
			String dataRecebida = sc.nextLine();
			dataNascimento = dataFormatada.parse(dataRecebida);
					
			System.out.print("Salário: ");
			salario = sc.nextDouble();
			
			func = new Funcionario(id, nome, dataNascimento, salario);
			lista.add(func);
			
			
		}
		System.out.println();
		System.out.println("#######################################");
		System.out.println("         Lista de funcionários         ");
		
		for(Funcionario x : lista) {
			System.out.println();
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("#######################################");
		sc.close();
	}

}
