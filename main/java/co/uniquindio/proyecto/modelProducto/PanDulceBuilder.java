package co.uniquindio.proyecto.modelProducto;

import java.time.LocalDate;
import java.util.ArrayList;

public class PanDulceBuilder implements ProductoBuilder{
    String nombre="";
        String iD = "";
        double precio=0;


        public void nombre(String nombre){
            this.nombre=nombre;
        }
        public void  iD( String iD) {
            this.iD=iD;
        }
        public void  precio(double precio){
            this.precio=precio;
        }


        public Producto build(){
            PanDulce panDulce = new PanDulce();
            panDulce.setNombre(nombre);
            panDulce.setiD(iD);
            panDulce.setPrecio(precio);
            return panDulce;
        }

}
