package Entregable1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class RecorridoDOM {

    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("entregable1.xml"));

            mostrarXMLDom(doc);



        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }



    }

    public static void numNodosHijos(Document doc, String nombre){

        NodeList nl = doc.getElementsByTagName(nombre);
        System.out.println("En este fichero tengo "+nl.getLength()+" numero de nodos");

        for (int i = 0; i < nl.getLength(); i++) {

            if(nl.item(i).getNodeType() == Node.DOCUMENT_NODE){
                System.out.println("Este nodo "+ nl.item(i) + " es de tipo document");
            } else if (nl.item(i).getNodeType() == Node.ATTRIBUTE_NODE){
                System.out.println("Este nodo "+ nl.item(i) + " es de tipo atributo");
            } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE){
                System.out.println("Este nodo "+ nl.item(i) + " es de tipo comentario");
            }
        }

    }

    public static void mostrarXMLDom(Document doc){

        Element root = doc.getDocumentElement();
        NodeList nodes = root.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            if(nodes.item(i).getNodeType() == Node.ELEMENT_NODE){
               NodeList hijos = nodes.item(i).getChildNodes();
                for (int j = 0; j < hijos.getLength(); j++) {
                    if(hijos.item(j).getNodeType()== Node.ELEMENT_NODE){
                        Element e = (Element) hijos.item(j);
                        System.out.println(e.getTagName());
                        System.out.println(e.getTextContent());
                    }
                }
//                Element e = (Element) nodes.item(i);
//                System.out.println(e.getTagName());
//                System.out.println(e.getTextContent());
            }
        }
    }

    public static void mostrarContenidoEtiqueta (String s, Document doc){

        NodeList nl = doc.getElementsByTagName(s);
        if(nl.getLength() !=0){
            for (int i = 0; i < nl.getLength(); i++) {
                if(nl.item(i).getNodeType() == Node.ELEMENT_NODE){
                    Element e = (Element) nl.item(i);
                    System.out.println(e.getTextContent());
                }
            }
            System.out.println("La etiqueta " + s + " tiene " + nl.getLength() + " ocurrencias.");
        } else {
            System.out.println("La etiqueta " + s + " no tiene ninguna ocurrencias");
        }
    }

}
