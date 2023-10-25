package Services;

import DTO.EtudiantDTO;
import Models.Etudiant;

public interface EtudiantTransformer {
    Etudiant dtoToEt(EtudiantDTO dto);
}
