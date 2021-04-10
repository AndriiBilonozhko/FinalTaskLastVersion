package blocks;

import lombok.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Language {

    private WebElement LanguageName;


    public Language() {
    }

    public Language(WebElement container) {

        this.LanguageName = container.findElement(By.xpath(".//ul[contains(@class,'dropdown')]/li"));


    }
    public List<Language> getLanguages(List<WebElement> containers) {
        List<Language> allLanguage  = new ArrayList<>();
        for (WebElement container : containers) {
            allLanguage.add(new Language(container));
        }
        return allLanguage;
    }
}
