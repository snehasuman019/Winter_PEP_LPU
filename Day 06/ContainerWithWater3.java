import java.util.*;
public class ContainerWithWater3 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxarea = 0;
        int l = 0, r =height.length-1;
        while(l<r){
            int area = Math.min(height[l],height[r])*(r-l);           
            maxarea = maxarea<area ? area:maxarea;
            if(height[l]<height[r])
                l++;
            else
                r--;

        }
            System.out.println("Max area: "+ maxarea);

    }
}
