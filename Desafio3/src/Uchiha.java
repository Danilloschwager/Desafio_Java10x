
public class Uchiha extends Ninja {
 
    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
 
    @Override
    public void habilidadeEspecial() {
        System.out.println(getNome() + " usa: Chidori");
    }
}
 