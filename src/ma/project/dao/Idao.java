package ma.project.dao;

import java.util.List;
import ma.project.entities.Identifiable;

public interface Idao<T extends Identifiable> {

    boolean create(T o);

    boolean update(T o);

    boolean delete(T o);

    T getById(int id);

    List<T> getAll();
}