package ejercicioclinica;

import java.util.Scanner;

public class EjercicioClinica {

    public static void main(String[] args) {
        
        double peso,estatura;
        String nom,especialidad,genero,nuevoGenero;
        int op,valor;
        
        Scanner teclado = new Scanner(System.in);
        
        Paciente pac = null;
        Doctor doc = null;
        
        do {
            System.out.print("====================================================================== \n"+
            "|| Clínica Olor a Clavel                                            \n" +
            "|| -----------------------------------------------------------------\n"+
            "|| 1.	Crear Doctor                                          \n" +
            "|| -------------------------------------------------------------------\n"+
            "|| 2.	Mostrar todos los datos (tanto del doctor como de su paciente)	\n" +
            "|| -------------------------------------------------------------------\n"+
            "|| 3.	Estado del Paciente	\n" +
            "|| -------------------------------------------------------------------\n"+
            "|| 4.	Total a pagar\n" +
            "|| -------------------------------------------------------------------\n"+
            "|| 5.	Modificar el género del paciente\n" +
            "|| -------------------------------------------------------------------\n"+   
            "|| 6.	Salir \n"+
            "|| -------------------------------------------------------------------\n"+
            "|| Elija su opción: ");
            op = teclado.nextInt();
            
            switch (op){
// =========================================================================== // 
                case 1:
            // --------------- Creando Paciente --------------- //
                    System.out.print("--------------------------\n"+
                            "Ingrese datos del paciente: \n"+
                            "--------------------------\n");
                    System.out.print("Nombre: ");
                    teclado.nextLine();
                    nom = teclado.nextLine();
                    System.out.print("Genero (Femenino o Masculino): ");
                    genero = teclado.nextLine();
                    System.out.print("Peso en KG: ");
                    peso = teclado.nextDouble();
                    System.out.print("Estatura en centimetros: ");
                    estatura = teclado.nextDouble();
                    
                    pac = new Paciente (nom,peso,genero,estatura);
                    
                    
            // --------------- Creando Doctor --------------- //
                    System.out.print("--------------------------\n"+
                            "Ingrese datos del Doctor: \n"+
                            "--------------------------\n");
                    System.out.print("Nombre: ");
                    teclado.nextLine();
                    nom = teclado.nextLine();
                    System.out.print("Especialidad: ");
                    especialidad = teclado.nextLine();
                    System.out.print("Valor de la consulta: ");
                    valor = teclado.nextInt();
                    
                    doc = new Doctor(nom,especialidad,pac,valor);
                    
                    System.out.println("--------------------------\n"+
                            "Doctor creado satisfactoriamente!!!! :D\n "+
                            "--------------------------");
                    break;
// =========================================================================== // 
                case 2:
                    if (doc != null)
                    {
                        System.out.println("Datos del doctor: ");
                        System.out.println("Nombre: "+doc.getNombre());
                        System.out.println("Especialidad: "+doc.getEspecialidad());
                        System.out.println("Valor consulta: "+doc.getValorConsulta());
                        
            // --------------- Consultando paciente --------------- //
            
                        System.out.println("\nDatos del paciente: ");
                        System.out.println("Nombre: "+doc.getPaciente().getNombre());
                        System.out.println("Genero: "+doc.getPaciente().getGenero());
                        System.out.println("Peso: "+doc.getPaciente().getPesKg());
                        System.out.println("Estatura: "+doc.getPaciente().getEstaturaCm());
                    }else
                        System.out.println("Debe crear  al doctor");
                    break;
// =========================================================================== // 
                case 3:
                    if (doc != null)
                    {
                        System.out.println("El estado del paciente es: "+doc.getPaciente().estadoPaciente());
                    }else
                        System.out.println("Debe crear  al doctor");
                    break;
// =========================================================================== // 
                case 4:
                    if (doc != null)
                    {
                        System.out.println("El total a pagar es: "+doc.totalPagar());
                    }else
                        System.out.println("Debe crear  al doctor");
                    break;
// =========================================================================== // 
                case 5:
                    if (doc != null)
                    {
                        teclado.nextLine();
                        do{
                            System.out.print("Ingrese el nuevo genero: ");
                            nuevoGenero = teclado.nextLine();
                        }while (nuevoGenero.compareToIgnoreCase(doc.getPaciente().getGenero()) == 0);
                        doc.getPaciente().setGenero(nuevoGenero);
                        
                    }else
                        System.out.println("Debe crear  al doctor");
                    break;
// =========================================================================== // 
                case 6:
                    System.out.println("Estás saliendo del sistema...");
                    break;
            }
        }while (op != 6);
    }
    
}
