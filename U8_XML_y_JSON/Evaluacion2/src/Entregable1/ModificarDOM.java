package Entregable1;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {

    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("entregable1.xml"));

            addComentario(doc);



        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }


    }

    public static void addComentario (Document doc){

        Element root = doc.getDocumentElement();
        NodeList nodes = root.getChildNodes();

        for (int i = 0; i < nodes.getLength(); i++) {
            if(nodes.item(i).getNodeType() == Node.ELEMENT_NODE){
                Comment comentario = doc.createComment("<!-- COMENTARIO AÑADIDO DESDE DOM --> ");
                root.insertBefore(comentario, nodes.item(i));
            }
        }
    }

    public static void addEtiqueta (Document doc){
        Element root = doc.getDocumentElement();

        Element e = doc.createElement("librito");
        root.appendChild(e);
    }

    public static void addNodo (Document doc){

        Element root = doc.getDocumentElement();
        NodeList nl = root.getChildNodes();

        Element e = doc.createElement("cuaderno");
        root.replaceChild(e, nl.item(0));
    }


    public static void volcar (Document doc){

        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            Element root = doc.getDocumentElement();
            DOMSource origen = new DOMSource(root);

            File nuevo = new File("nuevoXML.xml");
            StreamResult destino = new StreamResult(nuevo);

            transformer.transform(origen, destino);

        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

}
