package servicios;

import modelo.JardinVertical;

import java.util.List;

public class OperacionImplementacion implements Operacion<JardinVertical> {


    @Override
    public void create(JardinVertical objeto) {

    }

    @Override
    public List<JardinVertical> read() {
        return List.of();
    }

    @Override
    public JardinVertical readById(int id) {
        return null;
    }

    @Override
    public void update(JardinVertical objeto) {

    }

    @Override
    public void delete(int id) {

    }
}
