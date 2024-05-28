package co.uniquindio.proyecto.modelProducto;

public class GalletaBuilder implements ProductoBuilder {
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
            Galleta galleta = new Galleta();
            galleta.setNombre(nombre);
            galleta.setiD(iD);
            galleta.setPrecio(precio);
            return galleta;
        }

}

