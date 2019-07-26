package typyProsteDanychIZmienne;

import java.math.BigDecimal;

public class TypyZmiennoprzcinkowe {

    float f1 = 1.4E-45F, f2 = 3.4E+38F; // rozmiar 32 bity
    double d1 = 4.9E-324, d2 = 1.79E+308; // rozmiar 64 bity

    // Konwersja liczb naukowych
    // 2E+2 == 2 * 10^2
    // 2E-2 == 2 * 10^-2  (potęga ujemna oznacza dodatni ułamek 1/2)

  //  BigDecimal
}

// Przy bardzo istotnej precyzji obliczeń nie uzywamy float i double tylko klasy BigDecimal z pakietu java.math