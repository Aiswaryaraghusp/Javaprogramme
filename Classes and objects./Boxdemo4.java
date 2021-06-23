
class Box4
{ 
    double height; 
    double depth; 
    double width; 
    double volume() 
    { 
        return height * depth * width; 
        
    } 
    void SetDim(double h, double w, double d)
    { 
        height = h;
        depth = d; 
        width = w; 
        
    }
    
} 
public class Boxdemo3{ 
    public static void main(String[] args)
{ 
    Box4 mybox1 = new Box4();
    Box4 mybox2 = new Box4(); 
    double vol; 
    mybox1.SetDim(16, 8, 6); 
    vol = mybox1.volume();
    System.out.println("Volume is : "+ vol); 
    mybox2.SetDim(9, 6, 9); 
    vol = mybox2.volume();
    System.out.println("Volume is : "+ vol);
    } 
    
}