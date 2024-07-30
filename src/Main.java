public class Main {
    public static void main(String[] args) {
        Documento contrato = new Documento("Contrato", "Conteúdo do contrato...");
        Documento relatorio = new Documento("Relatório", "Conteúdo do relatório...");
        Documento planoDeProjeto = new Documento("Plano de Projeto", "Conteúdo do plano de projeto...");
        Documento notas = new Documento("Notas", "Conteúdo das notas...");
        Documento resumo = new Documento("Resumo", "Conteúdo do resumo...");

        Diretorio pastaDocumentosGerais = new Diretorio("Documentos Gerais");
        pastaDocumentosGerais.addArquivo(contrato);
        pastaDocumentosGerais.addArquivo(relatorio);

        Diretorio pastaProjetos = new Diretorio("Projetos");
        pastaProjetos.addArquivo(planoDeProjeto);

        Diretorio pastaNotas = new Diretorio("Notas");
        pastaNotas.addArquivo(notas);
        pastaNotas.addArquivo(resumo);

        Diretorio raiz = new Diretorio("Raiz");
        raiz.addArquivo(pastaDocumentosGerais);
        raiz.addArquivo(pastaProjetos);
        raiz.addArquivo(pastaNotas);

        System.out.println(raiz.getConteudo());
    }
}
