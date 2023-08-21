//package training_ground;
//
//public class ArrayList {
//
//    private int count;
//    private static int[] list;
//    private static int capacity;
//
//
//
//
//    public ArrayList(){
//        final int DEFAULT = 10;
//        capacity = DEFAULT;
//        list = new int[capacity];
//    }
//
//    public  ArrayList(int initialSpace){
//        capacity = initialSpace;
//        list = new int[capacity];
//
//    }
//    public boolean isEmpty() {
//        return count == 0;
//    }
//
//    public void add(int number) {
//        if(capacity == size()){
//            expand();
//        }
//
//        list[count] = number;
//        count++;
//    }
//
//    private void expand() {
//    }
//
//
//    public int get(int index){
//        return list[index];
//    }
//
//    private int size() {
//        int size = list;
//        for (int digits : list) {
//            if (digits != null){
//                size++;
//            }
//        }
//         return size;
//    }
//
//
//    public int getCapacity() {
//        return capacity;
//    }
//}
