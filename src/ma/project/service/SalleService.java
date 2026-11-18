package ma.project.service;

import java.util.List;

import ma.project.dao.Idao;
import ma.project.dao.ListeDao;
import ma.project.entities.Salle;

public class SalleService implements IService<Salle> {

    private Idao<Salle> dao = new ListeDao<Salle>();

    @Override
    public boolean ajouter(Salle o) {
        return dao.create(o);
    }

    @Override
    public boolean modifier(Salle o) {
        return dao.update(o);
    }

    @Override
    public boolean supprimer(Salle o) {
        return dao.delete(o);
    }

    @Override
    public Salle getById(int id) {
        return dao.getById(id);
    }

    
    public List<Salle> getAll() {
        return dao.getAll();
    }
}