public class VariablesEjemplos {
    public static void main(String[] args) {
        // Tipo de dato referencial ya que referencia al objeto String
        String saludar = "Hola mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        // Tipo de dato primitivo
        int numero = 10;

        System.out.println("numero = " + numero);
        
        boolean valor = true;
        int numero2 = 5;

        // Condicional donde evalua
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 3;
        }
        System.out.println("numero2 = " + numero2);
        
    }
}
