package co.uniquindio.proyecto.modelProducto;


public class PastelBuilder implements ProductoBuilder {
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
            Pastel pastel = new Pastel();
            pastel.setNombre(nombre);
            pastel.setiD(iD);
            pastel.setPrecio(precio);
            return pastel;
        }


}



