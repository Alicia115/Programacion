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
            Document doc = db.parse(new File("menu.xml"));

           mostrarXML(doc);
           cantidadDePlatos(doc);
           platoMasCaro(doc);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }


    }

    public static void mostrarXML (Document doc){

        Element root = doc.getDocumentElement();
        NodeList nodes = root.getChildNodes();
        System.out.println("<"+root.getTagName()+">");
        for (int i = 0; i < nodes.getLength(); i++) {

            if(nodes.item(i).getNodeType()== Node.ELEMENT_NODE){
                Element e = (Element) nodes.item(i);
                System.out.println("<"+e.getTagName()+">");
                NodeList hijos = nodes.item(i).getChildNodes();
                for (int j = 0; j < hijos.getLength(); j++) {

                    if(hijos.item(j).getNodeType()==Node.ELEMENT_NODE){

                        Element a = (Element) hijos.item(j);
                        System.out.print("<"+a.getTagName()+">");
                        System.out.print(a.getTextContent());
                        System.out.print("</"+a.getTagName()+">");
                        System.out.println("");
                    }

                }
                System.out.println("</"+e.getTagName()+">");
                System.out.println("");
            }
        }
        System.out.println("</"+root.getTagName()+">");
    }


    public static void cantidadDePlatos(Document doc){

        NodeList nl = doc.getElementsByTagName("food");
        System.out.println("");
        System.out.println("La carta tiene "+ nl.getLength()+ " número de platos");

    }

    public static void platoMasCaro(Document doc) {

        Element root = doc.getDocumentElement();
        NodeList nodes = root.getChildNodes();

        double mayor =0;
        double valor;
        String nombre ="";
        String nombre_actual = "";

        for (int i = 0; i < nodes.getLength(); i++) {

            if(nodes.item(i).getNodeType()== Node.ELEMENT_NODE){
                NodeList hijos = nodes.item(i).getChildNodes();

                for (int j = 0; j < hijos.getLength(); j++) {

                    if(hijos.item(j).getNodeType()==Node.ELEMENT_NODE){
                        Element x = (Element) hijos.item(j);
                        if(x.getTagName().equals("name")){
                            nombre_actual = x.getTextContent();
                        }
                        if(x.getTagName().equals("price")){

                            valor = Double.valueOf(x.getTextContent());

                            if (mayor < valor){
                                nombre = nombre_actual;
                                mayor = valor;
                            }
                        }

                    }
                }
            }
        }

        System.out.println("El plato más caro es " +nombre+ " con un valor de " +mayor);
    }

}
