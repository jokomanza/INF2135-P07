package util.printer;

import java.util.ArrayList;
import java.util.List;

public class Information {
    private final List<Information> subInformations;
    private String content;

    public Information(String content) {
        this.content = content;
        subInformations = new ArrayList<>();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Information> getSubInformations() {
        return subInformations;
    }

    public void addInformation(Information information) {
        subInformations.add(information);
    }

    public void addInformation(String content) {
        subInformations.add(new Information((content)));
    }
}
