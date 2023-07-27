package special_assignments;

//package special_assignments;
//
//import java.util.Scanner;
//
//public class MBTI {
//    private static final Scanner key = new Scanner(System.in);
//    private static String first;
//    private static String second;
//    private static String third;
//    private static String forth;
//    private static String fifth;
//    private static String sixth;
//    private static String seventh;
//    private static String eighth;
//    private static String ninth;
//    private static String tenth;
//    private static String eleventh;
//    private static String twelve;
//    private static String thirteen;
//    private static String fourteenth;
//    private static String fifteenth;
//    private static String sixteenth;
//    private static String seventeenth;
//    private static String eighteenth;
//    private static String nineteenth;
//    private static String twenty;
//    public static int countA1;
//    public static int countB1;
//    public static int countA2;
//    public static int countB2;
//    public static int countA3;
//    public static int countB3;
//    public static int countA4;
//    public static int countB4;
//    public static String name;
//
//    private static final String[][] selection = {
//            {"A. Expend energy, enjoy groups ", "B. Conserve energy, one-on-one"},
//            {"A. Interpret literally ", "B. Look for meaning and possibilities"},
//            {"A. Logical, thinking, questioning ", "B. Empathetic, feeling, accommodating"},
//            {"A. Organized, orderly ", "B. Flexible, adaptable"},
//            {"A. More outgoing, think out loud ", "B. More reserved, think to yourself"},
//            {"A. Practical, realistic, experiential ", "B. Imagination, innovative, theoretical"},
//            {"A. Candid, straight forward, frank ", "B. Tactful, kind, encouraging"},
//            {"A. Plan, schedule ", "B. Unplanned, spontaneous"},
//            {"A. seek many tasks, public activities, interaction with others ", "B. seek private, solitary activities with quiet to concentrate"},
//            {"A. standard, usual, conventional ", "B. different, novel, unique"},
//            {"A. firm, tend to criticize, hold the line ", "B. gentle, tend to appreciate, conciliate"},
//            {"A.regulated, structured ", "B. easygoing, live  and let live"},
//            {"A. external, communicative, express yourself ", "B. internal, reticent, keep to yourself"},
//            {"A. focus on here-and-now ", "B. look to the future, global perspective, \"big picture\""},
//            {"A. tough minded, just ", "B. tender-hearted, merciful"},
//            {"A. preparation, plan ahead ", "B. go with the flow, adapt as you go"},
//            {"A. active, initiate ", "B. reflective, deliberate"},
//            {"A. facts, things, \"what is\" ", "B. ideas, dreams, 'what could be', philosophical"},
//            {"A. matter of fact, issue oriented ", "B. sensitive, people-oriented, compassionate"},
//            {"A. control, govern ", "B. latitude, freedom"}};
//
//    public static void main(String[] args) {
//        System.out.print("Your name >> ");
//        name = key.nextLine();
//        first();
//    }
//
//    public static void first() {
//        System.out.println(selection[0][0] + "  \t" + selection[0][1]);
//        first = key.next();
//
//        if (first.equalsIgnoreCase("A") || first.equalsIgnoreCase("B")) {
//            second();
//        } else {
//            System.out.println("Not Valid :(");
//            first();
//        }
//    }
//
//    public static void second() {
//        System.out.println(selection[1][0] + "  \t" + selection[1][1]);
//        second = key.next();
//        if (second.equalsIgnoreCase("A") || second.equalsIgnoreCase("B")) {
//            third();
//        } else {
//            System.out.println("Not Valid :(");
//            second();
//        }
//    }
//
//    public static void third() {
//        System.out.println(selection[2][0] + "  \t" + selection[2][1]);
//        third = key.next();
//        if (third.equalsIgnoreCase("A") || third.equalsIgnoreCase("B")) {
//            forth();
//        } else {
//            System.out.println("Not Valid :(");
//            third();
//        }
//    }
//
//    public static void forth() {
//        System.out.println(selection[3][0] + "  \t" + selection[3][1]);
//        forth = key.next();
//        if (forth.equalsIgnoreCase("A") || forth.equalsIgnoreCase("B")) {
//            fifth();
//        } else {
//            System.out.println("Not Valid :(");
//            forth();
//        }
//    }
//
//    public static void fifth() {
//        System.out.println(selection[4][0] + "  \t" + selection[4][1]);
//        fifth = key.next();
//        if (fifth.equalsIgnoreCase("A") || fifth.equalsIgnoreCase("B")) {
//            sixth();
//        } else {
//            System.out.println("Not Valid :(");
//            fifth();
//        }
//    }
//
//    public static void sixth() {
//        System.out.println(selection[5][0] + "  \t" + selection[5][1]);
//        sixth = key.next();
//        if (sixth.equalsIgnoreCase("A") || sixth.equalsIgnoreCase("B")) {
//            seventh();
//        } else {
//            System.out.println("Not Valid :(");
//            sixth();
//        }
//    }
//
//    public static void seventh() {
//        System.out.println(selection[6][0] + "  \t" + selection[6][1]);
//        seventh = key.next();
//        if (seventh.equalsIgnoreCase("A") || seventh.equalsIgnoreCase("B")) {
//            eighth();
//        } else {
//            System.out.println("Not Valid :(");
//            seventh();
//        }
//    }
//
//    public static void eighth() {
//        System.out.println(selection[7][0] + "  \t" + selection[7][1]);
//        eighth = key.next();
//        if (eighth.equalsIgnoreCase("A") || eighth.equalsIgnoreCase("B")) {
//            ninth();
//        } else {
//            System.out.println("Not Valid :(");
//            eighth();
//        }
//    }
//
//    public static void ninth() {
//        System.out.println(selection[8][0] + "  \t" + selection[8][1]);
//        ninth = key.next();
//        if (ninth.equalsIgnoreCase("A") || ninth.equalsIgnoreCase("B")) {
//            tenth();
//        } else {
//            System.out.println("Not Valid :(");
//            ninth();
//        }
//    }
//
//    public static void tenth() {
//        System.out.println(selection[9][0] + "  \t" + selection[9][1]);
//        tenth = key.next();
//        if (tenth.equalsIgnoreCase("A") || tenth.equalsIgnoreCase("B")) {
//            eleventh();
//        } else {
//            System.out.println("Not Valid :(");
//            tenth();
//        }
//    }
//
//    public static void eleventh() {
//        System.out.println(selection[10][0] + "  \t" + selection[10][1]);
//        eleventh = key.next();
//        if (eleventh.equalsIgnoreCase("A") || eleventh.equalsIgnoreCase("B")) {
//            twelve();
//        } else {
//            System.out.println("Not Valid :(");
//            eleventh();
//        }
//    }
//
//    public static void twelve() {
//        System.out.println(selection[11][0] + "  \t" + selection[11][1]);
//        twelve = key.next();
//        if (twelve.equalsIgnoreCase("A") || twelve.equalsIgnoreCase("B")) {
//            thirteen();
//        } else {
//            System.out.println("Not Valid :(");
//            twelve();
//        }
//    }
//
//    public static void thirteen() {
//        System.out.println(selection[12][0] + "  \t" + selection[12][1]);
//        thirteen = key.next();
//        if (thirteen.equalsIgnoreCase("A") || thirteen.equalsIgnoreCase("B")) {
//            fourteenth();
//        } else {
//            System.out.println("Not Valid :(");
//            thirteen();
//        }
//    }
//
//    public static void fourteenth() {
//        System.out.println(selection[13][0] + "  \t" + selection[13][1]);
//        fourteenth = key.next();
//        if (fourteenth.equalsIgnoreCase("A") || fourteenth.equalsIgnoreCase("B")) {
//            fifteenth();
//        } else {
//            System.out.println("Not Valid :(");
//            fourteenth();
//        }
//    }
//
//    public static void fifteenth() {
//        System.out.println(selection[14][0] + "  \t" + selection[14][1]);
//        fifteenth = key.next();
//        if (fifteenth.equalsIgnoreCase("A") || fifteenth.equalsIgnoreCase("B")) {
//            sixteenth();
//        } else {
//            System.out.println("Not Valid :(");
//            fifteenth();
//        }
//    }
//
//    public static void sixteenth() {
//        System.out.println(selection[15][0] + "  \t" + selection[15][1]);
//        sixteenth = key.next();
//        if (sixteenth.equalsIgnoreCase("A") || sixteenth.equalsIgnoreCase("B")) {
//            seventeenth();
//        } else {
//            System.out.println("Not Valid :(");
//            sixteenth();
//        }
//    }
//
//    public static void seventeenth() {
//        System.out.println(selection[16][0] + "  \t" + selection[16][1]);
//        seventeenth = key.next();
//        if (seventeenth.equalsIgnoreCase("A") || seventeenth.equalsIgnoreCase("B")) {
//            eighteenth();
//        } else {
//            System.out.println("Not Valid :(");
//            seventeenth();
//        }
//    }
//
//    public static void eighteenth() {
//        System.out.println(selection[17][0] + "  \t" + selection[17][1]);
//        eighteenth = key.next();
//        if (eighteenth.equalsIgnoreCase("A") || eighteenth.equalsIgnoreCase("B")) {
//            nineteenth();
//        } else {
//            System.out.println("Not Valid :(");
//            eighteenth();
//        }
//    }
//
//    public static void nineteenth() {
//        System.out.println(selection[18][0] + "  \t" + selection[18][1]);
//        nineteenth = key.next();
//        if (nineteenth.equalsIgnoreCase("A") || nineteenth.equalsIgnoreCase("B")) {
//            twenty();
//        } else {
//            System.out.println("Not Valid :(");
//            nineteenth();
//        }
//    }
//
//    public static void twenty() {
//        System.out.println(selection[19][0] + "  \t" + selection[19][1]);
//        twenty = key.next();
//        if (twenty.equalsIgnoreCase("A") || twenty.equalsIgnoreCase("B")) {
//            System.out.println("Hello " + " " + name + "!! " + ":)");
//            ei();
//            sn();
//            tf();
//            jp();
//            grand_finale();
//            finals();
//        } else {
//            System.out.println("Not Valid :(");
//            twenty();
//        }
//    }
//
//    public static void ei() {
//        countA1 = 0;
//        countB1 = 0;
//        System.out.println("-------------------EI---------------------");
//        if (first.equalsIgnoreCase("A")) {
//            System.out.println(selection[0][0]);
//            countA1 = countA1 + 1;
//        }
//        if (first.equalsIgnoreCase("B")) {
//            System.out.println(selection[0][1]);
//            countB1 = countB1 + 1;
//        }
//        if (fifth.equalsIgnoreCase("A")) {
//            System.out.println(selection[4][0]);
//            countA1 = countA1 + 1;
//        }
//        if (fifth.equalsIgnoreCase("B")) {
//            System.out.println(selection[4][1]);
//            countB1 = countB1 + 1;
//        }
//        if (ninth.equalsIgnoreCase("A")) {
//            System.out.println(selection[8][0]);
//            countA1 = countA1 + 1;
//        }
//        if (ninth.equalsIgnoreCase("B")) {
//            System.out.println(selection[8][1]);
//            countB1 = countB1 + 1;
//        }
//        if (thirteen.equalsIgnoreCase("A")) {
//            System.out.println(selection[12][0]);
//            countA1 = countA1 + 1;
//        }
//        if (thirteen.equalsIgnoreCase("B")) {
//            System.out.println(selection[12][1]);
//            countB1 = countB1 + 1;
//        }
//        if (seventeenth.equalsIgnoreCase("A")) {
//            System.out.println(selection[16][0]);
//            countA1 = countA1 + 1;
//        }
//        if (seventeenth.equalsIgnoreCase("B")) {
//            System.out.println(selection[16][1]);
//            countB1 = countB1 + 1;
//        }
//        System.out.println("The total number of a chosen is " + countA1);
//        System.out.println("The total number of b chosen is " + countB1);
//        System.out.println("----------------------------------------");
//    }
//
//    public static void sn() {
//        countA2 = 0;
//        countB2 = 0;
//        System.out.println("-----------------SN-----------------------");
//        if (second.equalsIgnoreCase("A")) {
//            System.out.println(selection[1][0]);
//            countA2 = countA2 + 1;
//        }
//        if (second.equalsIgnoreCase("B")) {
//            System.out.println(selection[1][1]);
//            countB2 = countB2 + 1;
//        }
//        if (sixth.equalsIgnoreCase("A")) {
//            System.out.println(selection[5][0]);
//            countA2 = countA2 + 1;
//        }
//        if (sixth.equalsIgnoreCase("B")) {
//            System.out.println(selection[5][1]);
//            countB2 = countB2 + 1;
//        }
//        if (tenth.equalsIgnoreCase("A")) {
//            System.out.println(selection[9][0]);
//            countA2 = countA2 + 1;
//        }
//        if (tenth.equalsIgnoreCase("B")) {
//            System.out.println(selection[9][1]);
//            countB2 = countB2 + 1;
//        }
//        if (fourteenth.equalsIgnoreCase("A")) {
//            System.out.println(selection[13][0]);
//            countA2 = countA2 + 1;
//        }
//        if (fourteenth.equalsIgnoreCase("B")) {
//            System.out.println(selection[13][0]);
//            countB2 = countB2 + 1;
//        }
//        if (eighteenth.equalsIgnoreCase("A")) {
//            System.out.println(selection[17][0]);
//            countA2 = countA2 + 1;
//        }
//        if (eighteenth.equalsIgnoreCase("B")) {
//            System.out.println(selection[17][1]);
//            countB2 = countB2 + 1;
//        }
//        System.out.println("The total number of a chosen is " + countA2);
//        System.out.println("The total number of b chosen is " + countB2);
//        System.out.println("----------------------------------------");
//    }
//
//    public static void tf() {
//        countA3 = 0;
//        countB3 = 0;
//        System.out.println("-------------------TF---------------------");
//        if (third.equalsIgnoreCase("A")) {
//            System.out.println(selection[2][0]);
//            countA3 = countA3 + 1;
//        }
//        if (third.equalsIgnoreCase("B")) {
//            System.out.println(selection[2][1]);
//            countB3 = countB3 + 1;
//        }
//        if (seventh.equalsIgnoreCase("A")) {
//            System.out.println(selection[6][0]);
//            countA3 = countA3 + 1;
//        }
//        if (seventh.equalsIgnoreCase("B")) {
//            System.out.println(selection[6][1]);
//            countB3 = countB3 + 1;
//        }
//        if (eleventh.equalsIgnoreCase("A")) {
//            System.out.println(selection[10][0]);
//            countA3 = countA3 + 1;
//        }
//        if (eleventh.equalsIgnoreCase("B")) {
//            System.out.println(selection[10][1]);
//            countB3 = countB3 + 1;
//        }
//        if (fifteenth.equalsIgnoreCase("A")) {
//            System.out.println(selection[14][0]);
//            countA3 = countA3 + 1;
//        }
//        if (fifteenth.equalsIgnoreCase("B")) {
//            System.out.println(selection[14][1]);
//            countB3 = countB3 + 1;
//        }
//        if (nineteenth.equalsIgnoreCase("A")) {
//            System.out.println(selection[18][0]);
//            countA3 = countA3 + 1;
//        }
//        if (nineteenth.equalsIgnoreCase("B")) {
//            System.out.println(selection[18][1]);
//            countB3 = countB3 + 1;
//        }
//
//        System.out.println("The total number of a chosen is " + countA3);
//        System.out.println("The total number of b chosen is " + countB3);
//        System.out.println("----------------------------------------");
//    }
//
//    public static void jp() {
//        countA4 = 0;
//        countB4 = 0;
//        System.out.println("-------------------IF---------------------");
//        if (forth.equalsIgnoreCase("A")) {
//            countA4 = countA4 + 1;
//        }
//        if (forth.equalsIgnoreCase("B")) {
//            countB4 = countB4 + 1;
//        }
//        if (eighth.equalsIgnoreCase("A")) {
//            countA4 = countA4 + 1;
//        }
//        if (eighth.equalsIgnoreCase("B")) {
//            countB4 = countB4 + 1;
//        }
//        if (twelve.equalsIgnoreCase("A")) {
//            countA4 = countA4 + 1;
//        }
//        if (twelve.equalsIgnoreCase("B")) {
//            countB4 = countB4 + 1;
//        }
//        if (sixteenth.equalsIgnoreCase("A")) {
//            countA4 = countA4 + 1;
//        }
//        if (sixteenth.equalsIgnoreCase("B")) {
//            countB4 = countB4 + 1;
//        }
//        if (twenty.equalsIgnoreCase("A")) {
//            countA4 = countA4 + 1;
//        }
//        if (twenty.equalsIgnoreCase("B")) {
//            countB4 = countB4 + 1;
//        }
//
//        System.out.println("The total number of a chosen is " + countA4);
//        System.out.println("The total number of b chosen is " + countB4);
//        System.out.println("----------------------------------------");
//    }
//
//    public static void finals() {
//        int e = 0;
//        int i = 0;
//        int s = 0;
//        int n = 0;
//        int t = 0;
//        int f = 0;
//        int j = 0;
//        int p = 0;
//
//        if (countA1 > countB1) {
//            e += 1;
//        } else {
//            i += 1;
//        }
//        if (countA2 > countB2) {
//            s += 1;
//        } else {
//            n += 1;
//        }
//        if (countA3 > countB3) {
//            t += 1;
//        } else {
//            f += 1;
//        }
//        if (countA4 > countB4) {
//            j += 1;
//        } else {
//            p += 1;
//        }
//
//        System.out.print("Your personality type is" + " ");
//        if (e > i) {
//            System.out.print("E");
//        } else {
//            System.out.print("I");
//        }
//        if (s > n) {
//            System.out.print("S");
//        } else {
//            System.out.print("N");
//        }
//        if (t > f) {
//            System.out.print("T");
//        } else {
//            System.out.print("F");
//        }
//        if (j > p) {
//            System.out.print("J");
//        } else {
//            System.out.print("P");
//        }
//    }
//
//    public static void grand_finale(){
//                System.out.println("""
//                                    Personality types =>
//                                    INFJ: An Advocate INFJ is someone with the Introverted, Intuitive,\s
//                                    Feeling, and Judging personality traits. They tend to approach life with deep\s
//                                    thoughtfulness and imagination. Their inner vision personal values, and a quiet,\s
//                                    principled version of humanism guide them in all things.
//                                    ENFP: ENFP is someone with the Extroverted, Intuitive, Feeling, and Prospecting\s
//                                    personality traits. These people tend to embrace big ideas and actions that reflect\s
//                                    their sense of hope and goodwill toward others. Their vibrant energy can flow in many directions.
//                                    INFP: INFP is someone who possesses the Introverted, Intuitive, Feeling, and Prospecting personality\s
//                                    traits. These rare personality types tend to be quiet, open-minded, and imaginative, and they apply\s
//                                    a caring and creative approach to everything they do.
//                                    INTP: INTP is someone with the Introverted, Intuitive, Thinking, and Prospecting personality traits.\s
//                                    These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths,\s
//                                    mixing willingness to experiment with personal creativity.
//                                    INTJ: INTJ is a person with the Introverted, Intuitive, Thinking, and Judging personality traits. These thoughtful tacticians\s
//                                    love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.
//                                    ISFJ: ISFJ is someone with the Introverted, Observant, Feeling, and Judging personality traits. These people tend to be warm and unassuming
//                                    in their own steady way. They’re efficient and responsible, giving careful attention to practical details in their daily lives.
//                                    ISTJ: A Logistician ISTJ is someone with the Introverted, Observant, Thinking, and Judging personality traits. These people tend to be reserved yet willful,
//                                    with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.
//                                    ISTP: ISTP is someone with the Introverted, Observant, Thinking, and Prospecting personality traits. They tend to have an individualistic mindset,\s
//                                    pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.
//                                    ESFP: ESFP is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits. These people love vibrant experiences, engaging in\s
//                                    life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared activities.
//                                    ESFJ: ESFJ is a person with the Extraverted, Observant, Feeling, and Judging personality traits. They are attentive and people-focused,\s
//                                    and they enjoy taking part in their social community. Their achievements are guided by decisive values, and they willingly offer guidance to others.
//                                    ESTJ: ESTJ is someone with the Extraverted, Observant, Thinking, and Judging personality traits. They possess great fortitude, emphatically following\s
//                                    their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity.
//                                    ESTP: ESTP is someone with the Extraverted, Observant, Thinking, and Prospecting personality traits. They tend to be energetic and action-oriented,\s
//                                    deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.
//                                    ISFP: ISFP is a person with the Introverted, Observant, Feeling, and Prospecting personality traits. They tend to have open minds, approaching life,\s
//                                    new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.
//                                    ENTP: An ENTP is a person with the Extraverted, Intuitive, Thinking, and Prospecting personality traits. They tend to be bold and creative,\s
//                                    deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter.
//                                    ENTJ: A ENTJ is someone with the Extraverted, Intuitive, Thinking, and Judging personality traits. They are decisive people who love momentum\s
//                                    and accomplishment. They gather information to construct their creative visions but rarely hesitate for long before acting on them.
//                                    ENFJ: A  ENFJ is a person with the Extraverted, Intuitive, Feeling, and Judging personality traits. These warm, forthright types love helping others,\s
//                                    and they tend to have strong ideas and values. They back their perspective with the creative energy to achieve their goals.
//                                    """);
//    }}
//
//
public class MBTI {
    public static void main(String[] args) {
        String letter1 = "Hello";
        String letter2 = "Precious";
        System.out.println(letter1.concat(" " + letter2));

        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("e"));

    }
}

