public class PrintOurStringBackwards {
    public static void main(String[] args) {
    //PRINTS OUT WORD BACKWARDS
    String s= "Baseball";
    StringBuilder ns= new StringBuilder();
    char ch;
    System.out.print(s);
    for(int i=0; i<s.length(); i++){
        ch= s.charAt(i);
        ns.insert(0, ch);
    }
      System.out.print("Reversed word: "+ ns);
}
}
