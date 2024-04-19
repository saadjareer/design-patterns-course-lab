package sdaia.courses.designpatterns.chainofResponsibility;

import sdaia.courses.designpatterns.chainofResponsibility.handlers.AbstractSupportHandler;
import sdaia.courses.designpatterns.chainofResponsibility.handlers.BillingSupportHandler;
import sdaia.courses.designpatterns.chainofResponsibility.handlers.GeneralSupportHandler;
import sdaia.courses.designpatterns.chainofResponsibility.handlers.TechnicalSupportHandler;

public class RequestorClient {

    public static AbstractSupportHandler getHandlerChain() {


        AbstractSupportHandler technicalSupportHandler = new TechnicalSupportHandler(AbstractSupportHandler.TECHNICAL);
        AbstractSupportHandler billingSupportHandler = new BillingSupportHandler(AbstractSupportHandler.BILLING);
        AbstractSupportHandler generalSupportHandler = new GeneralSupportHandler(AbstractSupportHandler.GENERAL);

        technicalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(generalSupportHandler);

        return technicalSupportHandler;
    }

}
