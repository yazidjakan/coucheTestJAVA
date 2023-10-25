package Implementations;

import DTO.EtudiantDTO;
import Models.Etudiant;
import Services.EtudiantService;

public class EtudiantServiceImpl implements EtudiantService {
    Etudiant ETdto=new EtudiantDTO();
    @Override
    public void admission() {
        System.out.println("Etudiant "+ETdto.getName() +" admis !");
    }

    @Override
    public void rejet() {
        System.out.println("Etudiant "+ETdto.getName() +" rejeté !");

    }
}
