package Repositories;

import DTO.EtudiantDTO;
import Models.Etudiant;


import java.util.HashMap;
import java.util.Map;

public class EtudiantRepository {
    private Map<Integer, EtudiantDTO> mapEt=new HashMap<>();

    public Map<Integer, EtudiantDTO> addMap(){
        EtudiantDTO etudiant1=new EtudiantDTO(1,"Yazid Jakan");
        EtudiantDTO etudiant2=new EtudiantDTO(2,"Zakaria Samadi");
        mapEt.put(1,etudiant1);
        mapEt.put(2,etudiant2);
        return mapEt;
    }
    public String getEtudiantByName(int id){
        return mapEt.get(id).getName();
    }
    //CRUD
}
