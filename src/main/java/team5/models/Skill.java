package team5.models;

public class Skill {
    private long id;
    private String skill;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Skill(long id, String skill) {
        this.id = id;
        this.skill = skill;
    }

    public Skill() {
    }
}