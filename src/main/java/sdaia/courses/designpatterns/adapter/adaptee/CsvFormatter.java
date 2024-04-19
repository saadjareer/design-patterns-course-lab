package sdaia.courses.designpatterns.adapter.adaptee;


public class CsvFormatter implements CsvFormattable {
    @Override
    public String formatCsvText(String text) {
        String formattedText;
        formattedText = text.replace(".", ",");
        return formattedText;
    }
}
