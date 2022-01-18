import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class U03EP01 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int i;
 double media;
 double mediana;
 int medianaInt;
 double desviacion;
 int mesMaximo;
 double mmMaximo;
 double mm;
 i=0;
 media=0;
 mediana=0;
 desviacion=0;
 mesMaximo=0;
 mmMaximo=1;
 medianaInt=0;
 mm=0;
 Double[]precipitacionesMenorAMayor;
 String[] meses ={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
 Double[] precipitaciones;
precipitaciones = new Double[12];
while(i<meses.length){
    try {
         System.out.print(meses[i]+" : ");
        mm = sc.nextDouble();

        precipitaciones[i] = mm;
        i++;

        } catch(InputMismatchException e) {

        System.out.print("  Error:Debe de introducir un  valor double\n");
        sc.next();
}
}


for(i=0;i<precipitaciones.length;i++){
media+=precipitaciones[i];

}
media=media/12;

for(i=0;i<precipitaciones.length;i++){
if(precipitaciones[i] > mmMaximo) {
    mmMaximo = precipitaciones[i];
    mesMaximo = i;
}
}




for(i=0;i<precipitaciones.length;i++){
desviacion += Math.pow((precipitaciones[i] - media), 2) / 12;
}

desviacion = Math.sqrt(desviacion);

precipitacionesMenorAMayor= Arrays.copyOf(precipitaciones,precipitaciones.length);
Arrays.sort(precipitacionesMenorAMayor);
mediana= (precipitacionesMenorAMayor[5] + precipitacionesMenorAMayor[6])/2;

System.out.printf("El mes mas lluviosos  "+meses[mesMaximo]);
System.out.printf(" con %5.3f mm",mmMaximo);
System.out.printf("\nMedia: %5.3f mm",media);
System.out.printf("\nMediana: %5.3f mm",mediana);
System.out.printf("\nDesviacion :%5.3f mm",desviacion);
sc.close();



}
} // fin de la clase U03EP01
