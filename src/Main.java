public class Main {

    public static void main(String[] args) {
        String[][] texts = {
                {"Иаков 1:1", "Иаков 1:2", "Иаков 1:3" ,"Иаков 1:4"},
                {"Иаков 2:1", "Иаков 2:2"},
                {"Иаков 3:1", "Иаков 3:2", "Иаков 3:3", "Иаков 3:4"}
        };
        for ( byte a = 0; a < texts.length ; a++ ) {
            for ( byte i = 0; i < texts[a].length ; i++ ) {
                System.out.println(texts[a][i]);
            }
        }
    }
}
