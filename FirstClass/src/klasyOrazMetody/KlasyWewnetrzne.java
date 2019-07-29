package klasyOrazMetody;

public class KlasyWewnetrzne {

    public static void main(String[] args) {

        Komputer komputer = new Komputer(10);
        komputer.uruchom();
        Komputer.KartaSieciowa kartaSieciowa = komputer.utworzKarteSieciowa();
        kartaSieciowa.ustanowPolaczenie();

        Komputer.KartaSieciowa kartaSieciowa2 = komputer.new KartaSieciowa(); // Inne sposoby dostępu do klay wewnętrznej
        Komputer.KartaSieciowa kartaSieciowa3 = new Komputer(5).new KartaSieciowa(); // Inny sposób - nie korzystać !
    }

}
