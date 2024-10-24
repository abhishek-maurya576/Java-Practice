import java.util.*;
public class StraightLineQ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Purchase Price: ");
        double pp = in.nextDouble();
        System.out.print("Enter Salvage value: ");
        double sv = in.nextDouble();
        System.out.print("Enter Year of Services: ");
        double ys = in.nextDouble();
        double depreciation = (pp-sv)/ys;
        System.out.println(depreciation);
        

        in.close();
    }
    
}
