package sdaia.courses.designpatterns.observer.observerimpl;

import java.math.BigDecimal;

public interface Observer {
    void update(Observer observer, String productName, BigDecimal bidAmount);
}
