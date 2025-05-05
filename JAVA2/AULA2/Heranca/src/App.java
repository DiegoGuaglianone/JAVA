public class App {
    public static void main(String[] args) throws Exception {
        Cachorro c = new Cachorro("Marley", "Daishinkan");
        Gato g = new Gato("Snow", "Branco");
        System.out.println(c.emitirSom());
        System.out.println(g.emitirSom());
    }
}
