package special_assignments;

import java.util.Scanner;

public class MBTI {
    private static final Scanner key = new Scanner(System.in);
    private  static final String [][] selection = {
            {"A. Expend energy, enjoy groups ", "B. Conserve energy, one-on-one"},
            {"A. Interpret literally ",  "B. Look for meaning and possibilities"},
            {"A. Logical, thinking, questioning ",	"B. Empathetic, feeling, accommodating"},
            {"A. Organized, orderly ", "B. Flexible, adaptable"},
            {"A. More outgoing, think out loud ", "B. More reserved, think to yourself"},
            {"A. Practical, realistic, experiential ",	 "B. Imagination, innovative, theoretical"},
            {"A. Candid, straight forward, frank ", "B. Tactful, kind, encouraging"},
            {"A. Plan, schedule ", "B. Unplanned, spontaneous"},
            {"A. seek many tasks, public activities, interaction with others ", "B. seek private, solitary activities with quiet to concentrate"},
            {"A. standard, usual, conventional ", "B. different, novel, unique"},
            {"A. firm, tend to criticize, hold the line ", "B. gentle, tend to appreciate, conciliate"},
            {"A.regulated, structured ", "B. easygoing, live  and let live"},
            {"A. external, communicative, express yourself ", "B. internal, reticent, keep to yourself"},
            {"A. focus on here-and-now ", "B. look to the future, global perspective, \"big picture\""},
            {"A. tough minded, just ", "B. tender-hearted, merciful"},
            {"A. preparation, plan ahead ", "B. go with the flow, adapt as you go"},
            {"A. active, initiate ", "B. reflective, deliberate"},
            {"A. facts, things, \"what is\" ", "B. ideas, dreams, 'what could be', philosophical"},
            {"A. matter of fact, issue oriented ", "B. sensitive, people-oriented, compassionate"},
            {"A. control, govern ", "B. latitude, freedom"}};

    public static void main(String[] args) {
        System.out.print("What is your name? ");
        String name = key.next();
        first();second();third();forth();fifth();sixth();seventh();eighth();ninth();tenth();eleventh();
        twelve();thirteen();fourteenth();fifteenth();sixteenth();seventeenth();eighteenth();nineteenth();
        twenty();

    }


    public static void first(){
        System.out.println(selection[0][0] + "  \t" + selection[0][1]);
        String first = key.next();
        if (first.equalsIgnoreCase("A") || first.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("Not Valid :(");
            first();
        }
    }
    public static void second(){
        System.out.println(selection[1][0] + "  \t" + selection[1][1]);
        String second = key.next();
        if (second.equalsIgnoreCase("A") || second.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("Not Valid :(");
            second();
        }
    }
    public static void third(){
        System.out.println(selection[2][0] + "  \t" + selection[2][1]);
        String third = key.next();
        if (third.equalsIgnoreCase("A") || third.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("Not Valid :(");
            third();
        }
    }
    public static void forth(){
        System.out.println(selection[3][0] + "  \t" + selection[3][1]);
        String forth = key.next();
        if (forth.equalsIgnoreCase("A") || forth.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("Not Valid :(");
            forth();
        }

    }
        public static void fifth(){
            System.out.println(selection[4][0] + "  \t" + selection[4][1]);
            String fifth = key.next();
            if (fifth.equalsIgnoreCase("A") || fifth.equalsIgnoreCase("B")){

            }
            else{
                System.out.println("Not Valid :(");
                fifth();
            }

        }

        public static void sixth(){
            System.out.println(selection[5][0] + "  \t" + selection[5][1]);
            String sixth = key.next();
            if (sixth.equalsIgnoreCase("A") || sixth.equalsIgnoreCase("B")){

            }
            else{
                System.out.println("Not Valid :(");
                sixth();
            }
        }

        public static void seventh(){
            System.out.println(selection[6][0] + "  \t" + selection[6][1]);
            String seventh = key.next();
            if (seventh.equalsIgnoreCase("A") || seventh.equalsIgnoreCase("B")){

            }
            else{
                System.out.println("Not Valid :(");
                seventh();
            }

        }

        public  static void eighth(){
            System.out.println(selection[7][0] + "  \t" + selection[7][1]);
            String eighth = key.next();
            if (eighth.equalsIgnoreCase("A") || eighth.equalsIgnoreCase("B")){

            }
            else{
                System.out.println("Not Valid :(");
                eighth();
            }
        }

       public  static void ninth(){
           System.out.println(selection[8][0] + "  \t" + selection[8][1]);
           String ninth = key.next();
           if (ninth.equalsIgnoreCase("A") || ninth.equalsIgnoreCase("B")){

           }
           else{
               System.out.println("Not Valid :(");
               ninth();
           }

      }

      public  static void tenth(){
          System.out.println(selection[9][0] + "  \t" + selection[9][1]);
          String tenth = key.next();
          if (tenth.equalsIgnoreCase("A") || tenth.equalsIgnoreCase("B")){

          }
          else{
              System.out.println("Not Valid :(");
              tenth();
          }

      }

      public  static void eleventh(){
          System.out.println(selection[10][0] + "  \t" + selection[10][1]);
          String eleventh = key.next();
          if (eleventh.equalsIgnoreCase("A") || eleventh.equalsIgnoreCase("B")){

          }
          else{
              System.out.println("Not Valid :(");
              eleventh();
          }
     }

    public  static void twelve (){
        System.out.println(selection[11][0] + "  \t" + selection[11][1]);
        String twelve = key.next();
        if (twelve.equalsIgnoreCase("A") || twelve.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("Not Valid :(");
            twelve();
        }
    }

    public  static void thirteen(){
        System.out.println(selection[12][0] + "  \t" + selection[12][1]);
        String thirteen = key.next();
        if (thirteen.equalsIgnoreCase("A") || thirteen.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("Not Valid :(");
            thirteen();
        }
    }

    public  static void fourteenth(){
        System.out.println(selection[13][0] + "  \t" + selection[13][1]);
        String fourteenth = key.next();
        if (fourteenth.equalsIgnoreCase("A") || fourteenth.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("Not Valid :(");
            fourteenth();
        }
    }

    public  static void fifteenth(){
        System.out.println(selection[14][0] + "  \t" + selection[14][1]);
        String fifteenth = key.next();
        if (fifteenth.equalsIgnoreCase("A") || fifteenth.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("Not Valid :(");
            fifteenth();
        }
    }

    public  static void sixteenth(){
        System.out.println(selection[15][0] + "  \t" + selection[15][1]);
        String sixteenth = key.next();
        if (sixteenth.equalsIgnoreCase("A") || sixteenth.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("Not Valid :(");
            sixteenth();
        }
    }

    public  static void seventeenth(){
        System.out.println(selection[16][0] + "  \t" + selection[16][1]);
        String seventeenth = key.next();
        if (seventeenth.equalsIgnoreCase("A") || seventeenth.equalsIgnoreCase("B")){
        }
        else{
            System.out.println("Not Valid :(");
            seventeenth();
        }
    }

    public  static void eighteenth(){
        System.out.println(selection[17][0] + "  \t" + selection[17][1]);
        String eighteenth = key.next();
        if (eighteenth.equalsIgnoreCase("A") || eighteenth.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("Not Valid :(");
            eighteenth();
        }
    }

    public  static void nineteenth(){
        System.out.println(selection[18][0] + "  \t" + selection[18][1]);
        String nineteenth = key.next();
        if (nineteenth.equalsIgnoreCase("A") || nineteenth.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("Not Valid :(");
            nineteenth();
        }
    }

    public  static void twenty(){
        System.out.println(selection[19][0] + "  \t" + selection[19][1]);
        String twenty = key.next();
        if (twenty.equalsIgnoreCase("A") || twenty.equalsIgnoreCase("B")){

        }
        else{
            System.out.println("Not Valid :(");
            twenty();
        }
    }



















}

