package vectores;

public class Vectores {

    public static void main(String[] args) {
      
        //tener un vector que guarde 8 nombres
        String vector[] = new String [8];
       
        //asignación manual de los valores
        vector[0] = "Alejandra";
        vector[1] = "Ludmila" ;
        vector[2] = "Gabriel";
        vector[3] = "Rosa";
        vector[4] = "Luisina";
        vector[5] = "Daniel" ;
        vector[6] = "Loky";
        vector[7] = "Lumel"; 
        
        //recorrido
        for (int i=0; i<vector.length; i++) {
            System.out.println("En la posición: " + i + " Está el nombre: " + vector[i]);
        }
        
                
    }
    
}
