

public class ProgramForma {
    public static void main(String[] args) {
        FormaGeometricaForma formaGeometricaForma = new FormaGeometricaForma();

        try {
            System.out.printf("Area: %d", formaGeometricaForma.area());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}