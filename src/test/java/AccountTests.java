import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTests {
    private final String name;
    private final boolean expected;

    public AccountTests(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {" Тимоти Шаламе", false},
                {"Тимоти Шаламе ", false},
                {"ТимотейШевроле", false},
                {"Т м", true},
                {"Тимоти Шаламеееееее", true},
                {"Тимоти Шаламееееееее", false},
                {"Тим оти Шал аме", false},
                {" ТимотиШаламе", false},
                {"Ти", false},
                {"", false},
                {"", false},
                {null, false},
        };
    }

        @Test
        public void accountTest () {
            Account account = new Account(new String[]{name});
            boolean actual = account.checkNameToEmboss();
            assertEquals(expected, actual);
        }

}
