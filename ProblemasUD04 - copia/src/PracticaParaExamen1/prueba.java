package PracticaParaExamen1;

import java.util.ArrayList;
import java.util.List;

public class prueba {
    public static void main(String[] args) {
        Coche coc= new Coche(400);
        Moto mot= new Moto(1000);
        CocheElectrico cocEle= new CocheElectrico(75, 50);
        CocheHibrido cocHib= new CocheHibrido(80, 40, 50 );
        Camion cam= new Camion(90, 8);
        mot.conducir();
        coc.conducir();
        System.out.println(coc.getVelocidadMaxima());
        System.out.println(mot.getVelocidadMaxima());
        System.out.println(coc.tipoDeCombustible());
        System.out.println(mot.tipoDeCombustible());


        List<Vehiculo> vehiculo = new ArrayList<>();
        vehiculo.add(coc);
        vehiculo.add(mot);
        vehiculo.add(cocEle);
        vehiculo.add(cocHib);
        vehiculo.add(cam);

        for(int i = 0; i< vehiculo.size(); i++){
            vehiculo.get(i).mostrarInformacionBasico();
            vehiculo.get(i).conducir();
        }
    }
}
