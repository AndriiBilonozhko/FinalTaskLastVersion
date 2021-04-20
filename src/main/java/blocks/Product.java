package blocks;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Product {

    private WebElement name;
    private WebElement price;
    private WebElement productName;


    public Product() {
    }

    public Product(WebElement container) {

        this.name = container.findElement(By.xpath(".//a[@itemprop='url']"));
        this.price = container.findElement(By.xpath(".//span[@class='price']"));
        this.productName = container.findElement(By.xpath(".//div[@itemprop='itemListElement']"));
    }

    public List<Product> getProduct(List<WebElement> containers) {
        List<Product> allProduct = new ArrayList<>();
        for (WebElement container : containers) {
            allProduct.add(new Product(container));
        }
        return allProduct;
    }


}