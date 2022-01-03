import java.util.Arrays;

public class Account {

    private final String[] name;

    public Account(String[] name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        String name_str = Arrays.toString(name).replace( "]", "").replace("[", "");
        int len = name_str.length();
        int len_trim = name_str.length();
        int spaces = name_str.length() - name_str.replace(" ", "").length();
        if (len >= 3 & len <= 19 & len == len_trim & spaces == 1) {
            return true;
        } else return false;
    }
}