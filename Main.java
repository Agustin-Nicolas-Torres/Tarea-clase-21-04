public class Main {
    public static void main(String[] args){
        Autos a1 = new Autos("BMW", "Blanco", 1234);
        Auto_electrico miTeslita = new Auto_electrico("tesla", "rojo", 7125, 50);
        a1.arrancar();
        miTeslita.arrancar();
        miTeslita.cargarbateria();
    }
}
