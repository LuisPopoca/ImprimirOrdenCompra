package imprimirordencompragui;

import javax.swing.JOptionPane;

/**
 *
 * @author maryse
 *
 * JOptiionPane
 * Este programa calcula e imprime un reporte de orden de compra.
 *
 */
public class ImprimirOrdenCompraGUI {
    
    static String nombreArticulo; // nombre del artículo comprado
    static double precio; // precio de compra del artículo
    static int cant; // número de elementos comprados

    public void Entras()
    {
        nombreArticulo = JOptionPane.showInputDialog("Nombre del artículo comprado:");
        precio = Double.parseDouble(JOptionPane.showInputDialog("Cantidad:"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));

    }
    
    public void sal(String nombreArticulo,int cant,double precio)
    {
        JOptionPane.showMessageDialog(null, "ORDEN DE COMPRA:\n\n"
                + "Artículo: " + nombreArticulo + "\nCantidad: " + cant
                + "\nPrecio total: $" + precio * cant);
    }
    
    public static void main(String[] args) 
    {
        ImprimirOrdenCompraGUI imp = new ImprimirOrdenCompraGUI();
        imp.Entras();
        imp.sal(nombreArticulo, cant, precio);
    }

}
