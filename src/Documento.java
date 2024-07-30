public class Documento implements IArquivo{
    private String nome;
    private String conteudo;

    public Documento(String nome, String conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
    }

    @Override
    public String getConteudo() {
        return this.conteudo;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
