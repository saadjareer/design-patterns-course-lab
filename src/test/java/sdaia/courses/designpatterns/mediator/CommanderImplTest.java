package sdaia.courses.designpatterns.mediator;

import org.junit.Test;
import sdaia.courses.designpatterns.mediator.colleague.ArmedUnit;
import sdaia.courses.designpatterns.mediator.colleague.SoldierUnit;
import sdaia.courses.designpatterns.mediator.colleague.TankUnit;
import sdaia.courses.designpatterns.mediator.mediator.Commander;
import sdaia.courses.designpatterns.mediator.mediator.CommanderImpl;


public class CommanderImplTest {

    @Test
    public void testMediator() throws Exception {
        Commander commander = new CommanderImpl();
        ArmedUnit soldierUnit = new SoldierUnit(commander);
        ArmedUnit tankUnit = new TankUnit(commander);
        commander.registerArmedUnits(soldierUnit, tankUnit);
        commander.startAttack(soldierUnit);
        commander.startAttack(tankUnit);
        commander.ceaseAttack(soldierUnit);
        commander.startAttack(tankUnit);
    }
}
