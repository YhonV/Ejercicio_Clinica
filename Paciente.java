package ejercicioclinica;

public class Paciente {
    private String nombre;
    private double pesoKg;
    private String genero;
    private double estaturaCm;

    
// ======================= CONSTRUCTOR ======================= //
    public Paciente(String nombre, double pesKg, String genero, double estaturaCm) {
        this.nombre = nombre;
        this.pesoKg = pesKg;
        this.genero = genero;
        this.estaturaCm = estaturaCm;
    }
    
        public Paciente() {
    }
// ======================= ACCESADOR ======================= // 
    
    public String getNombre() {
        return nombre;
    }

    public double getPesKg() {
        return pesoKg;
    }

    public String getGenero() {
        return genero;
    }

    public double getEstaturaCm() {
        return estaturaCm;
    }
// ======================= MUTADOR ======================= // 
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPesKg(double pesKg) {
        this.pesoKg = pesKg;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstaturaCm(double estaturaCm) {
        this.estaturaCm = estaturaCm;
    }
    
    
// ======================= Calculando el IMC ======================= // 
    public double imc(){
        double x = (pesoKg/Math.pow(estaturaCm/100,2)); // Divides estatura en cm por 100 para sacar estatura en metros
        return x;                                         // y utilizas el metodo Pow que te eleva al numero dado
    }
    
// ======================= Calculando el estado del paciente ======================= // 
    
    public String estadoPaciente(){
        if (imc() >= 18.5 & imc() <= 25){
            return "Normal";
        }else if (imc() >= 25 & imc() <= 30){
            return "Sobrepeso";
        }else if (imc() >= 30){
            return "Obeso";
        }else
            return "Delgadez";
    }
    
}