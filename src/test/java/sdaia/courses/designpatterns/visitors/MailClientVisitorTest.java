package sdaia.courses.designpatterns.visitors;

import org.junit.Before;
import org.junit.Test;
import sdaia.courses.designpatterns.visitor.structure.OperaMailClient;
import sdaia.courses.designpatterns.visitor.structure.SquirrelMailClient;
import sdaia.courses.designpatterns.visitor.structure.ZimbraMailClient;
import sdaia.courses.designpatterns.visitor.visitors.LinuxMailClientVisitor;
import sdaia.courses.designpatterns.visitor.visitors.MacMailClientVisitor;
import sdaia.courses.designpatterns.visitor.visitors.WindowsMailClientVisitor;

import static org.junit.Assert.assertTrue;

public class MailClientVisitorTest {
    private MacMailClientVisitor macVisitor;
    private LinuxMailClientVisitor linuxVisitor;
    private WindowsMailClientVisitor windowsVisitor;
    private OperaMailClient operaMailClient;
    private SquirrelMailClient squirrelMailClient;
    private ZimbraMailClient zimbraMailClient;

    @Before
    public void setup() {
        macVisitor = new MacMailClientVisitor();
        linuxVisitor = new LinuxMailClientVisitor();
        windowsVisitor = new WindowsMailClientVisitor();
        operaMailClient = new OperaMailClient();
        squirrelMailClient = new SquirrelMailClient();
        zimbraMailClient = new ZimbraMailClient();
    }

    @Test
    public void testOperaMailClient() throws Exception {
        System.out.println("-----Testing Opera Mail Client for different environments-----");
        assertTrue(operaMailClient.accept(macVisitor));
        assertTrue(operaMailClient.accept(linuxVisitor));
        assertTrue(operaMailClient.accept(windowsVisitor));

    }

    @Test
    public void testSquirrelMailClient() throws Exception {
        System.out.println("\n-----Testing Squirrel Mail Client for different environments-----");
        assertTrue(squirrelMailClient.accept(macVisitor));
        assertTrue(squirrelMailClient.accept(linuxVisitor));
        assertTrue(squirrelMailClient.accept(windowsVisitor));

    }

    @Test
    public void testZimbraMailClient() throws Exception {
        System.out.println("\n-----Testing Zimbra Mail Client for different environments-----");
        assertTrue(zimbraMailClient.accept(macVisitor));
        assertTrue(zimbraMailClient.accept(linuxVisitor));
        assertTrue(zimbraMailClient.accept(windowsVisitor));

    }
}
