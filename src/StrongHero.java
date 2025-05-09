public class StrongHero extends SuperHero {

    public StrongHero(String nome, int nivelPoder, int saude) {
        super(nome, nivelPoder, saude);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca com força bruta!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa sua superforça para levantar um prédio!");
    }
}
