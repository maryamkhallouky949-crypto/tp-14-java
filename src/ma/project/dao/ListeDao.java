package ma.project.dao;

import java.util.ArrayList;
import java.util.List;

import ma.project.entities.Identifiable;

public class ListeDao<T extends Identifiable> implements Idao<T> {

    private List<T> storage = new ArrayList<T>();


    public boolean create(T o) {

        if (o != null && getById(o.getId()) == null) {
            return storage.add(o);
        }

        return false;
    }

  
    public boolean update(T o) {

        if (o == null) {
            return false;
        }

        for (int i = 0; i < storage.size(); i++) {

            if (storage.get(i).getId() == o.getId()) {
                storage.set(i, o);
                return true;
            }
        }

        return false;
    }

 
    public boolean delete(T o) {

        if (o != null) {
            return storage.remove(o);
        }

        return false;
    }

   
    public T getById(int id) {

        for (int i = 0; i < storage.size(); i++) {

            if (storage.get(i).getId() == id) {
                return storage.get(i);
            }
        }

        return null;
    }

    public List<T> getAll() {
        return storage;
    }
}