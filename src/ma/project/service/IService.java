package ma.project.service;

import java.util.List;
import ma.project.entities.Identifiable;

public interface IService<T extends Identifiable> {

    boolean ajouter(T o);

    boolean modifier(T o);

    boolean supprimer(T o);

    T getById(int id);

    List<T> getAll();
}