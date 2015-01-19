package org.c2y2.jsoup;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Example1 {
	public static void main(String[] args) throws MalformedURLException, IOException {
		Document doc = Jsoup.parse(new URL("http://www.baidu.com"), 3000);
		System.out.println(doc.html());
	}
}
