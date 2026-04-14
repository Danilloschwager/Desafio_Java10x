public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Metodo abstrato: obriga toda subclasse a implementar
    public abstract void habilidadeEspecial();

    public void apresentar() {
        System.out.println("Nome: " + nome + " | Aldeia: " + aldeia + " | Idade: " + idade);
    }

    // Getters
    public String getNome()   { return nome; }
    public String getAldeia() { return aldeia; }
    public int getIdade()     { return idade; }
}