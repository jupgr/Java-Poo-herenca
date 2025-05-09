public class FlyingHero extends SuperHero {

    public FlyingHero(String nome, int nivelPoder, int saude) {
        super(nome, nivelPoder, saude);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " realiza um ataque aéreo!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa sua habilidade de voo super sônico!");
    }
}
