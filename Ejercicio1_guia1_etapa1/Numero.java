/*
1) En un nuevo proyecto crear una clase de nombre Numero, con un atributo de tipo entero, un
constructor que permita inicializar dicho atributo, los métodos getter y setter y los siguientes
métodos adicionales:
 esPar: este método retornará true si el valor guardado en el atributo es par, caso contrario
retornará false.
 esPositivo: este método retornará true si el valor guardado en el atributo es mayor o igual
a cero, caso contrario retornará false.
 esMultiploDe: este método recibirá un valor por parámetro y retornará true si el valor
guardado en el atributo es múltiplo del valor recibido, caso contrario retornará false.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:

a) Crear un objeto Numero con el valor 1459
Luego utilizando sus métodos:
b) Mostrar por consola si es par o no.
c) Mostrar por consola si es positivo o no.
d) Mostrar por consola si es múltiplo de 3.
*/

package ejercicio1_guia1_etapa2;


public class Numero {
    
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNro() {
        return numero;
    }
    public void setNro(int nro) {
        this.numero = nro;
    }
    
  
//     esPar: este método retornará true si el valor guardado en el atributo es par, caso contrario
//    retornará false.
    public boolean esPar(){
        return this.numero % 2==0;   
    }
    
//    esPositivo: este método retornará true si el valor guardado en el atributo es mayor o igual
//   a cero, caso contrario retornará false.   
    public boolean esPositivo(){
        return this.numero >=0;   
    }
    
//    esMultiploDe: este método recibirá un valor por parámetro y retornará true si el valor
//   guardado en el atributo es múltiplo del valor recibido, caso contrario retornará false.    
    public boolean esMultiploDe (){
        return this.numero % 3 == 0;
        
    }
}
