package model;

import model.Registrable;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Pantalla extends JFrame
{
    // Se implementa una colección poliforme en blanco, para ir almacenando las entradas de la GUI:
    private ArrayList<ServicioTuristico> servicioTuristico =  new ArrayList<>();

    // Lista para agregar valores al JComboBox:
    private JComboBox<String> comboTipo;
    private JPanel panelDinamico;

    // Se implementa un "JTextArea" como atributo:
    private JTextArea areaTexto;

    // Se implementan JTextField privados para almacenar valores:
    private JTextField textNombre;
    private JTextField textDuracionEnHoras;
    private JTextField textTipoDeEmbarcacion;
    private JTextField textParadas;
    private JTextField textLugarHistorico;

    // Se implementa una ventana para ingresar nuevos Tours:
    public Pantalla()
    {
        Font fuenteGeneral = new Font("Segoe UI", Font.PLAIN, 16);

        // Se crea un JFrame
        setTitle("Sistema de Gestión de Llanquihue Tours");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Se crea un JPanel Principal
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Se crea un menú desplegable tipo JComboBox:
        String[] opciones = {"Paseo Lacustre", "Ruta Gastronómica", "Excursión Cultural"};
        comboTipo = new JComboBox<>(opciones);
        comboTipo.setFont(fuenteGeneral);

        // Se agrega una etiqueta a la izquierda del JcomboBox
        JLabel lblTipo = new JLabel("Tipo:");
        lblTipo.setForeground(Color.BLACK);
        lblTipo.setFont(new Font("Arial", Font.BOLD, 16));

        // Agregar un Título al centro:
        JLabel tituloCentro = new JLabel("🌄 Llanquihue Tour App Herencia Polimorfismo 🌄");
        tituloCentro.setFont(new Font("Sugoi", Font.BOLD, 22));
        tituloCentro.setForeground(Color.BLACK); // si tu fondo es oscuro
        tituloCentro.setHorizontalAlignment(SwingConstants.CENTER);

        // Se crea un Jpanel para la parte superior de la ventana:
        JPanel topPanel = new JPanel(new BorderLayout(10, 10));
        topPanel.setBackground(new Color(180, 220, 180));

        // Se crea un JPanel izquierdo y se le agrega la equiqueta y el JComboBox:
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leftPanel.setBackground(new Color(255, 180, 180));
        leftPanel.add(lblTipo);
        leftPanel.add(comboTipo);

        // Se crea un JPanel derecho y se le agregan cuatro botones:
        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rightPanel.setBackground(new Color(255, 180, 180));

        JButton btn1 = new JButton("Agregar");
        btn1.setFont(fuenteGeneral);
        btn1.setBackground(new Color(255, 255, 245));
        JButton btn2 = new JButton("Editar");
        btn2.setFont(fuenteGeneral);
        btn2.setBackground(new Color(255, 255, 245));
        JButton btn3 = new JButton("Eliminar");
        btn3.setFont(fuenteGeneral);
        btn3.setBackground(new Color(255, 255, 245));
        JButton btn4 = new JButton("Mostrar resumen");
        btn4.setFont(fuenteGeneral);
        btn4.setBackground(new Color(255, 255, 245));

        rightPanel.add(btn1);
        rightPanel.add(btn2);
        rightPanel.add(btn3);
        rightPanel.add(btn4);

        topPanel.add(leftPanel, BorderLayout.WEST);
        topPanel.add(rightPanel, BorderLayout.EAST);
        topPanel.add(tituloCentro, BorderLayout.CENTER);

        // Panel donde se agregarán los campos dinámicos
        panelDinamico = new JPanel();
        panelDinamico.setLayout(new GridBagLayout());
        panelDinamico.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelDinamico.setBackground(new Color(180, 220, 180));

        // Agregar listener al ComboBox
        comboTipo.addActionListener(e -> actualizarCampos());

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(panelDinamico), BorderLayout.CENTER);
        mainPanel.setBackground(new Color(180, 220, 180));

        // Se implementa un JTextArea:
        areaTexto = new JTextArea(5, 30);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setBackground(new Color(255, 250, 235));

        // Se agrega el JPanel principal al JFrame:
        add(mainPanel);

        // Mostrar campos iniciales
        actualizarCampos();

        // Se implementa FUNCIONALIDAD A LOS BOTONES
        btn1.addActionListener(e -> agregarTour());
        btn2.addActionListener(e -> editarTour());
        btn3.addActionListener(e -> eliminarTour());
        btn4.addActionListener(e -> mostrarResumen());
    }
    private void agregarCampo(String labelText, JTextField textField, int fila)
    {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3, 5, 3, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Label
        gbc.gridx = 0;
        gbc.gridy = fila;
        gbc.weightx = 0.0;
        panelDinamico.add(new JLabel(labelText), gbc);

        // TextField
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        textField.setPreferredSize(new Dimension(250, 24));
        textField.setMinimumSize(new Dimension(100, 24));
        textField.setMaximumSize(new Dimension(500, 24));
        panelDinamico.add(textField, gbc);
    }

    // Se implenta un método para ajustar el tamaño del JTextArea:
    private void agregarAreaTexto(int fila) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = fila;
        gbc.anchor = GridBagConstraints.NORTHWEST;

        panelDinamico.add(new JLabel("Descripción del Tour:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        JScrollPane scroll = new JScrollPane(areaTexto);
        scroll.setPreferredSize(new Dimension(250, 100));

        panelDinamico.add(scroll, gbc);
    }

    // Se implementa un método para actualizar el JtextField según la selección del JComboBox:
    private void actualizarCampos() {
        String seleccion = (String) comboTipo.getSelectedItem();
        panelDinamico.removeAll(); // Limpiar campos anteriores
        int fila = 0;

        switch (seleccion) {
            case "Paseo Lacustre":
                agregarPaseoLacustre();
                fila = 3;
                break;
            case "Excursión Cultural":
                agregarExcursionCultural();
                fila = 3;
                break;
            case "Ruta Gastronómica":
                agregarRutaGastronomica();
                fila = 3;
                break;
        }
        // Agregar el JTextArea:
        agregarAreaTexto(fila);
        areaTexto.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        // Actualizar la interfaz
        panelDinamico.revalidate();
        panelDinamico.repaint();
    }

    // Se agregan estos campos "JTextField" si se selecciona Paseo Lacustre en el JComboBox:
    private int agregarPaseoLacustre()
    {
        int fila = 0;
        textNombre = new JTextField();
        agregarCampo("Nombre:", textNombre, fila++);

        textDuracionEnHoras = new JTextField();
        agregarCampo("Duración en horas:", textDuracionEnHoras, fila++);

        textTipoDeEmbarcacion = new JTextField();
        agregarCampo("Tipo de embarcación:", textTipoDeEmbarcacion, fila++);

        return fila;
    }

    // Se agregan estos campos "JTextField" si se selecciona Excursión Cultural en el JComboBox:
    private int agregarExcursionCultural()
    {
        int fila = 0;
        textNombre = new JTextField();
        agregarCampo("Nombre:", textNombre, fila++);

        textDuracionEnHoras = new JTextField();
        agregarCampo("Duración en horas:", textDuracionEnHoras, fila++);

        textLugarHistorico = new JTextField();
        agregarCampo("Lugar histórico:", textLugarHistorico, fila++);

        return fila;
    }

    // Se agregan estos campos "JTextField" si se selecciona Ruta Gastronómica en el JComboBox:
    private int agregarRutaGastronomica()
    {
        int fila = 0;
        textNombre = new JTextField();
        agregarCampo("Nombre:", textNombre, fila++);

        textDuracionEnHoras = new JTextField();
        agregarCampo("Duración en horas:", textDuracionEnHoras, fila++);

        textParadas = new JTextField();
        agregarCampo("Paradas:", textParadas, fila++);

        return fila;
    }

    // Se implementa un método para crear nuevos objetos y almacenarlos en una colección polimórfica:
    private void agregarTour()
    {
        String tipo = (String) comboTipo.getSelectedItem();
        String nombre = textNombre.getText();
        String duracionStr = textDuracionEnHoras.getText();

        if (nombre.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El campo 'nombre' no puede quedar vacío");
            return;
        }

        if  (duracionStr.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El campo 'duracion' no puede quedar vacío");
            return;
        }
        double duracion;
        try
        {
            duracion = Double.parseDouble(duracionStr);
            if (duracion < 1 || duracion > 24)
            {
                JOptionPane.showMessageDialog(this, "La duración debe estar entre 1 y 24");
                return;
            }
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "La duración debe ser un número válido.");
            return;
        }
        ServicioTuristico tour = null;
        switch (tipo)
        {
            case "Paseo Lacustre":
                String embarcacion = textTipoDeEmbarcacion.getText();
                if (embarcacion.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Debe ingresar una embarcación en el campo respectivo");
                }
                tour = new PaseoLacustre(nombre, duracion, embarcacion);
                break;
            case "Excursión Cultural":
                String lugarHistorico = textLugarHistorico.getText();
                if (lugarHistorico.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Debe ingresar un lugar a visitar en el campo respectivo");
                }
                tour = new ExcursionCultural(nombre, duracion, lugarHistorico);
                break;
            case "Ruta Gastronómica":
                String paradasStr = textParadas.getText().trim();

                if (paradasStr.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe ingresar la cantidad de paradas.");
                    return;
                }
                int paradas;
                try
                {
                    paradas = Integer.parseInt(paradasStr);
                    if (paradas <= 0)
                    {
                        JOptionPane.showMessageDialog(this, "Las paradas deben ser mayores a 0.");
                        return;
                    }
                }
                catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(this, "Las paradas deben ser un número entero.");
                    return;
                }
                tour = new RutaGastronomica(nombre, duracion, paradas);
        }
        servicioTuristico.add(tour);

        areaTexto.append(tour.toString() + "\n");
        areaTexto.append("\n");
        JOptionPane.showMessageDialog(this, "Tour agregado correctamente");
    }

    private void editarTour()
    {
        String tipo = (String) comboTipo.getSelectedItem();
        String nombre = textNombre.getText();
        String duracionStr = textDuracionEnHoras.getText();

        if (nombre.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El campo 'nombre' no puede quedar vacío");
            return;
        }

        if  (duracionStr.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El campo 'duracion' no puede quedar vacío");
            return;
        }
        double duracion;
        try
        {
            duracion = Double.parseDouble(duracionStr);
            if (duracion < 1 || duracion > 24)
            {
                JOptionPane.showMessageDialog(this, "La duración debe estar entre 1 y 24");
                return;
            }
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "La duración debe ser un número válido.");
            return;
        }
        ServicioTuristico tourEncontrado = null;

        // Buscar el tour por nombre:
        for (ServicioTuristico t : servicioTuristico)
        {
            if(t.getNombre().trim().equalsIgnoreCase(nombre))
            {
                tourEncontrado = t;
                break;
            }
        }
        if (tourEncontrado == null)
        {
            JOptionPane.showMessageDialog(this, "No existe un tour con ese nombre");
            return;
        }
        // Editar según el tipo
        switch (tipo)
        {
            case "Paseo Lacustre":
                String embarcacion = textTipoDeEmbarcacion.getText();
                if (embarcacion.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Debe ingresar el nombre de la embarcación");
                    return;
                }
                ((PaseoLacustre) tourEncontrado).setDuracionHoras(duracion);
                ((PaseoLacustre) tourEncontrado).setTipoEmbarcacion(embarcacion);
                break;

            case "Excursión Cultural":
                String lugarHistorico = textLugarHistorico.getText();
                if (lugarHistorico.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Debe ingresar un lugar para visitar");
                    return;
                }
                ((ExcursionCultural) tourEncontrado).setDuracionHoras(duracion);
                ((ExcursionCultural) tourEncontrado).setLugarHistorico(lugarHistorico);
                break;

            case "Ruta Gastronómica":
                String paradasStr = textParadas.getText().trim();

                if (paradasStr.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe ingresar la cantidad de paradas.");
                    return;
                }
                int paradas;
                try
                {
                    paradas = Integer.parseInt(paradasStr);
                    if (paradas <= 0)
                    {
                        JOptionPane.showMessageDialog(this, "Las paradas deben ser mayores a 0.");
                        return;
                    }
                }
                catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(this, "Las paradas deben ser un número entero.");
                    return;
                }
                ((RutaGastronomica) tourEncontrado).setDuracionHoras(duracion);
                ((RutaGastronomica) tourEncontrado).setParadas(paradas);
                break;
        }
        actualizarAreaTexto();
        JOptionPane.showMessageDialog(this, "Tour editado correctamente");
    }

    // Método que se utiliza para eliminar el último registro de la lista:
    private void eliminarTour()
    {
        if (servicioTuristico.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No existe un tour con ese nombre");
            return;
        }
        servicioTuristico.remove(servicioTuristico.size()-1);
        JOptionPane.showMessageDialog(this, "Tour eliminado correctamente");
        actualizarAreaTexto();
    }

    private void mostrarResumen()
    {
        if (servicioTuristico.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No existe un tours guardados en la lista");
            return;
        }
        areaTexto.setText("");
        for (ServicioTuristico t : servicioTuristico)
        {
            areaTexto.append("-----------------------------------------------" + "\n");
            if (t instanceof PaseoLacustre)
            {
                PaseoLacustre lacustre = (PaseoLacustre) t;
                areaTexto.append("→ esto es un paseo lacustre." + "\n");
                areaTexto.append(lacustre.toString() + "\n");
                areaTexto.append(lacustre.mostrarResumen() + "\n");
            }
            else if (t instanceof ExcursionCultural)
            {
                ExcursionCultural excursion = (ExcursionCultural) t;
                areaTexto.append("→ esto es una excursión cultural️." + "\n");
                areaTexto.append(excursion.toString() + "\n");
                areaTexto.append(excursion.mostrarResumen() + "\n");
            }
            else if (t instanceof RutaGastronomica)
            {
                RutaGastronomica gastronomica = (RutaGastronomica) t;
                areaTexto.append("→ esto es una ruta gastronómica." + "\n");
                areaTexto.append(gastronomica.toString() + "\n");
                areaTexto.append(gastronomica.mostrarResumen() + "\n");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No existe un tour con ese nombre");
            }
        }
    }

    // Método que sirve para actualizar el JTextArea:
    private void actualizarAreaTexto()
    {
        areaTexto.setText(""); // limpiar

        for (ServicioTuristico t : servicioTuristico) {
            areaTexto.append(t.toString() + "\n");
        }
    }
}
