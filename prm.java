public class prm {
    double width,height,depth;
    prm(double width,double height,double depth){
    this.width = width;
    this.depth =depth;
    this.height=height;

}
double getvolume(){
    return width *depth*height;
}
public static void main(String[] args) {
    prm p= new prm(2, 05, 06);
    System.out.println("volume of prm ="+ p.getvolume());
}
}
