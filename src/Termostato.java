public class Termostato {
    private double temperaturaActual;
    private String modoOperacion;

    public Termostato() {
        temperaturaActual = 20;
        modoOperacion = "Automático";
    }

    public void setTemperatura(double nuevaTemperatura) {
        if (nuevaTemperatura >= 15 && nuevaTemperatura <= 30) {
            temperaturaActual = nuevaTemperatura;
            System.out.println("Temperatura establecida correctamente.");
        } else {
            System.out.println("Advertencia: la temperatura debe estar entre 15 y 30 grados.");
        }
    }

    public double getTemperatura() {
        return temperaturaActual;
    }
}
