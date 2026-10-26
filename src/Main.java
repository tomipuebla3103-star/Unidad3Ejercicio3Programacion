//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Termostato termostato = new Termostato();

    termostato.setTemperatura(25);
    System.out.println("Temperatura actual: " + termostato.getTemperatura() + "°C");

    termostato.setTemperatura(10);
    System.out.println("Temperatura actual: " + termostato.getTemperatura() + "°C");

    termostato.setTemperatura(35);
    System.out.println("Temperatura actual: " + termostato.getTemperatura() + "°C");

    termostato.setTemperatura(18);
    System.out.println("Temperatura actual: " + termostato.getTemperatura() + "°C");
}
