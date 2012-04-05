
package mascotasninhos;


public class MascotasNinhos {


    public static void main(String[] args) {
       
        Ninho ninho1 = new Ninho("Carlos");
        Ninho ninho2 = new Ninho("Felipe");
        Ninho ninho3 = new Ninho("Sandra");
        Ninho ninho4 = new Ninho("Carla");
        Mascota mascota1 = new Conejo("Rabito");
        Mascota mascota2 = new Canario("Fifi");
        Colegio colegio = new Colegio("San Agustín");
        
        ninho1.setColegio(colegio);
        ninho2.setColegio(colegio);
        ninho3.setColegio(colegio);
        ninho4.setColegio(colegio);
        
        ninho1.setHermano(ninho2);
        ninho1.setHermano(ninho1);
        ninho1.setMascota(mascota1);        
        ninho2.setMascota(mascota1);
        ninho3.setMascota(mascota2);
        
        System.out.println(ninho1.getNombre() + " tiene a " + ninho1.getHermano().getNombre() + " que es su hermano");
        System.out.println(ninho1.getNombre() + " va al colegio " + ninho1.getColegio().getNombre());
        
    }
}
