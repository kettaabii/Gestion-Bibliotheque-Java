import java.util.Scanner;

public class Books {
    String Title ;
    String Author ;
    //int Date_Sortie;
    String ISBN ;
    Students student;

    void modify(){
        Scanner input =new Scanner(System.in);
        System.out.println("rentrer les nouveaux detailles :");
        System.out.print("Nouveau Titre : ");
        this.Title = input.nextLine();
                System.out.print("Nouveau Auteur : ");
        this.Author =input.nextLine();
                System.out.print("Nouveau ISBN : ");
                this.ISBN= input.nextLine();




    }

    @Override
    public String toString() {
        return "Books{" +
                "Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", student=" + student +
                '}';
    }


}
