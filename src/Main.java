import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> ArrayEmploye = new ArrayList<>();

    public static void main(String[] args) {
        Employee.menu();
        int choix = sc.nextInt();
        do {

            switch (choix) {
                case 1:
                    ajouterEmployee();
                    Employee.menu();
                    choix = sc.nextInt();
                    break;
                case 2:
                    modifierEmployee();
                    Employee.menu();
                    choix = sc.nextInt();
                    break;
                case 3:
                    suprimerEmployee();
                    Employee.menu();
                    choix = sc.nextInt();
                    break;
                case 4:
                    afficherEmployee();
                    Employee.menu();
                    choix = sc.nextInt();
                    break;
                case 5:
                    afficherAll();
                    Employee.menu();
                    choix = sc.nextInt();
                    break;
                case 6:
                    afficherNbrEmploye();
                    Employee.menu();
                    choix = sc.nextInt();
                    break;
                case 7:
                    afficherPlusage();
                    Employee.menu();
                    choix = sc.nextInt();
                    break;
                case 8:
                    afficherMoinage();
                    Employee.menu();
                    choix = sc.nextInt();
                    break;

            }
        }while(!(choix<1 || choix>8));
    }
   

    //ajouter un employe
    static void ajouterEmployee() {

        System.out.print("Veuillez entrer le matricule :");
        int Matricule = sc.nextInt();
        System.out.print("Veuillez entrer le nom :");
        String Nom = sc.next();
        System.out.print("Veuillez entrer le prenom :");
        String Prenom = sc.next();
        System.out.print("Veuillez entrer l'age :");
        int Age = sc.nextInt();
        System.out.print("Veuillez entrer le salaire :");
        double Salaire = sc.nextDouble();
        Employee e = new Employee(Matricule, Nom, Prenom, Age, Salaire);
        ArrayEmploye.add(e);
    }

    //modifier employee
    static void modifierEmployee() {
        if (ArrayEmploye.isEmpty()) {
            System.out.println("Oups ! Il n'ya aucun employé");
        } else {
            System.out.println("Veuillez entrer le numéro d'employé que vous voullez modifier :");
            int matricule = sc.nextInt();
            for (int i = 0; i < ArrayEmploye.size(); i++) {
                if (matricule == ArrayEmploye.get(i).getMatricule()) {
                    System.out.print("Veuillez entrer le matricule :");
                    int Matricule = sc.nextInt();
                    System.out.print("Veuillez entrer le nom :");
                    String Nom = sc.next();
                    System.out.print("Veuillez entrer le prenom :");
                    String Prenom = sc.next();
                    System.out.print("Veuillez entrer l'age :");
                    int Age = sc.nextInt();
                    System.out.print("Veuillez entrer le salaire :");
                    double Salaire = sc.nextDouble();
                    Employee e = new Employee(Matricule, Nom, Prenom, Age, Salaire);
                    ArrayEmploye.set(i, e);
                } else {
                    System.out.println("ce employé est introuvable !!");
                }

            }
        }
    }

    //supprimer employee
    static void suprimerEmployee() {
        if (ArrayEmploye.isEmpty()) {
            System.out.println("Oups ! Il n'ya aucun employé");
        } else {
            System.out.println("Veuillez entrer le numéro d'employé que vous voullez suprimer :");
            int matricule = sc.nextInt();
            for (int i = 0; i < ArrayEmploye.size(); i++) {
                if (matricule == ArrayEmploye.get(i).getMatricule()) {
                    ArrayEmploye.remove(i);
                    System.out.println("l'employé a été supprimer ");
                } else {
                    System.out.println("ce employé est introuvable !!");
                }
            }
        }

    }

    //afficher employe precisent
    static void afficherEmployee() {
        if (ArrayEmploye.isEmpty()) {
            System.out.println("Oups ! Il n'ya aucun employé");
        } else {
            System.out.println("Veuillez entrer le numéro d'employé que vous voullez afficher :");
            int matricule = sc.nextInt();
            for (Employee e : ArrayEmploye) {
                if (e.getMatricule() == matricule) {
                    System.out.println(e);
                }
            }
        }
    }

    //afficher tous les employées
    static void afficherAll() {
        if (ArrayEmploye.isEmpty()) {
            System.out.println("Oups ! Il n'ya aucun employé");
        } else {
            for (Employee e : ArrayEmploye) {
                System.out.println(e);
            }
        }
    }
    //nbr emplyee ayant un salaire depasse 10000
    static void afficherNbrEmploye() {
        int compteur = 0;
        if (ArrayEmploye.isEmpty()) {
            System.out.println("Oups ! Il n'ya aucun employé");
        } else {
            for (int i = 0; i < ArrayEmploye.size(); i++) {
                if (ArrayEmploye.get(i).getSalaire() > 10000) {
                    compteur += 1;
                }
            }
        }
        System.out.println("Le nombre des employées ayant un salaire dépasse 10000 est : " + compteur);

    }

    // afficher l'employée le plus agé

    static void afficherPlusage() {
        if (ArrayEmploye.isEmpty()) {
            System.out.println("Oups ! Il n'ya aucun employé");
        } else {
            int max = ArrayEmploye.get(0).getAge();
            for (Employee e : ArrayEmploye) {
                if (max <= e.getAge()) {
                    max = e.getAge();
                    System.out.println("l'employé le plus agé est :");
                    System.out.println(e);
                }

            }

        }
    }

//afficher l'employée le moins age
    static void afficherMoinage() {
        if (ArrayEmploye.isEmpty()) {
            System.out.println("Oups ! Il n'ya aucun employé");
        } else {
            int min = ArrayEmploye.get(0).getAge();
            for (Employee e : ArrayEmploye) {
                if (min <= e.getAge()) {
                    min = e.getAge();
                    System.out.println("l'employé le moins agé est :");
                    System.out.println(e);
                }

            }

        }
    }

}
