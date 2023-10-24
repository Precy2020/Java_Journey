package stringBuilder;

import java.util.ArrayList;


public class UndoStringBuilder {

    private StringBuilder letter;
    private ArrayList<String> store;

    public UndoStringBuilder() {
        letter = new StringBuilder();
        store = new ArrayList<>();
    }

    public StringBuilder append(String word) {
        store.add(letter.toString());
        letter.append(word);
        return letter;
    }

    public StringBuilder delete(int start, int end) {
        store.add(letter.toString());
        letter.delete(start, end);
        return letter;
    }

    public StringBuilder insert(int offset, String str) {
        store.add(letter.toString());
        letter.insert(offset, str);
        return letter;
    }

    public StringBuilder replace(int start, int end, String str) {
        store.add(letter.toString());
        letter.replace(start, end, str);
        return letter;
    }

    public StringBuilder reverse() {
        store.add(letter.toString());
        letter.reverse();
        return letter;
    }

    @Override
    public String toString() {
        return letter.toString();
    }

    public StringBuilder undo() {
        if (!store.isEmpty()) {
            String previousState = store.remove(store.size() - 1);
            letter = new StringBuilder(previousState);
        }
        else {
            return null;
        }
        return letter;
    }


}

