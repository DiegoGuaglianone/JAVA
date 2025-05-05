import com.aula.Animal;
import com.aula.Cachorro;
import com.aula.Gato;

public class App {
    public static void main(String[] args) {
        Animal a = new Animal("Generico");
        a.emitirSom();
        a.mostrarNome();

        Cachorro c = new Cachorro("REX");
        c.emitirSom();
        c.latir();
        c.mostrarNome();

        Gato g = new Gato("Fox","Sardinha");
        g.miar();
        g.emitirSom();
        g.mostrarNome();
        g.mostrarRaca();
    }
}
