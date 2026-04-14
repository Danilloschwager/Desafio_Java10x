public class Main {
    public static void main(String[] args) {
 
        Ninja naruto = new Uzumaki("Naruto Uzumaki", "Konoha", 17);
        naruto.apresentar();
        naruto.habilidadeEspecial();
 
        System.out.println();
 
        Ninja sasuke = new Uchiha("Sasuke Uchiha", "Konoha", 17);
        sasuke.apresentar();
        sasuke.habilidadeEspecial();
    }
}
 