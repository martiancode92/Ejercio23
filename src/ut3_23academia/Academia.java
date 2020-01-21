package ut3_23academia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Academia {

    TipoCurso guitarra;
    TipoCurso piano;

    public Academia() {

        guitarra = new TipoCurso("Guitarra", 100,500f);
        piano = new TipoCurso("Piano", 20,1000f);

    }

    public void registro() throws IOException {

        String curso;
        String nombre = "";

        System.out.println("Bienvenidos a la Academia Beethoven");
        nombre = pedirNombre();
        while (!nombre.equalsIgnoreCase("Fin") ) {
            curso = pedirCurso();
            //controlar que tienes plazas en ese curso
            actualizar(curso);
            if (guitarra.plazasDisponibles() > 0 || piano.plazasDisponibles() > 0) {
                nombre = pedirNombre();
            }
        }

    }

    public String pedirCurso() throws IOException {

        String curso;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        curso = teclado.readLine();

        while (!(curso.equalsIgnoreCase(guitarra.getDenominacion())
                || curso.equalsIgnoreCase(piano.getDenominacion()))) {

            System.out.println("\n");
            System.out.println("Por favor elija una de estas dos opciones \n -Guitarra\n "
                    + "\n -Piano ");

            curso = teclado.readLine();

        }

        return curso;
    }

    public String pedirNombre() throws IOException {

        String nombre = "";
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        if (!nombre.equalsIgnoreCase("Fin")) {

            System.out.println("Por favor ingrese su nombre");
            nombre = teclado.readLine();

        }

        return nombre;
    }

    public void actualizar(String curso) {

        if (curso.equalsIgnoreCase(guitarra.getDenominacion())) {

   
            guitarra.actualizarPlazas();

        } else {

           
                piano.actualizarPlazas();

            }

        }



    public void informe() {

        System.out.println("\t \t \t \t INFORME DE CURSOS");

        System.out.println("\t \t NºdeMatriculados\t Recaudacion \t Porcentaje de Ocupacion");
        System.out.println("\t" + "Curso de Guitarra\t" + guitarra.getContador() + "\t" + "\t" + (guitarra.getContador() * 500) + guitarra.getContador() * 100 / 100);
        System.out.println("\t" + "Curso de piano   \t" + piano.getContador() + "\t" + "\t" + piano.getContador() * 1000 + piano.getContador() * 20 / 100);

    }

}
