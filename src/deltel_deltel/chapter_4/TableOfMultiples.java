package deltel_deltel.chapter_4;

public class TableOfMultiples {
    public static void main(String[] args) {
         int num = 1;
        System.out.println("\t\tN1\t\tN2\t\tN3\t\tN4");
        for (; num <= 5; num++){
            int n2 = num * num;
            int n3 = num * num * num;
            int n4 = num * num * num * num;
            System.out.println("\t\t" + num+" "+"\t\t"+n2+"\t\t"+n3+"\t\t"+n4);
        }


    }
}
