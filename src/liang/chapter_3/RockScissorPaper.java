package liang.chapter_3;
//scissor (0), rock (1), paper (2): 1
//        The computer is scissor. You are rock. You won
//        scissor (0), rock (1), paper (2): 2
//        The computer is paper. You are paper too. It is a draw

import java.security.SecureRandom;

public class RockScissorPaper {
    public static void main(String[] args) {

        SecureRandom key = new SecureRandom();
        System.out.println(">>> ");
        int game = key.nextInt(2);

        if (game == 0){
            System.out.println("kk");
        }














    }
}
