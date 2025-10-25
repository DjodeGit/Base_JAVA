import java.lang.Math;
public class Cercle {
    public static final float PI=3.14f ; //Constante de Classe
    private Point centre ;
    private float rayon ;
    Cercle(float x, float y, float ray) {
        this.centre=new Point(x, y); //Correct
        this.rayon=ray ;
    }
    Cercle(float x, float ray) {
        this.centre=new Point(x,x); //Erreur
        this.rayon=ray ;
    }
    Cercle(Point center, float ray) {
        this.centre=center ;
        this.rayon=ray ;
    }
    float getRayon() {return this.rayon ; }
    Point getCentre() {return this.centre ; }
    void setRayon(float rayon) {this.rayon=rayon ; }
    void setCentre(Point centre) {this.centre=centre ; }
    void setCentre(float a, float b) {
    this.centre.setX(a); //Erreur
    this.centre.setY(b) ; //Erreur
    }
    public String toString(){
        return '[' + (this.centre).toString() + ',' +this.rayon + ']' ;
    }
/*1)*/    public float perimetre(){
        float p=(this.rayon*2)*PI;
        return p;
    }
/*2)*/    public static float perimetre(Cercle c){
        return 2*PI*c.getRayon();
    }
/*3)*/    public float surface( ){
        return this.rayon*this.rayon*PI;
    }
/*4)*/    public static float surface(Cercle c){
        return c.getRayon()*c.getRayon()*PI;
    }
/*4+1)*/    public boolean surLeCercle( Point p){
        if(Math.sqrt(Math.pow(this.centre.getX()-p.getX(),2)+Math.pow(this.centre.getY()-p.getY(),2))==this.rayon){
            return true;
        }
        else{
            return false;
        }
        
        
    }
/*6)*/    public boolean dansLeCercle( Point p){
        if(Math.sqrt(Math.pow(this.centre.getX()-p.getX(),2)+Math.pow(this.centre.getY()-p.getY(),2))<=this.rayon){
            return true;
        }
        else{
            return false;
        }
    }
/*7)*/    public boolean equals(Cercle c){
        if(this.centre.equals(c.getCentre())&&this.rayon==c.getRayon()){
            return true;
        }
        else{
            return false;
        }
    }
/*8)*/    protected Object clone( )throws CloneNotSupportedException{
        Cercle c =(Cercle)super.clone();  
        c.centre = (Point) this.centre.clone();
        return c;
    }
    public static void main(String[ ] args) throws CloneNotSupportedException {
    Cercle c= new Cercle(0, 0, 14) ;
    Point p1= new Point(15, 17) ;
    p1.setX(17) ;
    c.setCentre(p1) ;
    System.out.println(c) ;
    System.out.println("(1):le perimetre du cercle est :p="+c.perimetre());
    Cercle c2=new Cercle(p1, 25) ;
    System.out.println("(2):le perimetre du cercle est :p="+Cercle.perimetre(c2));
    System.out.println("(3):la surface du cercle est :S="+c2.surface());
    System.out.println("(4):la surface du cercle est :S="+Cercle.surface(c));
    System.out.println("(4+1):le point est sur le cercle ?:S="+c2.surLeCercle(p1));
    System.out.println("(6):le point est dans le cercle ?:S="+c2.dansLeCercle(p1));
    System.out.println("(7):y a t-il equivalence entre les cercles ?:S="+c.equals(c));
    System.out.println("(8):duplication du cercle :S="+c2.clone( ));
    System.out.println(c2) ;
    p1.presenteToi() ; //Erreur
    }
}
