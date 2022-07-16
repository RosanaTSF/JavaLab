package codeIntellij;

import codeIntellij.feline.ManekiNeko;

public class nekoIntellij {

    public static void main(String[] args) {
        ManekiNeko manekiNeko = new ManekiNeko();
        System.out.println(manekiNeko);

        Integer numPaginas;
        Livro livro1 = new Livro("Chi's sweet home", numPaginas: 300);

        System.out.println(livro1);
/*
        int a = 3;
        int b = 10;
        System.out.println("Hello world! Meu irmao e eu passamos em computacao na UNIVESP! Uma Universidade Publica! Tenho outro irmao que ja eh um dev formado! :D " + (a+b));
*/
        }
    }

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
