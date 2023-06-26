
/**
 * Write a description of class Cliente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cliente
{
    public static class ClienteHelado{
        private final  String identificacion;
        private String nombre;
        private String sucursal;
        private double compra1;
        private double compra2;
    
        public String getIdentificacion(){
            return identificacion;
        }
    
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            if(nombre != null) this.nombre = nombre;
            else this.nombre = "";
        }
    
        public String getSucursal(){
            return sucursal;
        }
        public void setSucursal(String sucursal){
            if(sucursal != null) this.sucursal = sucursal;
            else this.sucursal = "";
        }
    
        public double getCompra1(){
            return compra1;
        }
        public void setCompra1(double compra1){
            if(compra1 >= 0) this.compra1 = compra1;
            else this.compra1 = 0;
        }
    
        public double getCompra2(){
            return compra2;
        }
        public void setCompra2(double compra2){
            if(compra2 >= 0) this.compra2 = compra2;
            else this.compra2 = 0;
        }
    
        ClienteHelado(String identificacion, String nombre, String sucursal, double compra1, double compra2){
            if(identificacion != null) this.identificacion = identificacion;
            else this.identificacion = "";
            setNombre(nombre);
            setSucursal(sucursal);
            setCompra1(compra1);
            setCompra2(compra2);
        }
    
        double calcularPromedio(){
            return (compra1 + compra2) / 2;
            }
    }
    public static class ClienteCosmeticos{
        private final String identificacion;
        private String nombre;
        private String sucursal;
        private double compra1;
        private double compra2;
        private double compra3;
        
        public String getIdentificacion(){
            return identificacion;
        }
        
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            if(nombre != null) this.nombre = nombre;
            else this.nombre = "";
        }
        
        public String getSucursal(){
            return sucursal;
        }
        public void setSucursal(String sucursal){
            if(sucursal != null) this.sucursal = sucursal;
            else this.sucursal = "";
        }
    
        public double getCompra1(){
            return compra1;
        }
        public void setCompra1(double compra1){
            if(compra1 >= 0) this.compra1 = compra1;
            else this.compra1 = 0;
        }
    
        public double getCompra2(){
            return compra2;
        }
        public void setCompra2(double compra2){
            if(compra2 >= 0) this.compra2 = compra2;
            else this.compra2 = 0;
        }
        
        public double getCompra3(){
            return compra3;
        }
        public void setCompra3(double compra3){
            if(compra3 >= 0) this.compra3 = compra3;
            else this.compra3 = 0;
        }
        
        ClienteCosmeticos(String identificacion, String nombre, String sucursal, double compra1, double compra2, double compra3){
            if(identificacion != null) this.identificacion = identificacion;
            else this.identificacion = "";
            setNombre(nombre);
            setSucursal(sucursal);
            setCompra1(compra1);
            setCompra2(compra2);
            setCompra3(compra3);
        }
        
        double calcularPromedio(){
            return (compra1 + compra2 + compra3) / 3;
        }
    }
    public static class ClienteMedicamento{
        private final String identificacion;
        private String nombre;
        private String sucursal;
        private double compra1;
        private double compra2;
        private double compra3;
        private double compra4;
        
        public String getIdentificacion(){
            return identificacion;
        }
        
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            if(nombre != null) this.nombre = nombre;
            else this.nombre = "";
        }
        
        public String getSucursal(){
            return sucursal;
        }
        public void setSucursal(String sucursal){
            if(sucursal != null) this.sucursal = sucursal;
            else this.sucursal = "";
        }
    
        public double getCompra1(){
            return compra1;
        }
        public void setCompra1(double compra1){
            if(compra1 >= 0) this.compra1 = compra1;
            else this.compra1 = 0;
        }
    
        public double getCompra2(){
            return compra2;
        }
        public void setCompra2(double compra2){
            if(compra2 >= 0) this.compra2 = compra2;
            else this.compra2 = 0;
        }
        
        public double getCompra3(){
            return compra3;
        }
        public void setCompra3(double compra3){
            if(compra3 >= 0) this.compra3 = compra3;
            else this.compra3 = 0;
        }
        
        public double getCompra4(){
            return compra4;
        }
        public void setCompra4(double compra4){
            if(compra4 >= 0) this.compra4 = compra4;
            else this.compra4 = 0;
        }
        
        ClienteMedicamento(String identificacion, String nombre, String sucursal, double compra1, double compra2, double compra3, double compra4){
            if(identificacion != null) this.identificacion = identificacion;
            else this.identificacion = "";
            setNombre(nombre);
            setSucursal(sucursal);
            setCompra1(compra1);
            setCompra2(compra2);
            setCompra3(compra3);
            setCompra4(compra4);
        }
        
        double calcularPromedio(){
            return (compra1 + compra2 + compra3 + compra4) / 4;
        }
    }
}
