import org.w3c.dom.Text;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecorridoStax {

    public static void main(String[] args) {


        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("biblioteca.xml"));

           Scanner sc = new Scanner(System.in);
            String autor;
            System.out.println("Dame el autor del que quieras saber el numero de libros que posee");
            autor = sc.nextLine();

            int num_pagina = 0, mayor=0;
            int num_libros=0;
            String tagActual="";
            String tagPaginas="";
            String titulo = "";
            String author = "";
            String editorial = "";
            String libro = "";

            while(xmlReader.hasNext()){

                XMLEvent xmlEvent = xmlReader.nextEvent();

                if(xmlEvent.isStartElement()){

                    StartElement startTag = xmlEvent.asStartElement();

                    if (startTag.getName().getLocalPart().equals("autor")){
                        tagActual= "autor";
                        author = "autor";
                    }

                    if(startTag.getName().getLocalPart().equals("libro")){
                        libro = "libro";
                    }

                    if(startTag.getName().getLocalPart().equals("editorial")){
                        editorial = "autor";
                    }

                    if(startTag.getName().getLocalPart().equals("paginas")){
                        tagPaginas = "paginas";
                    }


                } else if(xmlEvent.isEndElement()){

                    EndElement endTag = xmlEvent.asEndElement();

                    if (endTag.getName().getLocalPart().equals("autor")){
                        author="";
                    }

                    if (endTag.getName().getLocalPart().equals("libro")){
                        libro="";
                    }

                    if (endTag.getName().getLocalPart().equals("editorial")){
                        editorial="";
                    }

                    if(endTag.getName().getLocalPart().equals("paginas")){
                        tagPaginas="";
                    }

                } else if(xmlEvent.isStartDocument()){

                    System.out.println("Empieza el parseado del documento");

                } else if(xmlEvent.isEndDocument()){

                    System.out.println("Acaba el parseado del documento");

                } else if (xmlEvent.isCharacters()){

                    Characters texto = xmlEvent.asCharacters();

                    if(tagActual.equals("autor")){

                        if(texto.getData().equals(autor)){
                            num_libros++;
                        }

                        author.equals(texto.getData());

                    }

                    if(tagPaginas.equals("paginas")){

                        num_pagina = Integer.valueOf(texto.getData());

                    }

                    if(libro.equals("libro")){
                        libro.equals(texto.getData());
                    }

                    if(mayor<num_pagina){
                        mayor = num_pagina;

                    }



                }


            }

            System.out.println("El autor " + autor+ " tiene un total de "+num_libros+ " libros");
            System.out.println("El libro con mayor numero de paginas es "+ libro+ author+" con " +mayor +" numero de paginas");



        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
