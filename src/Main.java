import Implementations.EtudiantServiceImpl;
import Models.Etudiant;
import Repositories.EtudiantRepository;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EtudiantRepository repositoryET=new EtudiantRepository();
        repositoryET.addMap();
        System.out.println(repositoryET.getEtudiantByName(2));

        }
    }
