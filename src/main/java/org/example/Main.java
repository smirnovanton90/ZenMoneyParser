package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.ozon.ru/category/lopatka-dlya-lotka/");
        for (int i = 2; i <= 6; i++) {
            WebElement pageButton = webDriver.findElement(By.xpath("//*[@id=\"layoutPage\"]/div[1]/div[2]/div[2]/div[2]/div[6]/div[2]/div/div[1]/div[1]/a[" + i + "]"));
            pageButton.click();
            Thread.sleep(10000);
        }

        webDriver.quit();

////        File file = new File("C:" + File.separator + "Users" + File.separator + "smirn" + File.separator + "Desktop" + File.separator + "Транзакции.mhtml");
//        String url = "https://javarush.ru/groups/posts/1086-3-primera-kak-razobratjh-html-fayl-v-java-ispoljhzuja-jsoup";
//
//        try {
//            Document document = Jsoup
//                    .connect(url)
////                    .referrer("http://www.google.com")
////                    .userAgent("Mozilla")
//                    .get();
////            Document document = Jsoup.parse(file);
//            String title = document.title();
//            System.out.println(title);
//
////            Elements elements = document.select("h1");
////            for (var element : elements) {
////                System.out.println(element.text());
////            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}