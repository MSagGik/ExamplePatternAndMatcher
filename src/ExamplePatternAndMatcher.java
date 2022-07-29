import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamplePatternAndMatcher {
    public static void main(String[] args) {
        String text = "Author@Pamela.magic To this day Jane and Michael cannot be sure of what happened then. All they know for certain\n" +
                "is that, as soon as Mr. Wigg had appealed to Mary Poppins, the table below began to wriggle on its\n" +
                "legs Author@Lyndon.magic. Presently it was swaying dangerously, and then with a rattle of china and with cakes lurching\n" +
                "off their plates on to the cloth, the table came soaring through the room, gave one graceful turn, and\n" +
                "landed beside them so that Mr. Wigg was at its head. Author@Travers.magic";
        // паттерн поиска в тексте какого-либо выражения, например электронной почты
        Pattern email = Pattern.compile("\\w+@(Pamela|Lyndon|Travers|yandex|gmail)\\.(magic|com|ru)");
        // инструмент работы с текстом
        Matcher matcher = email.matcher(text);
        // метод find() ищет в тексте очередное соответствие установленному паттерну
        while (matcher.find()) {
            // с помощью метода group() выводится найденное значение
            System.out.print(matcher.group(1)); // номер 1 означает id части паттерна помещённой в ()
            System.out.print(" ");
        }
    }
}
