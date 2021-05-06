import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
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
import java.util.Scanner;

public class ModificandoDOM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int calorias;
        double precio;
        String nombre, descripcion;

        System.out.println("Vamos a crear un nuevo plato");
        System.out.println("Dame el nombre");
        nombre = sc.nextLine();
        System.out.println("Dame la descripcion");
        descripcion= sc.nextLine();
        System.out.println("Dame el precio en double");
        precio = sc.nextDouble();
        System.out.println("Dame las calorias en int");
        calorias = sc.nextInt();

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("menu.xml"));

            Element root = doc.getDocumentElement();
            NodeList nodes = root.getChildNodes();

            Element comida = doc.createElement("food");
            Element name = doc.createElement("name");
            name.setTextContent(nombre);
            Element description = doc.createElement("description");
            description.setTextContent(descripcion);
            Element price = doc.createElement("price");
            price.setTextContent(Double.toString(precio));
            Element calories = doc.createElement("calories");
            calories.setTextContent(Integer.toString(calorias));

            comida.appendChild(name);
            comida.appendChild(description);
            comida.appendChild(price);
            comida.appendChild(calories);

            root.appendChild(comida);


            for (int i = 0; i < nodes.getLength(); i++){

                if(nodes.item(i).getNodeType()== Node.ELEMENT_NODE){

                    Element nueva_etiqueta = doc.createElement("healthy");
                    nueva_etiqueta.setTextContent("true");
                    nodes.item(i).appendChild(nueva_etiqueta);
                }

            }

            volcar(doc);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }


    }

    public static void volcar (Document doc){
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            Element root = doc.getDocumentElement();
            DOMSource origen = new DOMSource(root);

            File nuevo = new File("ejercicio2.xml");
            StreamResult destino = new StreamResult(nuevo);

            transformer.transform(origen, destino);

        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }


}
