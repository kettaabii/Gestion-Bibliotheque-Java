import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public  class library {
    static List<Books> Listelivres = new ArrayList<Books>();
    static List<Students> ListEtudiants = new ArrayList<Students>();
     void AddBook (){
         Books book =new Books();
        Scanner input =new Scanner(System.in);
        System.out.println("entrer le titre ");
        book.Title =input.nextLine();
        System.out.println("entrer l'auteur' ");
        book.Author =input.nextLine();
        //System.out.println("entrer la Date de sotrie ");
        //book.Date_Sortie =input.nextInt();
        Listelivres.add(book);


    }
    static void AddStudent () {
        Scanner input = new Scanner(System.in);
        Students Etudiant = new Students();
        System.out.println("entrer le nom de l'etudiant ");
        Etudiant.Name = input.nextLine();
        System.out.println("entrer le nom de l'etudiant ");
        Etudiant.Family_Name = input.nextLine();
        System.out.println("entrer le Code Apogee ");
        ListEtudiants.add(Etudiant);
        Etudiant.ID = input.nextLine();
    }
    static void AfficherListeLivres() {
        for (int i = 0; i < Listelivres.size(); i++) {
            System.out.println(Listelivres.get(i).Title);
            System.out.println(Listelivres.get(i).Author);
           // System.out.println(Listelivres.get(i).Date_Sortie);
        }

    }
     void AfficherListeEtudiants(){
        for (int i = 0; i < ListEtudiants.size(); i++) {
            System.out.println(ListEtudiants.get(i).Name);
            System.out.println(ListEtudiants.get(i).Family_Name);
            System.out.println(ListEtudiants.get(i).ID);
        }
//            for(Students look :ListEtudiants){
//                System.out.println(look.Name);
//                System.out.println(look.Family_Name);
//                System.out.println(look.ID);

    }

         void SupprimerLivre(){

        System.out.println("veuillez rentrer lelivre a supprimer ");
        Scanner input=new Scanner(System.in);
        String Rech =input.nextLine();

        //Books book = Listelivres.stream().filter(books -> books.Title.contains(Rech)).toList().getFirst();

//        if (book!=null) {
//
//            Listelivres.remove(book);
//        }

//        else {
//            System.out.println("not ok");
//        }
             boolean isRemoved = Listelivres.removeIf(books -> books.Title.equalsIgnoreCase(Rech));
             if (isRemoved)
                 System.out.println("supprimé avec succes");
             else {
                 System.out.println("le livre n'existe pas ");
             }
        }
//static void SupprimerLivre() {
//    System.out.println("Veuillez rentrer le livre à supprimer : ");
//    Scanner input = new Scanner(System.in);
//    String Rech = input.nextLine();
//
//    // Recherche de toutes les occurrences du livre dans la liste et suppression
//    boolean removed = false;
//    for (int i = 0; i < Listelivres.size(); i++) {
//        if (Listelivres.get(i).equals(Rech)) {
//            Listelivres.remove(i);
//            removed = true;
//            i--; // Après suppression, revenir en arrière car les indices ont été décalés
//        }
//    }
//
//    if (removed) {
//        System.out.println("Le livre a été supprimé avec succès.");
//    } else {
//        System.out.println("Le livre n'a pas été trouvé dans la liste.");
//    }
//}
    void modifierLivre(){
        System.out.println("entrer le titre a modifer " );
        Scanner input =new Scanner(System.in);
        String Rech =input.nextLine();
        Books book = Listelivres.stream().filter(books -> books.Title.contains(Rech)).collect(Collectors.toList()).get(0);
        if(book!=null){
            book.modify();
        }
        else{
            System.out.println("aucun livre trouvé ");}


    }


}



















