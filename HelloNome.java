class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Davide!");
        
        Vector<Character> lettere = new Vector<>();
        lettere.add('d');
        lettere.add('a');
        lettere.add('v');
        lettere.add('i');
        lettere.add('d');
        lettere.add('e');

        for (Character lettera : lettere){
            System.out.println(lettera);
        }
    }
}