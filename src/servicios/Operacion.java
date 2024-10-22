package servicios;
import java.util.List;

public interface Operacion<T> {
    void create(T objeto);
    List<T> read();
    T readById(int id);
    void update(T objeto);
    void delete(int id);
}
