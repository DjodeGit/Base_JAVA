
class Rectangle {
    int longueur;
    int largeur;
    int origin_x;
    int origin_y;
    int tableau[]= new int[20];
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
    class Cercle{
    float rayon;
    Cercle(float r){
        this.rayon=r;
    }
    double surface(){
        return this.rayon*this.rayon*Math.PI;
    }
}


    
}

// il y a 4 information d objets 2 methode de classe et 0 information de classe et 0 methode de classe.
// en java quand on ne precise pas la visibilite d un champ ou d une methode alors on adopte la visibilite par defaut qui est package
class Cercle{
    float rayon;
    Cercle(float r){
        this.rayon=r;
    }
    double surface(){
        return this.rayon*this.rayon*Math.PI;
    }
}
class Carre{
    int cote;
    int origin_x;
    int origin_y;
    Carre(int c, int x, int y){
        this.cote=c;
        this.origin_x = x;
        this.origin_y = y;
    }
    int surface(){
        return this.cote*this.cote;
    }
    Carre(int cote){
        this(cote,0,0);
    }
} 


public class ain {
    public static void main(String[] args) {
        // Création d'un objet Rectangle
        Rectangle mon_rectangle = new Rectangle(17, 8);// declaration avec initialisation

        //Creation d un cercle
        Cercle bon_cercle=new Cercle(8);// declaration et instanciation d un cercle

        //Creation d un carre
        Carre mon_carre =new Carre(8,0,2);

        // Accès à une variable de l'objet mon_rectangle.
        int temp = mon_rectangle.longueur;

        // Test des méthodes
        System.out.println("Longueur : " + temp);
        System.out.println("Surface : " + mon_rectangle.surface());
        System.out.println("rayon : " + bon_cercle.rayon);
        System.out.println("Surface_cercle : " + bon_cercle.surface());
        System.out.println("Cote: "+ mon_carre.cote);
        System.out.println("surface_carree: " + mon_carre.surface());
        // Déplacement du rectangle(mon_rectangle)
        mon_rectangle.deplace(5, 10);
        System.out.println("Nouvelle position (x, y) : (" + mon_rectangle.origin_x + ", " + mon_rectangle.origin_y + ")");

        
    }
}