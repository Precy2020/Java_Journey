package unaware_chi;

public class Sum_4 {
    public static void main(String[] args) {

        int happy = 1;
        for(int joy = 4; joy <= 10; joy+= 8){
            for(int read = 1; read <= 5; read++) {
                happy *= joy;
            }
        }
        System.out.print(happy + " ");
    }
}
