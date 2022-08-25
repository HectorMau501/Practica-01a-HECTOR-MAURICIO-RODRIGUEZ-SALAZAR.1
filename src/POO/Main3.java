
package POO;

import java.util.Scanner;

public class Main3 {
    
    public static void main(String [] args)
    {
         int opcion = 4;
        
        Scanner acceso1 = new Scanner(System.in);
        Jugador jugador1 = new Jugador();
        Personaje personaje1 = new Personaje();
        
        
        System.out.println("\t\t\t---Bienvenido al programa de Eventos---");
       
        do{
             System.out.println("\n\n\t\t---Menu de opciones--?");
             System.out.println("\n\n\t\tCual es la opcion que desea realizar?");
             System.out.println("\n\t1. La opcion de registrar");
             System.out.println("\n\t2. La opcion de editar");
             System.out.println("\n\t3. La opcion de imprimir");
             System.out.println("\n\t4. salir de la aplicacion");
             opcion = acceso1.nextInt();
             
             switch(opcion)
             {
                 case 1:
                     System.out.println("\n\n\tUsted eligio la opcion de registrar");
                     System.out.println("\n\n\tRegistre los datos:");
                     System.out.println("\n\tNombre:");
                     String nombre = acceso1.nextLine();
                     jugador1.setNombre(nombre);
                        acceso1.nextLine();
                     System.out.println("\n\tCodigo: ");  
                     int codigo = acceso1.nextInt();
                     jugador1.setCodigo(codigo);
                        acceso1.nextLine();
                     System.out.println("\n\tTiempo jugando: "); 
                     float tiempoJugando = acceso1.nextFloat();
                     jugador1.setTiempoJugando(tiempoJugando);
                        acceso1.nextLine();
                     System.out.println("\n\tModalidad: ");
                     String modalidad = acceso1.nextLine();
                     jugador1.setModalidad(modalidad);
                        acceso1.nextLine();
                     System.out.println("\n\tGenero: ");
                     String genero = acceso1.nextLine();
                     personaje1.setGenero(genero);
                        acceso1.nextLine();
                     System.out.println("\n\tAltura:  ");
                     float altura = acceso1.nextFloat();
                     personaje1.setAltura(altura);
                        acceso1.nextLine();
                     System.out.println("\n\tHabilidad: ");
                     String habilidad = acceso1.nextLine();
                     personaje1.setHabilidad(habilidad);
                        acceso1.nextLine();
                     System.out.println("\n\tNivel de Experiencia: ");
                     int nivelExperiencia = acceso1.nextInt();
                     personaje1.setNivelExperiencia(nivelExperiencia);
                        acceso1.nextLine();
                         break;
                     
                 case 2:
                     
                     int op;
                     
                     System.out.println("\n\n\tUsted eligio la opcion de editar");
                     
                     Scanner acceso3 = new Scanner(System.in);
                     Scanner acceso4 = new Scanner(System.in);
                     
                     do{
                         System.out.println("\n\n\t---Menu para editar los eventos---");
                         System.out.println("\n\n\t\tCual es la opcion que desea realizar?");
                         System.out.println("\n\t1. Editar nombre");
                         System.out.println("\n\t2. Editar Codigo");
                         System.out.println("\n\t3. Editar Tiempo Jugando");
                         System.out.println("\n\t4. Editar modalidad");
                         System.out.println("\n\t5. Genero");
                         System.out.println("\n\t6. Altura");
                         System.out.println("\n\t7. Habilidad");
                         System.out.println("\n\t8. Nivel de experiencia");
                         System.out.println("\n\t9. salir");
                         op = acceso3.nextInt();
                         
                         switch(op)
                         {
                             case 1:
                                 System.out.println("\n\tIntroduzca el nombre nuevo ");
                                 nombre = acceso4.nextLine();
                                 jugador1.setNombre(nombre);
                                 break;
                                 
                             case 2:
                                 System.out.println("\n\tIntroduzca elcodigo nueva ");
                                 codigo = acceso4.nextInt();
                                 jugador1.setCodigo(codigo);
                                 break;
                                 
                             case 3:
                                 System.out.println("\n\tIntroduca el nuevo tiempo jugando");
                                 tiempoJugando = acceso4.nextFloat();
                                 jugador1.setTiempoJugando(tiempoJugando);
                                 break;
                                 
                             case 4:
                                 System.out.println("\n\tIntroduzca la nueva modalidad");
                                 modalidad = acceso4.nextLine();
                                 jugador1.setModalidad(modalidad);
                                 break;
                             
                             case 5:
                                 System.out.println("\n\tIntroduzca el nuevo genero");
                                 genero = acceso4.nextLine();
                                 personaje1.setGenero(genero);
                                 break;
                                 
                             case 6:
                                 System.out.println("\n\tIntroduzca la nueva altura");
                                 altura = acceso4.nextFloat();
                                 personaje1.setAltura(altura);
                                 break;
                                 
                             case 7:
                                 System.out.println("\n\tIntroduzca la nueva habilidad");
                                 habilidad = acceso4.nextLine();
                                 personaje1.setHabilidad(habilidad);
                                 break;
                                 
                             case 8:
                                 System.out.println("\n\tIntroduzca el nuevo nivel de experiencia");
                                 nivelExperiencia = acceso4.nextInt();
                                 personaje1.setNivelExperiencia(nivelExperiencia);
                                 break;
                            
                             case 9:
                                 break;
                                 
                             default:System.out.println("Usted puso una opcion que no esta el menu, por favor vuelva a intentarlo");    
                                    
                         }
                         
                     }while(op != 9);
                             

                     break;
                 case 3:
                     System.out.println("\n\n\tUsted eligio la opcion de imprimir");
                     System.out.println("\n\tEl nombre es: "+jugador1.getNombre());
                     System.out.println("\n\tel codigo es: "+jugador1.getCodigo());
                     System.out.println("\n\tEl tiempo jugando: "+jugador1.getTiempoJugando());
                     System.out.println("\n\tLa modalidad es: "+jugador1.getModalidad());
                     System.out.println("\n\tel genero es: "+personaje1.getGenero());
                     System.out.println("\n\tLa altura es: "+personaje1.getAltura());
                     System.out.println("\n\tLa habilidad es: "+personaje1.getHabilidad());
                     System.out.println("\n\tEl nivel de experiencia: "+personaje1.getNivelExperiencia());
                     
                     break;
                 case 4:
                     System.out.println("\n\n\t\t---Gracias por tu visita:)");
                     break;
                    
                 default: System.out.println("Usted puso una opcion que no esta el menu, por favor vuelva a intentarlo");
                             
             }
            
        }while(opcion != 4);
        
    }
    
    
}
