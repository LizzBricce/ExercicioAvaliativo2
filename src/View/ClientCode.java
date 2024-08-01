package View;

import Model.Diretorio;
import Model.Documento;

import java.util.Scanner;

public class ClientCode {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do diretório principal:");
        String diretorioRaiz = scanner.nextLine();
        Diretorio raiz = new Diretorio(diretorioRaiz);

        boolean proximo = true;
        while (proximo) {
            System.out.println("Escolha uma opção:");
            System.out.println("1- Novo diretório");
            System.out.println("2- Novo arquivo");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha restante

            if (escolha == 1) {
                System.out.println("Digite o nome do novo diretório:");
                String nomeDiretorio = scanner.nextLine();

                Diretorio novoDiretorio = new Diretorio(nomeDiretorio);
                raiz.addArquivo(novoDiretorio);
            } else if (escolha == 2) {
                System.out.println("Digite o nome do arquivo:");
                String nomeArquivo = scanner.nextLine();
                System.out.println("Digite o conteúdo do arquivo:");
                String conteudo = scanner.nextLine();

                Documento novoDocumento = new Documento(nomeArquivo, conteudo);
                raiz.addArquivo(novoDocumento);
            }

            System.out.println("Escolha uma opção:");
            System.out.println("2 - Adicionar mais diretórios ou arquivos");
            System.out.println("3 - Ver conteúdos adicionados");

            int novaEscolha = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha restante

            if (novaEscolha == 2) {
                proximo = true;
            } else if (novaEscolha == 3) {
                System.out.println(raiz.getConteudo());
                proximo = false; // Adicionado para encerrar o loop após mostrar o conteúdo
            }
        }

        scanner.close();
    }
}