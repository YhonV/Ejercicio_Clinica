package ejercicioclinica;

public class Doctor {
    private String nombre;
    private String especialidad;
    private Paciente paciente;
    private int valorConsulta;
    
    
// ======================= CONSTRUCTOR ======================= //

    public Doctor() {
    }
        
    public Doctor(String nombre, String especialidad, Paciente paciente, int valorConsulta) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.paciente = paciente;
        this.valorConsulta = valorConsulta;
    }

// ======================= ACCESADOR ======================= //
    
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public int getValorConsulta() {
        return valorConsulta;
    }
// ======================= MMUTADOR ======================= //

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setValorConsulta(int valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

// ======================= Calculando el IMC ======================= // 
    public double imc(){
        double x = (paciente.getPesKg()/Math.pow(paciente.getEstaturaCm()/100,2)); // Divides estatura en cm por 100 para sacar estatura en metros
        return x;                                                                   // y utilizas el metodo Pow que te eleva al numero dado
    }
        
    // ======================= Calculando la rebaja ======================= // 
        
    public int rebaja(){
        String x = paciente.estadoPaciente();
        if (x.compareToIgnoreCase("Obeso")==0  || x.compareToIgnoreCase("Sobrepeso") == 0){
            return (int) (valorConsulta * 0.3);
        }
        return 0;
    }
    
    // ======================= Calculando total a pagar ======================= // 
    public int totalPagar(){
        return valorConsulta - rebaja();
    }

}
