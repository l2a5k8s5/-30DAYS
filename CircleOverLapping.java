import java.util.*;

public class CircleOverLapping {
    public static boolean circleRectangleOverLapping(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2){
        int x=Math.max(x1,Math.min(x2,xCenter));
        int y=Math.max(y1,  Math.min(y2, yCenter));

        int dist_x=x-xCenter;
        int dist_y=y-yCenter;

        return dist_x*dist_x+dist_y*dist_y<=radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the radius : ");
        int radius=sc.nextInt();
        System.out.println(" enter   the xCenter : ");
        int xCenter=sc.nextInt();
        System.out.println(" Enter the yCenter : ");
        int yCenter=sc.nextInt();
        System.out.println(" enter the x1 : ");
        int x1=sc.nextInt();

        System.out.println(" enter the x2 : ");
        int x2=sc.nextInt();
        System.out.println(" enter the y1 : ");
        int y1=sc.nextInt();
        System.out.println(" enter the y2 : ");
        int y2=sc.nextInt();


        if(circleRectangleOverLapping(radius, xCenter, yCenter, x1, y1, x2, y2)){
            System.out.println(" True");
        }else{
            System.out.println(" False");
        }
        sc.close();
    }
    
}
