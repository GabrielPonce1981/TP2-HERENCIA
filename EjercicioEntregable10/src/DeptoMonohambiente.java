public class DeptoMonohambiente extends Apartamento {

  private static final double precioMetroCuadrado = 1000000;

  public DeptoMonohambiente(char[] id, float valorM2, float tamanioM2, String direccion,  int numeroHabitaciones, int numeroBanios) {
    super(id, valorM2, tamanioM2, direccion, numeroHabitaciones, numeroBanios);
  }

  public void imprimir() {
  }

}