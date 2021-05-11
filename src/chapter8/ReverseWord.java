package chapter8;

public class ReverseWord {
    public static void main(String[] main){
//        countWords("Text");
//        reverseString("Text");
        addSpace("HeyWorld!It'sMeAngie");
    }
    public static void countWords(String text){
        var words=text.split(" ");
        int numberOfWords=words.length;


        for(int i=0;i<numberOfWords;i++){
            System.out.println(words[i]);
        }
    }
    public static void reverseString(String text){
        for(int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }
    public static void addSpace(String text){

        var modifiedText=new StringBuilder(text);

        for(int i=0;i<modifiedText.length();i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
