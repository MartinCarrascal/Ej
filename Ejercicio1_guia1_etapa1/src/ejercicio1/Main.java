
package ejercicio1;


public class Main {

  
    public static void main(String[] args) {
 
        Producto celular = new Producto(000001, "Samsung A23", 65000, 15);
        
        /*celular.mostrarProducto();
        celular.setDescripcion("IPhone 11");*/
        
        
        
        System.out.println("El codigo del producto es: "+ celular.getCodigo());
        System.out.println("Su descripción : "+ celular.getDescripcion());
        System.out.println("Su precio: $"+ celular.getPrecio());
        System.out.println("Su stock: "+ celular.getStock());
        
    }
    
}
