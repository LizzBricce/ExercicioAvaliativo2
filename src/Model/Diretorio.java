package Model;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements IArquivo {

    public String nome;
    public List<IArquivo> arquivos;

    public Diretorio(String nome) {
        this.nome = nome;
        this.arquivos = new ArrayList<IArquivo>();
    }

    public void addArquivo(IArquivo arquivo) {
        this.arquivos.add(arquivo);
    }

    @Override
    public String getConteudo() {
        StringBuilder conteudo = new StringBuilder();
        conteudo.append(nome).append("/\n"); // Nome do diretório raiz
        gerarConteudo(conteudo, "");
        return conteudo.toString();
    }

    private void gerarConteudo(StringBuilder conteudo, String prefixo) {
        int tamanho = arquivos.size();
        for (int i = 0; i < tamanho; i++) {
            IArquivo arquivo = arquivos.get(i);
            boolean ultimoItem = (i == tamanho - 1);

            conteudo.append(prefixo);
            if (ultimoItem) {
                conteudo.append("└── ");
            } else {
                conteudo.append("├── ");
            }

            if (arquivo instanceof Documento) {
                conteudo.append(arquivo.getNome()).append("\n");
            } else if (arquivo instanceof Diretorio) {
                conteudo.append(arquivo.getNome()).append("/\n");
                String novoPrefixo = prefixo + (ultimoItem ? "    " : "│   ");
                ((Diretorio) arquivo).gerarConteudo(conteudo, novoPrefixo);
            }
        }
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
