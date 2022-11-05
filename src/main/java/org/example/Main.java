package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:" + File.separator + "Users" + File.separator + "smirn" + File.separator + "Desktop" + File.separator + "Транзакции.mhtml");

        try {
            Document document = Jsoup.parse(file);
//            var titleElement = document.body();
//            System.out.println(titleElement.text());

            Elements elements = document.select("h1");
            for (var element : elements) {
                System.out.println(element.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}