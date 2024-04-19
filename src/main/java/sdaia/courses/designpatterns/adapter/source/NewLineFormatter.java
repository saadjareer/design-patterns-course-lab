package sdaia.courses.designpatterns.adapter.source;


public class NewLineFormatter implements TextFormattable {
    @Override
    public String formatText(String text) {
        String formattedText;
        formattedText = text.replace(".", "\n");
        return formattedText;
    }

}
