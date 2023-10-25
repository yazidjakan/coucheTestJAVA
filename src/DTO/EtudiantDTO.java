package DTO;

import Models.Etudiant;

public class EtudiantDTO extends Etudiant {
    public EtudiantDTO(int id,String name) {
        super(id,name);
    }

    public EtudiantDTO() {
        super();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
