package org.example.telas;

import org.example.dominios.Aluno;
import org.example.dominios.Bibliotecario;

import java.util.Scanner;

public class TelaBibliotecario {
    public static void executar(Bibliotecario bibliotecario, Scanner scanner) {
        int option = 99;
        do {
            System.out.println("-------------------------------------");
            System.out.printf("           Bem-vindo %s %n", bibliotecario.getNome());
            System.out.println("   O que deseja fazer?");
            System.out.println("   1 - Cadastrar um livro");
            System.out.println("   2 - Cadastar aluno");
            System.out.println("   3 - Realizar empréstimo");
            System.out.println("   4 - Realizar devolução");
            System.out.println("   5 - Procurar livro");
            System.out.println("   6 - Procurar aluno");
            System.out.println("   7 - Imprimir relatórios");
            System.out.println("   0 - Sair");
            System.out.println("-------------------------------------");
            try {
                String stringOption = scanner.next();
                option = Integer.parseInt(stringOption);
                switch (option) {
                    case 1:
                        InputDadosLivro.executar(scanner);
                        break;
                    case 2:
                        InputDadosAluno.executar(scanner);
                        break;
                    case 3:
                        TelaEmprestimo.executar(scanner);
                        break;
                    case 4:
                        TelaDevolucao.executar(scanner);
                        break;
                    case 5:
                        ProcurarLivro.executar(scanner);
                        break;
                    case 6:
                        Aluno aluno = ProcurarAluno.executar(scanner);
                        if (aluno == null) {
                            break;
                        }
                        System.out.println(aluno);
                        break;
                    case 7:
                        TelaRelatorios.executar(scanner);
                        break;
                }
            } catch (Exception exception){
                System.out.println("Entrada inválida, tente novamente");
            }
        } while (option != 0);
    }

}
