import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Ee_ge2 extends ChromeRunner {

    @Test
    public void SecondtAutoTest() {
        $(byId("rcc-confirm-button")).click();
        $(byText("რეგისტრაცია")).click();

        $(byText("სწრაფი რეგისტრაცია")).shouldBe(visible);
        $(byId("singup")).shouldBe(Condition.disabled);
        $(byId("firstName")).click();
        $(byId("lastName")).click();
        $(byId("email")).click();
        $(byId("password")).click();
        $(byId("confirmPassword")).click();
        $(byId("password")).click();

        $(byText("სახელი სავალდებულოა")).shouldBe(visible);
        $(byText("გვარი სავალდებულოა")).shouldBe(visible);
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(visible);
        $(byText("პაროლი სავალდებულოა.")).shouldBe(visible);
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(visible);
        sleep(2000);


        $(byId("email")).setValue("peterpan#peter.ge").shouldNotBe(Condition.empty);
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(visible);

        $(byId("password")).setValue("qwert").shouldNotBe(Condition.empty);
        $(byText("პაროლი სავალდებულოა.")).shouldBe(visible);

        $(byId("confirmPassword")).setValue("qwerty1").shouldNotBe(Condition.empty);
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(visible);

        sleep(2000);
    }

}
