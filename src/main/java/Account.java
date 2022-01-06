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

        String nameStr = Arrays.toString(name).replace( "]", "").replace("[", "");
        int len = nameStr.length();
        int lenTrim = nameStr.trim().length();
        int spaces = nameStr.length() - nameStr.replace(" ", "").length();
        if (len >= 3 && len <= 19 && len == lenTrim && spaces == 1) {
            return true;
        } else return false;
    }

}