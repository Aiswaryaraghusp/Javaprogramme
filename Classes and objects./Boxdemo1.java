class Box1 
{ 
    double height; 
    double weight; 
    double width;
    
} 
public class Boxdemo1
{ 
    public static void main(String[] args) {
        Box1 mybox1 = new Box1(); 
        Box1 mybox2 = new Box1();
        double vol;
        mybox1.height = 10; 
        mybox1.weight = 12; 
        mybox1.width = 50; 
        vol = mybox1.height * mybox1.width * mybox1.weight;
        System.out.println("\nVolume of first object is " + vol);
        mybox2.height = 8; 
        mybox2.weight = 15;
        mybox2.width = 8;
        vol = mybox2.height * mybox2.width * mybox2.weight; 
        System.out.println("Volume of second object is " + vol + "\n");
        }
    
}
