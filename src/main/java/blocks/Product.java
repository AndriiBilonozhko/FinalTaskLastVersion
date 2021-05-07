package blocks;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Product {

    private WebElement name;
    private double oldPrice;
    private WebElement oldPriceWe;
    private WebElement newPriceWe;
    private double newPrice;
    private WebElement discountWe;
    private double discount;

    public Product() {
    }

    public Product(WebElement container) {

        this.name = container.findElement(By.xpath(".//a[@itemprop='url']"));
        this.newPriceWe = container.findElement(By.xpath(".//span[@class='price']"));
        this.newPrice = Double.parseDouble(container.findElement(By.xpath(".//span[@class='price']")).getText().replace("€", ""));
        this.oldPrice = Double.parseDouble(container.findElement(By.xpath(".//span[@class='regular-price']")).getText().replace("€", ""));
        this.oldPriceWe = container.findElement(By.xpath(".//span[@class='regular-price']"));
        this.discountWe = container.findElement(By.xpath(".//li[@class='product-flag discount']"));
        this.discount = Double.parseDouble(container.findElement(By.xpath(".//li[@class='product-flag discount']")).getText().replace("-", "").substring(0, 2));
    }

    public static List<Product> getProduct(List<WebElement> containers) {
        List<Product> allProduct = new ArrayList<>();
        for (WebElement container : containers) {
            allProduct.add(new Product(container));
        }
        return allProduct;
    }


}