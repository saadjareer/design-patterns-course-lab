package sdaia.courses.designpatterns.adapter.csvadapter;

import sdaia.courses.designpatterns.adapter.adaptee.CsvFormattable;
import sdaia.courses.designpatterns.adapter.source.TextFormattable;

public class CsvAdapterImpl implements TextFormattable {
    CsvFormattable csvFormatter;

    public CsvAdapterImpl(CsvFormattable csvFormatter) {
        this.csvFormatter = csvFormatter;
    }

    @Override
    public String formatText(String text) {
        String formattedText;
        formattedText = csvFormatter.formatCsvText(text);
        return formattedText;
    }
}
