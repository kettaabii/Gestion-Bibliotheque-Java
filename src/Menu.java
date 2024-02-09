
import java.util.Scanner;
import java.util.*;
 class Menu {
     library library=new library();

         void AfficherMenu(){
            int cas=0;
            do {
                System.out.println("======== Bienvenue ========");
                System.out.println("||                        ||");
                System.out.println("||=== veuillez choisir ===||");
                System.out.println("||1- Espace Etudiants     ||");
                System.out.println("||2- Espaces Livres       ||");
                System.out.println("||3- Quitter              ||");


               // Menu Choix = new Menu();
                Scanner input = new Scanner(System.in);

                if (input.hasNextInt()) {
                    int choix = input.nextInt();
                    switch (choix) {
                        case 1:

                            ChoixMenuStudents();
                            break;
                        case 2:

                            MenuBooks();
                            break;
                        default:
                            System.out.println("rien de rien");
                    }
                }
                else{
                        System.out.println("ghalat");
                        AfficherMenu();
                    }

            }while (cas != 0);}

          void ChoixMenuStudents() {
            library lb =new library();
            int cas=0;
            do{
                System.out.println("================ Etudiants =================");
                System.out.println("||                                        ||");
                System.out.println("||=== veuillez choisir ===                ||");
                System.out.println("||1- Ajouter un etudiant                  ||");
                System.out.println("||2- Afficher la liste des etudiants      ||");
                System.out.println("||3- Quitter                              ||");

                Scanner input = new Scanner(System.in);
                int choix = input.nextInt();
                switch (choix) {
                    case 1:
                        lb.AddStudent();
                        break;
                    case 2:
                        lb.AfficherListeEtudiants();
                        break;
                    case 3:
                        AfficherMenu();
                    default:
                        System.out.println("rien de rien");
                }
            }while(cas != 3);
        }

         void MenuBooks(){
            int choix;
            do{
        System.out.println("================ Etudiants =================");
        System.out.println("||                                        ||");
        System.out.println("||=== veuillez choisir ===                ||");
        System.out.println("||1- Ajouter un Livre                 ||");
        System.out.println("||2- Afficher la liste des Livres     ||");
        System.out.println("||3- Supprimer un livre             ||");
        System.out.println("||4-Modifier un livre                ||");




            Scanner input = new Scanner(System.in);
            choix=input.nextInt();
            switch (choix) {
                case 1:
                    library.AddBook();
                    break;
                case 2:
                    library.AfficherListeLivres();
                    break;
                case 3:
                    library.SupprimerLivre();
                    break;
                case 4:
                    library.modifierLivre();
                    break;
                default:
                    System.out.println("erreur!");
                    break;
            }}
            while(choix!=5);
        }}



