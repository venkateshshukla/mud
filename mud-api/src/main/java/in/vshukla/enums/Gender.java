package in.vshukla.enums;

/**
 * Created by venkatesh on 12/3/16.
 */
public enum Gender {
    MALE("male", "M"), FEMALE("female", "F"), TRANS("transgender", "T");

    Gender(String name, String shortName) {
        this.name = name;
        this.shortName = shortName;
    }

    private String name;
    private String shortName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
