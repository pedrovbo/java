package com.exercises.loops;
/*
Faça um FOR de 1 até 14, sendo que somente múltiplos de 2 sejam listados.
Entretanto, quando o loop passar pelo 12, o mesmo deve ser abortado.

Faça o exemplo acima com while.
 */
public class Exercise_13 {
    public static void main(String[] args) {
        int contador = 1;

        for (int i = 1; i <= 14; i++) {
            if(i%2==0){
                if (i >= 12){
                    break;
                }
                System.out.println("Múltiplo de 2 (for) = " + i);
            }
        }

        while(contador <= 14){
            if(contador >= 12){
                break;
            }

            if (contador % 2 == 0) {
                System.out.println("Múltiplo de 2 (while) = " + contador);
            }
            contador++;

        }
    }
}
