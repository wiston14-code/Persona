public class persona {
    public class variable {
        public  static  void  main (String[]args ) {
            variable persona =  new variable();
            // Asignar un valor a la variable sexo
            persona. =  ' H ' ;
            // ASignar la edad de la persona
            persona.edad =  18 ;
            // Asignar el peso de la persona
            persona.peso =  50 ;
            persona.cedula =  " 123-121212-1212A " ;

            persona.SetNombre ( " Juan " );
            System.out.println(persona.getNombre ());

            persona.setsexo("h") ;
            Sistem.out.println (persona . getsexo());

            persona.setedad("18");
            Sistem.out.println (persona . getedad());

            persona.setpeso("50");
            Sistem.out.println (persona . getpeso());

            persona.setcedula("123-121212-1212A2A");
            Sistem.out.println (persona.getcedula());
        }
    }
    //Atributos
    private String nombre;
    private int edad;
    private char sexo;
    private String cedula;
    private double altura;
    private double peso;


    //Constructor por defecto
    public persona() {
        this("mario", 17, 'H', "481-2002-05432-U1", 2.7, 60.55);

    }

    // Constructor
    public persona(String nombre, int edad, char sexo, String cedula, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = cedula;
        this.altura = altura;
        this.peso = peso;
    }

    //Constructor
    public persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, "0", 0, 0);
    }

    /
    // calcular indice de masa coorporal IMC.
    public int calcularIMC() {
        int bajoPeso= -1;
        int pesoIdeal= 0;
        int sobrePeso= 1;
        double altura2 = altura * altura;
        double imc = peso / altura2;
        if (imc >= 20 && imc <= 25) {
            return pesoIdeal;
        } else if (imc < 20) {
            return bajoPeso;
        } else {
            return sobrePeso;
        }


    }


}
