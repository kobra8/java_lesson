package wyrazeniaSterujace;

public class EtykietyOrazBreakIContinue {
    public static void main(String[] args) {

    etykieta:    for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Pętla została przerwana");
                break;
            }
        }
        // Etykiety to nazwy którymi możemy nazywać częś kodu

        jeden: {
            dwa:{
                trzy: {
                    System.out.println("Początek 3 bloku");
                    if (true) break dwa;
                    System.out.println("Koniec 3 bloku");

                }
                System.out.println("Za 3 -im blokiem");
            }
            System.out.println("Za 2 blokiem");
        }

        // Continue - pętla nie wykona instrukcji z danej iteracji ale przejdzie do następnej (nie wychodzi z pętli)

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }

        petla2: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 2) continue petla2;
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
