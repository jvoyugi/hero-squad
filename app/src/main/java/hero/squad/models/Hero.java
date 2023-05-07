package hero.squad.models;


public class Hero {
    String name;
    Integer age;
    String specialPower;
    String weakness;
    Integer id;
    String squadId;

    public Hero(String name, Integer age, String specialPower, String weakness, String squadId) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        this.squadId = squadId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSpecialPower() {
        return this.specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    public String getWeakness() {
        return this.weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public String getSquadId() {
        return squadId;
    }

    public void setSquadId(String squadId) {
        this.squadId = squadId;
    }
}