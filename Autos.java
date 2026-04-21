public class Autos {
    //Atributos 
    String marca;
    String color;
    int patente;

    //contructor
    public Autos(String marca, String color, int patente){
        this.marca = marca;
        this.color = color;
        this.patente = patente;
    }
    //Metodos
    public void arrancar(){
        System.out.println("El auto "+ marca + " de color "+ color+" arranco");
    }
}
