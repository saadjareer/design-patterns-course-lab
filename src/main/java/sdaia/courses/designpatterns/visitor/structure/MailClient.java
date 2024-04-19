package sdaia.courses.designpatterns.visitor.structure;

import sdaia.courses.designpatterns.visitor.visitors.MailClientVisitor;

public interface MailClient {
    void sendMail(String[] mailInfo);
    void receiveMail(String[] mailInfo);
    boolean accept(MailClientVisitor visitor);
}
