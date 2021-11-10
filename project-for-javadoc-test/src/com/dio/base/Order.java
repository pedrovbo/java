package com.dio.base;

import java.math.BigDecimal;

/**
 * @author Pedro Oliveira
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 1.0.0
 */
public class Order {

    // representa o código do pedido
    private final String code;
    private final BigDecimal totalValue;
    //private String[] items = {"banana", "laranja"};

    /**
     * Construtor da classe
     *
     * @param code       Código do pedido
     * @param totalValue Valor total do pedido
     */

    public Order(String code, BigDecimal totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    /**
     * Calcula o valor total de acordo com o valor do pedido. Se o valor for maior que R$ 100,00 uma taxa será cobrada.
     *
     * @return Valor total do pedido com as taxas
     * @throws RuntimeException Se o pedido for um valor negativo
     */


    public BigDecimal calculateFee() throws RuntimeException {
        if (this.totalValue.signum() < 0) {
            throw new RuntimeException("O pedido não pode ter valor negativo");

        }
        if (this.totalValue.compareTo(new BigDecimal(100.00)) > 0) {
            return this.totalValue.multiply(new BigDecimal(0.99));
        }
        return this.totalValue;
    }


    @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                ", totalValue=" + totalValue +
                '}';
    }
}