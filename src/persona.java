public class persona {
    //Atributos
    private String nombre;
    private int edad;
    private char sexo;
    private String cedula;
    private double altura;
    private double peso;
    private int anioNacimiento;
    // por defecto
    private char sexodef= 'H';

    //Constructor por defecto
    public persona() {
        this("Roger", 26, 'H', "0405-2000-01432-j1", 1.80, 90.72,2000);
    }
    // Constructor con todos los 6 atributos como Parámetros
    public persona(String nombre, int edad, char sexodef, String cedula, double altura, double peso,int anioNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = cedula;
        this.altura = altura;
        this.peso = peso;
    }
    //Constructor de 3 parametros
    public persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, "0", 0, 0,0);
    }
    //      Metodos
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
    // Mayor de edad; en Honduras 18 años.
    private boolean esMayorDeEdad(){
        boolean mayor= true;
        if (edad>=18){
            return mayor;
        }
        else {
            return !mayor;
        }
    }// saver su sexo
    private void comprobarSexo(char sexo){
        if (sexo != 'm' && sexo != 'M') {
            this.sexo = sexodef;
        }
    }
    public String generaCedula() {
        final int divisor = 23;

        //codigo de generacion ramdon de los 13 dijitos

       // /* */

        int numCedula1 = ((int) Math.floor(Math.random() * (1000 - 80) + 80));

        int numCedula2 = ((int) Math.floor(Math.random() * (1000 - 80) +80 ));

        int cedulaFinal = numCedula2 - (numCedula2 / divisor * divisor);

        //Calculamos la letra del DNI
        char letraCedula = generaLetraCedula(cedulaFinal);

        //Pasamos la cedula a String por lotes
        String textCedula1 = Integer.toString(numCedula1);
        String textCedula2 = Integer.toString(numCedula2);
        String nacimiento= Integer.toString(anioNacimiento);

        String cedula =textCedula1+"-"+nacimiento +"-"+"0"+textCedula2 + letraCedula;
        return cedula;
    }private char generaLetraCedula(int cedula) {
        char letras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'J', 'K', 'L', 'M', 'N','o', 'P', 'Q',
                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y'};
        return letras[cedula];
    }// usar setter en todo parametro
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setSexo(char sexo){
        this.sexo= sexo;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }// enseñar los datos de la persona
    public String toString() {
        String sexo1;
        if ( sexo == 'H') {
            sexo1 = "hombre";
        } else if (sexo  =='m'){
            sexo1 = "hombre";
        } else {
            sexo1 = "Hombre";
        }// aqui toda la información de la persona se retorna
        return "Informacion de la persona:\n" + "Nombre: " + nombre + "\n" + "Sexo: " + sexo1 + "\n" + "Edad: " + edad + " años\n" + "Cedula: " + generaCedula() + "\n" + "Peso: " + peso + " kg\n" + "Altura: " + altura + " metros\n";

    }
}
