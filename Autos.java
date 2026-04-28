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

 class Auto_electrico extends Autos {
    private int niveldebateria;

    public Auto_electrico(String marca, String color, int patente,int niveldebateria){
        super(marca, color, patente);
        this.niveldebateria = niveldebateria;
    }
    
    public void cargarbateria(){
        this.niveldebateria = 100;
        System.out.println("La bateria cargo al 100");
    }
}
