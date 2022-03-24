/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/MessageDrivenBean.java to edit this template
 */
package ejbs;

import jakarta.jms.JMSException;
import jakarta.jms.TextMessage;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author pedro
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup",
            propertyValue = "jms/SimpleQueue"),
    @ActivationConfigProperty(propertyName = "destinationType",
            propertyValue = "javax.jms.Queue")
})
public class Mensageiro001 implements MessageListener {

    public Mensageiro001() {
    }

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("Mensagem enviada: "
                    + ((TextMessage) message).getText());
        } catch (JMSException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
