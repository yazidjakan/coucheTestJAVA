package Models;

public class Etudiant {
    private int id;
    private String name;

    private int age;

    private String specialite;

    public Etudiant(int id, String name, int age, String specialite) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.specialite = specialite;
    }

    public Etudiant(){
    }
    public Etudiant(int id,String name) {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
