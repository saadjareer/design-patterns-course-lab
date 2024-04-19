package sdaia.courses.designpatterns.ChainofResponsibility;

import sdaia.courses.designpatterns.ChainofResponsibility.handlers.AbstractSupportHandler;
import sdaia.courses.designpatterns.ChainofResponsibility.handlers.BillingSupportHandler;
import sdaia.courses.designpatterns.ChainofResponsibility.handlers.GeneralSupportHandler;
import sdaia.courses.designpatterns.ChainofResponsibility.handlers.TechnicalSupportHandler;

public class RequestorClient {

    public  static AbstractSupportHandler getHandlerChain(){


        AbstractSupportHandler technicalSupportHandler = new TechnicalSupportHandler( AbstractSupportHandler.TECHNICAL);
        AbstractSupportHandler billingSupportHandler = new BillingSupportHandler(  AbstractSupportHandler.BILLING);
        AbstractSupportHandler generalSupportHandler = new GeneralSupportHandler(AbstractSupportHandler.GENERAL);

        technicalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(generalSupportHandler);

        return technicalSupportHandler;
    }

}
