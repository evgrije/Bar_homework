import java.util.EmptyStackException;

public class Staff {
    private String name;
    private String surname;
    private int experience;

    public Staff(String name, String surname, int experience) {
        this.name = name;
        setName(name);

        this.surname = surname;
        setSurname(surname);

        this.experience = experience;
        setExperience(experience);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            throw new EmptyStackException();
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname != null && !surname.isEmpty()){
            this.surname = surname;
        } else {
            throw new EmptyStackException();
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience != 0){
            this.experience = experience;
        } else {
            throw new EmptyStackException();
        }
    }
}
