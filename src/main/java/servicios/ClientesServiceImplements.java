package servicios;

import modelos.Clientes;
import java.util.Arrays;
import java.util.List;

public class ClientesServiceImplements implements ClientesServices {

    @Override
    public List<Clientes> listar() {
        return Arrays.asList(
                new Clientes(1, "Juan", "Perez", "juanperez@gmail.com", "Calle 1"),
                new Clientes(2, "Ana", "Lopez", "analopez@gmail.com", "Calle 2")
        );
    }
}
