package sdaia.courses.designpatterns.source;

import org.junit.Test;
import sdaia.courses.designpatterns.adapter.adaptee.CsvFormattable;
import sdaia.courses.designpatterns.adapter.adaptee.CsvFormatter;
import sdaia.courses.designpatterns.adapter.csvadapter.CsvAdapterImpl;
import sdaia.courses.designpatterns.adapter.source.NewLineFormatter;
import sdaia.courses.designpatterns.adapter.source.TextFormattable;


public class NewLineFormatterTest {
    @Test
    public void testFormatText() throws Exception {

            String testString=" Formatting line 1. Formatting line 2. Formatting line 3.";
            TextFormattable newLineFormatter=new NewLineFormatter();
            String resultString = newLineFormatter.formatText(testString);
            System.out.println(resultString);

            CsvFormattable csvFormatter=new CsvFormatter();
            TextFormattable csvAdapter=new CsvAdapterImpl(csvFormatter);
            String resultCsvString=csvAdapter.formatText(testString);
            System.out.println(resultCsvString);
    }
}
