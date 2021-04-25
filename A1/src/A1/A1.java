package A1;

import java.time.LocalDateTime;
import java.util.Scanner;

@SuppressWarnings("unused")
public class A1 
{
	private static final String JOptionPane = null;

	public static void main(String[] args) 
	{

		String REGRA_LETRA_M = "M";
		String REGRA_LETRA_J = "J";
		String REGRA_LETRA_C = "C";
		String REGRA_LETRA_H = "H";
		String REGRA_LETRA_E = "E";
		String REGRA_LETRA_L = "L";
	    String numero;
	    
		double beneficioEmpreg;
		double beneficioDesemp;
		double beneficio = 0;
		
		int usuario;
		int maior = 0; 
	    int contador = 1; 
	    int number;
	    int segundomaior = 0;
	    
	    Object deseja = 1;
	// Regras usadas: M, J (Substituição pela letra I), C, H, E e L.
	do 
    {
			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
		
				String nomeCompleto;
				
						System.out.println("Diga seu nome completo: ");
					nomeCompleto = teclado.nextLine();
		
				int diaNascimento;
				
						System.out.println("Digite o dia de seu nascimento: ");
					diaNascimento = teclado.nextInt();
					while (diaNascimento > 31 || diaNascimento < 1) 
				{
						System.out.println("Dia Inválido - Digite novamente");
					diaNascimento = teclado.nextInt();
				}
		
				int mesNascimento;
				
						System.out.println("Digite o mês que você nasceu: ");
					mesNascimento = teclado.nextInt();
				while (mesNascimento > 12 || mesNascimento < 1) 
				{
						System.out.println("Mês invalido - Digite novamente: ");
					mesNascimento = teclado.nextInt();
				}
				int anoAtual;
				int anoNascimento;
		
					System.out.println("Digite o ano em que você nasceu:");
				anoNascimento = teclado.nextInt();
		
				LocalDateTime data1 = LocalDateTime.now();
				anoAtual = data1.getYear();
				while (anoNascimento >= anoAtual) 
				{
						System.out.println("Ano inválido - Digite novamente");
					anoNascimento = teclado.nextInt();
				}
						System.out.println("Idade:" + (anoAtual - anoNascimento));
				// Regra letra J.
				String categoria1 = "";
			
			if (anoAtual - anoNascimento >= 20) 
			{
	
				String estado;
				String descricao;
				int acrescimo = 0;
				
						System.out.println("Digite o seu estado (UF):");
					estado = teclado.next();
				// Regra letra M.
				double novoValor;
				
				switch (estado.toUpperCase()) 
				{
					case "SP":
					novoValor = (beneficio * 11) / 100;
						System.out.println("O benefício para esse Estado sofrerá um acréscimo de 10%");
				}
	
				int categoria;
				
						System.out.println("Digite seu respectivo número\n" 
					+ "1 - empregado\n" 
					+ "2 - empregador\n" 
					+ "3 - desempregado\n");
				categoria = teclado.nextInt();
	
				switch (categoria) 
				{
	
					case 1: 
						{
							String aposentado;
							int empregador;
							
									System.out.println("O usuário é aposentado?");
								aposentado = teclado.next();
								categoria1 = "Empregado";
							if (aposentado.equalsIgnoreCase("sim")) 
							{
								aposentado = "aposentado";
									System.out.println("Você receberá entre R$ 1.000 e R$ 1.800 durante 6 meses");
							}else 
							{
								aposentado = "Não é aposentado";
									System.out.println("Você receberá entre R$ 1.000 e R$ 1.800");
							}
									System.out.println("Digite o benefício dos empregados.");
								beneficioEmpreg = teclado.nextDouble();
							break;
						}
					case 2:
						{
							categoria1 = "Empregador";
							int empregado;
							int qtdempregado;
								
									System.out.println("Quantos empregados possui?");
				
								// Regra letra C.
							do 
							{ 
									
								qtdempregado = teclado.nextInt();
									
								if(qtdempregado <= 0) 
								{
								System.out.println("A quantidade de empregados deve ser positiva.");
								}
									
							}while(qtdempregado <= 0 );
								
								beneficio = qtdempregado * 200.00;
									
							if (qtdempregado <= 50) 
								{
									System.out.println("Você receberá R$ 220,00 por funcionário");
								}else 
									{
									System.out.println("Você receberá R$ 200,00 por funcionário");
									}
							break;
						}
	
					case 3: 
						{
								System.out.println("Digite o benefício dos desempregados.");
							beneficioDesemp = teclado.nextDouble();
							categoria1 = "Desempregado";
							
							int qtdmeses;
							int desempregado;
							
								System.out.println("Há quantos meses você está desempregado?");
							qtdmeses = teclado.nextInt();
							beneficio = beneficioDesemp;
			
							// Regra letra L.
							if (qtdmeses < 6) 
							{
								System.out.println("O seu benefício é entre R$ 1.350 e R$ 2.070");
							}else 
								{
									System.out.println("O seu benefício é entre R$ 1.500 e R$ 2.300");
								}
							break;
						}
	
				}
			} else {
				System.out.println("O usuário menor de 20 anos não possuirá benefícios.");
			}
			System.out.println("Nome: " + nomeCompleto);
			System.out.println("A data de nascimento é: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento);
			System.out.println("Sua categoria é: " + categoria1);
	
		System.out.println("O valor total é: ");
		System.out.println("Quantidade de usuários lidos: ");
		System.out.println("Total de beneficiados: ");
		System.out.println("O maior valor é: " + maior + "e o segundo maior é: " + segundomaior);
		System.out.println("O dois beneficiados que irão receber por mais tempo são: ");
		System.out.println("Deseja informar outro beneficiário?");
}while(deseja.equals("Sim"));
	}
}