package projeto;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class MetodoStatic {
    static public int getNumAleatorio(int ini, int fim) {
        LocalTime horaAtual = LocalTime.now();
        long semente = horaAtual.toNanoOfDay();
        Random random = new Random(semente);

        return random.nextInt(fim-ini + 1) + ini;
    }

    static final public void limpaTela() {
        for (int i=0; i<50; i++)
            System.out.print("\n");
    }

    static public void systemPause() { 
        Scanner ler = new Scanner(System.in);

        System.out.println("\nPressione enter...");
        String resp = ler.nextLine();
        return;
    }

    static public int resposta() {
        Scanner ler = new Scanner(System.in);
        return ler.nextInt();
    }
}
