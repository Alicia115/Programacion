import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ModificarDOM {

    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("biblioteca.xml"));

            addLibro(doc);
            addNodo(doc);
            volcar(doc);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }

    }

    public static void addLibro (Document doc){

        Scanner sc = new Scanner(System.in);
        String titulo,autor,editorial;
        int paginas;
        System.out.println("Digame el titulo del libro a intrdocir");
        titulo= sc.nextLine();
        System.out.println("Digame el autor del libro a intrdocir");
        autor= sc.nextLine();
        System.out.println("Digame el editorial del libro a intrdocir");
        editorial= sc.nextLine();
        System.out.println("Digame el numero de paginas del libro a intrdocir");
        paginas= sc.nextInt();

        Element root = doc.getDocumentElement();
        Element libro = doc.createElement("libro");
        Element tituloLibro = doc.createElement("titulo");
        tituloLibro.setTextContent(titulo);
        Element autorLibro = doc.createElement("autor");
        autorLibro .setTextContent(autor);
        Element editorialLibro = doc.createElement("editorial");
        editorialLibro.setTextContent(editorial);
        Element paginasLibro = doc.createElement("paginas");
        paginasLibro.setTextContent(Integer.toString(paginas));

        libro.appendChild(tituloLibro);
        libro.appendChild(autorLibro);
        libro.appendChild(editorialLibro);
        libro.appendChild(paginasLibro);
        root.appendChild(libro);
    }

    public static void addNodo (Document doc){

        NodeList nl = doc.getChildNodes();

        for (int i = 0; i < nl.getLength(); i++) {
            Node nodo = nl.item(i);

            if(nodo.getNodeType()==Node.ELEMENT_NODE){

                if(nodo.hasChildNodes()){

                    NodeList hijos = nodo.getChildNodes();

                    for (int j = 0; j < hijos.getLength(); j++) {
                        Node nodoHijos = hijos.item(j);
                        if(nodoHijos.getNodeType()== Node.ELEMENT_NODE){
                            Element pais = doc.createElement("pais");
                            pais.setTextContent("Alemania");
                            nodoHijos.appendChild(pais);
                        }
                    }
                }
            }
        }
    }


    public static void volcar(Document doc){

        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            Element root = doc.getDocumentElement();
            DOMSource origen = new DOMSource(root);
            File newFile = new File("bibliotecaNuevo.xml");
            StreamResult destino = new StreamResult(newFile);

            transformer.transform(origen,destino);


        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }



}
