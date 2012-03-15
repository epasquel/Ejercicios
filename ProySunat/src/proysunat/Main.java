
package proysunat;


public class Main {


    public static void main(String[] args) {

        declaracion objdec = new declaracion();
        objdec.setCodigo("DJ001");
        objdec.setNombre("Ebert");
        objdec.setApellido("Pasquel Paucar");

        Mes objMes = new Mes();
        objMes.setEnero(2500);
        objMes.setFebrero(2500);
        objMes.setMarzo(2500);
        objMes.setAbril(2500);
        objMes.setMayo(2500);
        objMes.setJunio(6000);
        objMes.setJulio(4500);
        objMes.setAgosto(3500);
        objMes.setSetiembre(4800);
        objMes.setOctubre(7500);
        objMes.setNoviembre(5500);
        objMes.setDiciembre(8500);
        objdec.setLisMes(objMes);

        System.out.println("La declaracion jurada es " + objdec.getCodigo());
        System.out.println("La persona es " + objdec.getNombre() + " " + objdec.getApellido());
        
        
        for (int i = 1; i<= 12; i++){
            if(i == 1){System.out.println("El impuesto para Enero es: " + objMes.pagoImpMes(objMes.getEnero())); }
            if(i == 2){System.out.println("El impuesto para Febrero es: " + objMes.pagoImpMes(objMes.getFebrero())); }
            if(i == 3){System.out.println("El impuesto para Marzo es: " + objMes.pagoImpMes(objMes.getMarzo())); }
            if(i == 4){System.out.println("El impuesto para Abril es: " + objMes.pagoImpMes(objMes.getAbril())); }
            if(i == 5){System.out.println("El impuesto para Mayo es: " + objMes.pagoImpMes(objMes.getMayo())); }
            if(i == 6){System.out.println("El impuesto para Junio es: " + objMes.pagoImpMes(objMes.getJunio())); }
            if(i == 7){System.out.println("El impuesto para Julio es: " + objMes.pagoImpMes(objMes.getJulio())); }
            if(i == 8){System.out.println("El impuesto para Agosto es: " + objMes.pagoImpMes(objMes.getAgosto())); }
            if(i == 9){System.out.println("El impuesto para Setiembre es: " + objMes.pagoImpMes(objMes.getSetiembre())); }
            if(i == 10){System.out.println("El impuesto para Octubre es: " + objMes.pagoImpMes(objMes.getOctubre())); }
            if(i == 11){System.out.println("El impuesto para Noviembre es: " + objMes.pagoImpMes(objMes.getNoviembre())); }
            if(i == 12){System.out.println("El impuesto para Diciembre es: " + objMes.pagoImpMes(objMes.getDiciembre())); }
        }


         System.out.println("El impuesto anual es : " + objdec.pagoImpAnual());

    }

}
