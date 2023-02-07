package pro.sky.java.course1;

public class Author {
    private String name;
    private String surName;
    private String familyName;

    public Author(String name, String surName, String familyName) {
        this.name = name;
        this.surName = surName;
        this.familyName = familyName;
    }

    public Author() {

    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surName;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}

