package Implementations;

import DTO.EtudiantDTO;
import Models.Etudiant;
import Services.EtudiantTransformer;

public class EtudiantTransformerImpl implements EtudiantTransformer {

    @Override
    public Etudiant dtoToEt (EtudiantDTO dto){
        Etudiant Et=new Etudiant();
        Et.setId(dto.getId());
        Et.setName(dto.getName());
        return Et;
    }
}
