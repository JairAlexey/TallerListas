import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame{
    private JTextField textFieldIngresoNombre;
    private JTextField textFieldEliminarID;
    private JTextField textFieldBuscarID;
    private JButton BtnIngresar;
    private JButton BtnEliminar;
    private JButton BtnBuscar;
    private JButton BtnCalcular;
    private JTextArea textArea1;
    private JPanel JPanelPrincipal;
    private JTextField textFieldNumPag;

    public Interfaz(){

        setContentPane(JPanelPrincipal);

        Biblioteca b = new Biblioteca();

        BtnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.agregarLibro(textFieldIngresoNombre.getText(), Integer.parseInt(textFieldNumPag.getText()));

            }
        });
        BtnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.buscarLibroPorId(Integer.parseInt(textFieldEliminarID.getText()));
            }
        });
        BtnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.calcularTotalPaginas();
            }
        });
        BtnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.eliminarLibroPorId(Integer.parseInt(textFieldEliminarID.getText()));
            }
        });
    }
}
