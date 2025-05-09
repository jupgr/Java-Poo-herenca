public class SuperHero {
    protected String nome;
    protected int nivelPoder;
    protected int saude;

    public SuperHero(String nome, int nivelPoder, int saude) {
        this.nome = nome;
        this.nivelPoder = nivelPoder;
        this.saude = saude;
    }

    public void atacar() {
        System.out.println(nome + " realiza um ataque padrão.");
    }

    public void defender() {
        System.out.println(nome + " está se defendendo.");
    }

    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa uma habilidade especial genérica.");
    }
}
