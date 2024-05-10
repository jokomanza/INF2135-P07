// File: Information.java
package util.printer;

import java.util.ArrayList;
import java.util.List;

public class Information {
    private String content;
    private final List<Information> subInformations;

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

    public void addSubInformation(Information information) {
        subInformations.add(information);
    }

    public void addSubInformation(String content) {
        subInformations.add(new Information((content)));
    }
}
