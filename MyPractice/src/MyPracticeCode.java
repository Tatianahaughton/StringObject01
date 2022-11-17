public class MyPracticeCode {
    String newWord;

    String censorLetter(String word, char letter) {
            newWord = word.replace(letter, '*');
        System.out.println(newWord);
        return word;
    }



    public static void main(String[] args) {
        MyPracticeCode obj = new MyPracticeCode();
        obj.censorLetter("trick or treat", 't');
    }
}
