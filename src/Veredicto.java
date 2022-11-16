public class Veredicto {
    private static void veredicto(String valor1, String valor2) {
        if (Integer.valueOf(valor1) > Integer.valueOf(valor2)) {
            System.out.println("Te faltan horas de estudio para cada asignatura, espabila.");
        }
        else if (valor1.equals(valor2)) {
            System.out.println("Estudias una hora de media por cada asignatura, puede que sea insuficiente, sigue espabilando.");
        }
        else {
            System.out.println("Llevas las asignaturas al día, has espabilado.");
        }
    }
}