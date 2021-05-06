import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoStax {

    public static void main(String[] args) {


        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("menu.xml"));

            int contador=0;
            int suma=0;
            String tagActual="";

            while (xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()){

                    StartElement startTag = xmlEvent.asStartElement();

                     if (startTag.getName().getLocalPart().equals("food")) {
                        contador++;
                    }

                     if (startTag.getName().getLocalPart().equals("calories")){
                         tagActual="calories";
                     }


                }else if (xmlEvent.isEndElement()){

                    EndElement endtag = xmlEvent.asEndElement();
                    if (endtag.getName().getLocalPart().equals("calories")) {
                        tagActual = "";
                    }


                }else if (xmlEvent.isStartDocument()){

                    System.out.println("Comienzo del parseado del documento");

                } else if (xmlEvent.isEndDocument()) {
                    System.out.println("Fin del parseado del documento");

                } else if (xmlEvent.isCharacters()){
                    Characters texto = xmlEvent.asCharacters();

                    if(tagActual.equals("calories")){
                        suma += Double.valueOf(texto.getData()) ;
                    }



                }

            }


            System.out.println("Este menú incluye "+contador+ " numero de platos");
            System.out.println("Las calorias totales por pedir un plato de cada en el mebú es "+suma);


        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
