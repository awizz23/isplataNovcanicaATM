package isplatanovcanicaatm;

import java.util.Scanner;

public class IsplataNovcanicaATM {

    public static void main(String[] args) {
        /* Program koij simulira rad bankomata tako da traženu sumu isplaćuje 
           sa najmanjim mogućim brojem novčanica u apoenima 
           od 1, 5, 10, 50 i 100 KM. 
         */
        Scanner tastatura = new Scanner(System.in);

        int trazSuma;
        int origSuma;
        long stotine;
        int pedesetke, dvadesetke, desetke, petice, dvice, jedinice;

        // Informacije za korisnika o unosu željene isplate.
        System.out.println("Unesite vrijednost u KM, a program će odrediti apoene za isplatu.");
        System.out.println("Unesite vrijednost koju želite da vam bude isplaćena: ");

        trazSuma = tastatura.nextInt();

        System.out.println("Unijeli ste iznos od: " + trazSuma + " KM.");

        origSuma = trazSuma;
        stotine = trazSuma / 100;
        origSuma = trazSuma % 100;

        System.out.println("Biće vam isplećeno " + stotine + " novčanica od 100 KM.");

        //System.out.println(origSuma);
        pedesetke = origSuma / 50;
        origSuma = origSuma % 50;

        System.out.println("Biće vam isplećeno " + pedesetke + " novčanica od 50 KM.");

        //System.out.println(origSuma);
        dvadesetke = origSuma / 20;
        origSuma = origSuma % 20;

        System.out.println("Biće vam isplećeno " + dvadesetke + " novčanica od 20 KM.");

        //System.out.println(origSuma);
        desetke = origSuma / 10;
        origSuma = origSuma % 10;

        System.out.println("Biće vam isplećeno " + desetke + " novčanica od 10 KM.");

        //System.out.println(origSuma);
        petice = origSuma / 5;
        origSuma = origSuma % 5;

        System.out.println("Biće vam isplećeno " + petice + " novčanica od 5 KM.");

        //System.out.println(origSuma);
        dvice = origSuma / 2;
        origSuma = origSuma % 2;

        System.out.println("Biće vam isplećeno " + dvice + " novčanica od 2 KM.");

        //System.out.println(origSuma);
        jedinice = origSuma / 1;
        origSuma = origSuma % 1;

        System.out.println("Biće vam isplećeno " + jedinice + " novčanica od 1 KM.");

        //System.out.println(origSuma);
    }

}
