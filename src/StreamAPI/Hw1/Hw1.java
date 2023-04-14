package StreamAPI.Hw1;
// —ортирует текст и выводит имена из списка с 1 буквой J
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hw1 {
    public static void main(String[] args) {
        String str ="ѕривет реб€та, мен€ сегодн€ не будет позвоню завтра";
        String[] strArr = str.toLowerCase(Locale.ROOT).split(" ");
        Stream <String> stream = Arrays.stream(strArr)
                        .sorted();
        System.out.println(stream.collect(Collectors.toList()));

        List <Person> persons = Data.getList();
                List<Person> persons2 = persons.stream()
                        .filter(person -> person.getName().toLowerCase(Locale.ROOT).startsWith("j"))
                        .collect(Collectors.toList());

        persons2.forEach(System.out::println);

    }
}
