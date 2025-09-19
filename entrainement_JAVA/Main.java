class Rectangle {
    int longueur;
    int largeur;
    int origin_x;
    int origin_y;

    // Constructeur
    Rectangle(int lon, int lar) {
        this.longueur = lon;
        this.largeur = lar;
        this.origin_x = 0;
        this.origin_y = 0;
    }

    void deplace(int x, int y) {
        this.origin_x = this.origin_x + x;
        this.origin_y = this.origin_y + y;
    }

    int surface() {
        return this.longueur * this.largeur;
    }
}

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Rectangle
        Rectangle mon_rectangle = new Rectangle(17, 8);

        // Accès à une variable de l'objet
        int temp = mon_rectangle.longueur;

        // Test des méthodes
        System.out.println("Longueur : " + temp);
        System.out.println("Surface : " + mon_rectangle.surface());

        // Déplacement
        mon_rectangle.deplace(5, 10);
        System.out.println("Nouvelle position (x, y) : (" + mon_rectangle.origin_x + ", " + mon_rectangle.origin_y + ")");
    }
}