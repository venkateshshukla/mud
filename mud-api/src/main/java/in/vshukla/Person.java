package in.vshukla;

import in.vshukla.enums.Education;
import in.vshukla.enums.Gender;

/**
 * Created by venkatesh on 12/3/16.
 */
public class Person {
    private String name;
    private Integer age;
    private Double weight;
    private Double height;
    private Education education;
    private Gender gender;

    private static final String description = "(Name : %s; Gender : %s; Age : %d; Hieght : %f; Weight : %f; Education : %s)";

    @Override
    public String toString() {
        return String.format(description, name, gender.getName(), age, height, weight, education.getText());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =  name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
