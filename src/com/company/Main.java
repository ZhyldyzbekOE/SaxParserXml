package com.company;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import org.xml.sax.InputSource;
import java.net.URISyntaxException;
import java.net.URL;

public class Main{


    public static void main(String[] args) throws ParserConfigurationException, SAXException, URISyntaxException, IOException {
        SAXParserFactory saxParser = SAXParserFactory.newInstance();
        SAXParser saxParser1 = saxParser.newSAXParser();
        GeoPlugin saxParser2 = new GeoPlugin();
        URL url2 = new URL("http://www.geoplugin.net/xml.gp?base_currency=USD");
        saxParser1.parse(new InputSource(url2.openStream()),saxParser2);


    }
}







