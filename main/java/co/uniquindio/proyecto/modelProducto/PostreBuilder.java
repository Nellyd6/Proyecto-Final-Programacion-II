package co.uniquindio.proyecto.modelProducto;

public class PostreBuilder implements ProductoBuilder{
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
            Postre postre = new Postre();
            postre.setNombre(nombre);
            postre.setiD(iD);
            postre.setPrecio(precio);
            return postre;
        }

}
