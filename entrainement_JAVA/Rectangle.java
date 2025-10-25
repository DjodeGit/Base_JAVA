public class Rectangle {
    Point p;
    float largeur;
    float longueur;
    /*1) Un constructeur sans argument et un autre qui prend quatre arguments : l'abcisse du point supérieur
    gauche, l'ordonné du point supérieur gauche, la largeur et la longueur.*/
    Rectangle (){
        this.p=new Point(0,0);
        this.largeur=0;
        this.longueur=0;

    }
    Rectangle(float x,float y,float largeur,float longueur){
        //this.p.setX(x);
        //this.p.setY(y);
        this.p=new Point(x,y);
        this.largeur=largeur;
        this.longueur=longueur;
    }
    //2) Les accesseurs en consultation et en modification.
    void setlargeur(float largeur){this.largeur=largeur;}
    void setlongueur(float longueur){this.longueur=longueur;}
    float getlargeur(){return this.largeur;}
    float getlongueur(){return this.longueur;}
    Point getp() {return this.p ; }
    void setp(Point p) {this.p=p ; }//ou//
    void setp(float a, float b) {
        this.p.setX(a); 
        this.p.setY(b); 
    }
    public float perimetre(){
        return (this.largeur+this.longueur)*2;
    }
    public float surface(){
        return this.largeur*this.longueur;
    }
    public boolean equals(Rectangle r){
        if(this.p.equals(p)&&this.longueur==r.getlongueur()&&this.largeur==r.getlargeur()){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return ("Rectangle[("+this.p.getX()+","+this.p.getY()+") , "+this.largeur+","+this.longueur+"]");
    }
    protected Object clone( ) throws CloneNotSupportedException{
        Rectangle r=(Rectangle)super.clone();
        r.p=(Point)this.p.clone();
        return r;
    }
    public static float perimetre(Rectangle r){
        return (r.getlargeur()+r.getlongueur())*2;
    }
    public static float surface(Rectangle r){
        return (r.getlargeur()*r.getlongueur());
    }
    public boolean estDans(Point p1){
        if(p1.getX()>=this.p.getX()&&p1.getX()<=this.getlargeur()&&p1.getY()>=this.p.getY()&&p1.getY()<=this.getlongueur()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean estInclus(Rectangle r){
        if(this.p.getX()<r.p.getX()&&r.p.getX()+r.getlargeur()<this.p.getX()+this.largeur&&this.p.getY()>r.p.getY()&&r.p.getY()-r.getlongueur()>this.p.getY()-this.longueur){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        // Tests
        Rectangle rect = new Rectangle(4, 5, 50, 100);
        System.out.println(rect);  // Rectangle[(4.0,5.0), 50.0, 100.0]
        System.out.println("Périmètre : " + rect.perimetre());  // 300.0
        System.out.println("Surface : " + rect.surface());  // 5000.0
        System.out.println("Point (10,3) dans ? " + rect.estDans(new Point(10, 3)));  // true (assumé)
        Rectangle rect2 = new Rectangle(5, 4.5f, 40, 90);
        System.out.println("rect2 inclus ? " + rect.estInclus(rect2));  // true
        System.out.println(Rectangle.perimetre(rect));  // 300.0
        try {
            Rectangle cloneRect = (Rectangle) rect.clone();
            System.out.println(cloneRect.equals(rect));  // true
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


