import entities.*;
import interfaces.Riproducibile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creiamo un array da 5 elementi che riempiremo successivamente.
        ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci 5 elementi multimediali!");

        /* ---------------------------------- CREIAMO GLI ELEMENTI ----------------------------------
         * In base a ciò che l'utente scriverà, sfruttando uno switch, andiamo a istanziare un
         * determinato tipo di elemento multimediale, salvandolo all'interno dell'array in base all'indice
         * del ciclo for */
        for (int i = 0; i < elementiMultimediali.length; i++) {
            System.out.println("Inserisci: AUDIO per inserire un audio");
            System.out.println("Inserisci: VIDEO per inserire un video");
            System.out.println("Inserisci: IMMAGINE per inserire un immagine");
            TipiMultimediali elemento = TipiMultimediali.valueOf(scanner.nextLine());

            // Sfruttiamo un enum "TipiMultimediali", per controllare quale tipo di elemento multimediale istanziare.
            switch (elemento) {
                case AUDIO:
                    System.out.println("Inserisci il titolo dell'audio...");
                    String audioTitle = scanner.nextLine();
                    System.out.println("Inserisci la durata dell'audio...");
                    int audioDurata = Integer.parseInt(scanner.nextLine());
                    elementiMultimediali[i] = new Audio(audioTitle, Math.abs(audioDurata));
                    break;

                case VIDEO:
                    System.out.println("Inserisci il titolo del video...");
                    String videoTitle = scanner.nextLine();
                    System.out.println("Inserisci la durata del video...");
                    int videoDurata = Integer.parseInt(scanner.nextLine());
                    elementiMultimediali[i] = new Video(videoTitle, videoDurata);
                    break;

                case IMMAGINE:
                    System.out.println("Inserisci il titolo dell'immagine...");
                    String immagineTitle = scanner.nextLine();
                    elementiMultimediali[i] = new Immagine(immagineTitle);
                    break;

                default:
                    elementiMultimediali[i] = new Immagine("Errore");
            }
        }
        // Creiamo una variabile di appoggio che sfrutteremo nel prossimo ciclo do-while
        int number;

        /* ------------------------------------- SELEZIONE DEGLI ELEMENTI --------------------------------------
          All'interno di questo ciclo do-while andiamo a interagire con un determinato elemento, selezionandolo
          grazie al numero inserito dall'utente (con numero - 1 andiamo a recuperare la sua posizione all'interno
          dell'array). Inserendo 0 come valore, invece, usciremo dal ciclo.
         */
        do {
            System.out.println("Inserisci un numero da 1 a 5 per interagire con il file multimediale.");
            System.out.println("oppure premi 0 per uscire da questa interfaccia.");
            number = scanner.nextInt();

            switch (number) {
                case 0:
                    System.out.println("Grazie per avere usato il nostro lettore multimediale!");
                    break;
                case 1, 2, 3, 4, 5:
                    if (elementiMultimediali[number - 1] instanceof Immagine)
                        ((Immagine) elementiMultimediali[number - 1]).show();
                    else ((Riproducibile) elementiMultimediali[number - 1]).riproduci();
                    break;
                default:
                    System.out.println("Errore!");
                    System.out.println("Inserisci un numero da 1 a 5 per interagire con il file multimediale.");
                    System.out.println("oppure premi 0 per uscire da questa interfaccia.");
            }

        } while (number != 0);

        scanner.close();
    }

}