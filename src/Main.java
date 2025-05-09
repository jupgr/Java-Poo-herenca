public class Main {
    public static void main(String[] args) {
        FlyingHero heroi1 = new FlyingHero("Diana", 80, 100);
        StrongHero heroi2 = new StrongHero("Hulk", 90, 120);
        SpeedHero heroi3 = new SpeedHero("Tempestade", 85, 90);

        // Testando todos os métodos
        heroi1.atacar();
        heroi1.defender();
        heroi1.usarHabilidadeEspecial();

        System.out.println();

        heroi2.atacar();
        heroi2.defender();
        heroi2.usarHabilidadeEspecial();

        System.out.println();

        heroi3.atacar();
        heroi3.defender();
        heroi3.usarHabilidadeEspecial();
    }
}
