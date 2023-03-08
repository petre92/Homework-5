import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Ee_ge extends ChromeRunner {

    @Test
    public void FirstAutoTest() {
        $(byId("rcc-confirm-button")).click();
        $(byText("რეგისტრაცია")).click();

        SoftAssert softAssert = new SoftAssert();
        SelenideElement header = $(byText("სწრაფი რეგისტრაცია"));
        softAssert.assertTrue(header.is(visible));

        $(byText("სწრაფი რეგისტრაცია")).shouldBe(visible);
        $(byId("firstName")).setValue("Peter").shouldNotBe(Condition.empty);
        $(byId("lastName")).setValue("Pan").shouldNotBe(Condition.empty);
        $(byId("email")).setValue("peterpan@peter.ge").shouldNotBe(Condition.empty);
        $(byId("password")).setValue("qwerty1").shouldNotBe(Condition.empty);
        $(byId("confirmPassword")).setValue("qwerty1").shouldNotBe(Condition.empty);
        $(byId("singup")).shouldBe(visible);
        sleep(2000);
    }
}
