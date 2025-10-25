import java.lang.Math;
public class Segment {
    Point p1;
    Point p2;
    Segment(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    void setp1(Point p){this.p1=p;}
    Point getp1(){return this.p1;}
    void setp2(Point p){this.p2=p;}
    Point getp2(){return this.p2;}
    public String toString(){
        //Segment[(4,5), (10,15)]
        return ("Segment[("+this.p1+"), ("+this.p2+")]");
    }
    public boolean equals(Segment s){
        if(this.p1.equals(s.p1)&&(this.p2.equals(s.p2))){
            return true;
        }
        else{
            return false;
        }
    }
    float longueur(Segment s){
        return (float)Math.sqrt(Math.pow(s.p2.getX()-s.p1.getX(),2)+Math.pow(s.p2.getY()-s.p1.getY(), 2));
    }
    protected Object clone( ) throws CloneNotSupportedException{
        return super.clone();
    }
    public float distance(){
        return (float)Math.sqrt(Math.pow(this.p2.getX()-this.p1.getX(),2)+Math.pow(this.p2.getY()-this.p1.getY(), 2));
    }
    public boolean appartient(Point p){
        float d=distance();
        if(Math.sqrt(Math.pow(p.getX()-this.p1.getX(),2)+Math.pow(p.getY()-this.p1.getY(), 2))+Math.sqrt(Math.pow(this.p2.getX()-p.getX(), 2)+Math.pow(this.p2.getY()-p.getY(), 2))==d){
            return true;
        }
        else{
            return false;
        }
    }
    boolean estInclus(Segment s){
        if(this.p1.getX()<=s.p1.getX()&&this.p1.getY()<=s.p1.getY()&&s.p2.getX()<=this.p2.getX()&&s.p2.getY()<=this.p2.getY()){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Point a = new Point(4, 5);
        Point b = new Point(10, 15);
        Segment s1 = new Segment(a, b);

        System.out.println(s1); // Segment[(4.0,5.0), (10.0,15.0)]
        System.out.println("Longueur : " + s1.longueur(s1)); // ≈ 13.0
        System.out.println("Distance : " + s1.distance()); // 13.0

        Point pMilieu = new Point(7, 10);
        System.out.println("pMilieu appartient ? " + s1.appartient(pMilieu)); // true

        // Segment inclus
        Point c = new Point(6, 7.5f);
        Point d = new Point(8, 11.25f);
        Segment sInclus = new Segment(c, d);
        System.out.println("sInclus inclus ? " + s1.estInclus(sInclus)); // true (approximatif)

        // Test equals et clone
        Segment s2 = new Segment(a, b);
        System.out.println("s1 equals s2 ? " + s1.equals(s2)); // true

        try {
            Segment cloneS1 = (Segment) s1.clone();
            System.out.println("Clone : " + cloneS1);
            System.out.println("Clone equals original ? " + cloneS1.equals(s1)); // true
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
  

