//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Registro de servidores");
        Servidor s1=new Servidor("ServerWeb", "10.20.39");
        Servidor s2=new Servidor("ServerCloud", " 10.20.12");
        Servidor s3=new Servidor("BaseDeDatos", "10.54.30");
        System.out.println("\nGestion de datos");
        s1.activar();
        s2.activar();

        s2.activar();

        s1.activar();
        System.out.println("\n--- REPORTE DEL CENTRO DE DATOS ---");
        System.out.println("Total histórico de servidores registrados: " + Servidor.getTotalServidores());
        System.out.println("Servidores actualmente en línea: " + Servidor.getServidoresActivos());
    }
}