public class Uzumaki extends Ninja {
 
    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
 
    @Override
    public void habilidadeEspecial() {
        System.out.println(getNome() + " usa: Rasengan! ");
    }
}
 