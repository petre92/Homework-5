import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Ee_ge3 extends ChromeRunner {

    @Test
    public void ThirdAutoTest() {
        //ტესტ მეთოდი 3

        $(byId("rcc-confirm-button")).click();


        $(byClassName("cart-count")).click();
        $(byText("კალათა ცარიელია")).shouldBe(visible);
        sleep(2000);

        $(byId("search_list")).setValue("lenovo");
        $(byClassName("fa-search")).click();
        sleep(2000);


        ElementsCollection collection = $$(byClassName("fa-shopping-cart"));
        int count = collection.size();
        for (int i = 0; i < count; i++) ;
        $(byClassName("fa-shopping-cart"), 0).click();
        sleep(2000);

        $(byClassName("cart-count")).click();
        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible);
        sleep(2000);

        $(byText("წაშლა")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        sleep(2000);
    }
}
