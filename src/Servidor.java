public class Servidor {
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;
    private static int totalServidores = 0;
    private static int servidoresActivos = 0;
    public Servidor(String nombre, String direccionIP){
        totalServidores++;
        this.id=totalServidores;
        this.nombre=nombre;
        this.direccionIP=direccionIP;
        this.activo=false;

    }
    public void activar(){
        if (this.activo){
            this.activo=true;
            System.out.println("RED EL SERVIDOR" + this.nombre + "Se ha conectado");
        }else {
            System.out.println("RED DEL SERVIDOR" + this.nombre + "Ya estaba conectado");
        }
    }
    public void desactivar(){
        if (this.activo){
            this.activo=false;
            System.out.println("RED EL SERVIDOR" + this.nombre + "Se ha desconectado");
        }else {
            System.out.println("RED DEL SERVIDOR" + this.nombre + "Ya estaba desconectado");
        }
    }

    public  int getId(){
        return  id;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDireccionIP(String direccionIP){
        return direccionIP;
    }
    public void setDireccionIP(String direccionIP){
        this.direccionIP=direccionIP;
    }

    public boolean isActivo(){
        return activo;
    }
    public static int getTotalServidores(){
        return totalServidores;
    }
    public static int getServidoresActivos(){
        return servidoresActivos;
    }

}
