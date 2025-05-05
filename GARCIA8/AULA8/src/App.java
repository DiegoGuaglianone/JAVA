import com.aula8.Cliente;
import com.aula8.Produto;
import com.aula8.Tabela;

public class App {
    public static void main(String[] args) throws Exception {
        String sql = Tabela.inserir(new Cliente("João","0548175545"));
        System.out.println(sql);
    }
}
