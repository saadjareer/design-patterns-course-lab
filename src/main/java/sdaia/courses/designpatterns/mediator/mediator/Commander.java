package sdaia.courses.designpatterns.mediator.mediator;


import sdaia.courses.designpatterns.mediator.colleague.ArmedUnit;

public interface Commander {
   void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);
    void setAttackStatus(boolean attackStatus);
    boolean canAttack();
    void startAttack(ArmedUnit armedUnit);
    void ceaseAttack(ArmedUnit armedUnit);
}
