import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    String Name;
    String Family_Name;
    String ID ;
    List<Books>reservations=new ArrayList<>();
    void modifyStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("rentrer les nouveaux detailles :");
        System.out.print("Nouveau Nom : ");
        this.Name = input.nextLine();
        System.out.print("Nouvelle adresse : ");
        this.Family_Name = input.nextLine();
        System.out.print("Nouveau ID: ");
        this.ID = input.nextLine();
    }

    void afficherListeReservations(){

        reservations.forEach(System.out::println);
    }

    void supprimerReservation(){
        System.out.println("entrer le nom de l'etudiant");
        Scanner input = new Scanner(System.in);
        String Rechstd =input.next();
        reservations.removeIf(students ->students.student.Name.equalsIgnoreCase(Rechstd));
        String RechBk =input.next();
        reservations.removeIf(bks ->bks.Title.equalsIgnoreCase(RechBk));
    }

    @Override
    public String toString() {
        return "Students{" +
                "Name='" + Name + '\'' +
                ", Family_Name='" + Family_Name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
