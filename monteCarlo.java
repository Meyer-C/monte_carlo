import java.util.Random;
import java.lang.Math;

public class monteCarlo {
    
    static float monte_Carlo(int n){
        float count = (float) 0.0;
        for (int i = 0; i < n; i++) {
            float x = getRandPoint();
            float y = getRandPoint();
            if ((Math.sqrt(Math.pow(Math.abs(x-0), 2) + Math.pow(Math.abs(y-0), 2))) <= 1) {
                count += 1.0;
            }
        }
        return (count * 4) / n;
        
    }

    static float getRandPoint() {
        Random rand = new Random();
        float x = rand.nextFloat();
            if (rand.nextBoolean()){
                x *= 1;
            }
            else{
                x *= -1;
            }
        return x;
    }

    public static void main(String[] args){
        long start = System.currentTimeMillis();
        int n = 100000;
        float pi = monte_Carlo(n);
        long end = System.currentTimeMillis();
        System.out.println(pi);
        System.out.println((end - start)/10);
    }

}
