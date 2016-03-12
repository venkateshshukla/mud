package in.vshukla.enums;

/**
 * Created by venkatesh on 12/3/16.
 */
public enum Education {

    NONE("None"),
    HIGHSCHOOL("High School"),
    GRAD("Graduate"),
    POSTGRAD("Post Graduate"),
    DOCTORATE("Doctorate");

    Education(String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
