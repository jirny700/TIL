package opentutorials.practice;

import java.util.ArrayList;
import java.util.List;

public class Request {
    String firstLine;
    List<String> headers;

    public Request() {
        headers = new ArrayList<>();
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public String getPath() {
        String[] strings = firstLine.split(" ");
        return strings[1];
    }

    public void addHeader(String line) {
        headers.add(line);
    }
}

