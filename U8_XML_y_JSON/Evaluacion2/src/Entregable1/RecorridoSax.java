package Entregable1;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class RecorridoSax {

    public static void main(String[] args) {

        SAXParserFactory spf = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = spf.newSAXParser();

            DefaultHandler libroSax = new LibrosSax();

            saxParser.parse(new File("entregable1.xml"),libroSax);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }

    }

}
