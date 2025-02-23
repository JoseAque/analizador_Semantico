/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package analizador_semántico;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author aquek
 */
public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JText = new javax.swing.JTextArea();
        JLEntrada = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableErrores = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableSimbolos = new javax.swing.JTable();
        JLSimbolos = new javax.swing.JLabel();
        JLErrores = new javax.swing.JLabel();
        JBAnalizar = new javax.swing.JButton();
        JBLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Semántico");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1132, 590));
        setMinimumSize(new java.awt.Dimension(1132, 590));
        setResizable(false);

        JText.setBackground(new java.awt.Color(255, 255, 255));
        JText.setColumns(20);
        JText.setRows(5);
        jScrollPane1.setViewportView(JText);

        JLEntrada.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLEntrada.setText("Entrada");

        JTableErrores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Token Error", "Lexema", "Línea", "Descripción"
            }
        ));
        jScrollPane2.setViewportView(JTableErrores);

        JTableSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lexema", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(JTableSimbolos);

        JLSimbolos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLSimbolos.setText("Símbolos");

        JLErrores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLErrores.setText("Errores");

        JBAnalizar.setText("Analizar");
        JBAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAnalizarActionPerformed(evt);
            }
        });

        JBLimpiar.setText("Limpiar");
        JBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(JLEntrada)
                .addGap(196, 196, 196)
                .addComponent(JLSimbolos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLErrores)
                .addGap(252, 252, 252))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEntrada)
                    .addComponent(JLSimbolos)
                    .addComponent(JLErrores))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(JBAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(1148, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarActionPerformed
        // Limpiar el JText
        JText.setText("");

        // Limpiar la Tabla de Símbolos
        DefaultTableModel modeloSimb = (DefaultTableModel) JTableSimbolos.getModel();
        modeloSimb.setRowCount(0);

        // Limpiar la Tabla de Errores
        DefaultTableModel modeloErr = (DefaultTableModel) JTableErrores.getModel();
        modeloErr.setRowCount(0);
    }//GEN-LAST:event_JBLimpiarActionPerformed

    private void JBAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAnalizarActionPerformed
// Limpiar solo las tablas, no el JText
        DefaultTableModel modeloSimb = (DefaultTableModel) JTableSimbolos.getModel();
        modeloSimb.setRowCount(0); // Limpiar la Tabla de Símbolos

        DefaultTableModel modeloErr = (DefaultTableModel) JTableErrores.getModel();
        modeloErr.setRowCount(0); // Limpiar la Tabla de Errores

        TableColumnModel columnModel = JTableErrores.getColumnModel();
        columnModel.getColumn(0).setMinWidth(100);
        columnModel.getColumn(0).setMaxWidth(100);
        columnModel.getColumn(1).setMinWidth(100);
        columnModel.getColumn(1).setMaxWidth(100);
        columnModel.getColumn(2).setMinWidth(60);
        columnModel.getColumn(2).setMaxWidth(60);

// Obtener el texto del JText
        String texto = JText.getText();
        String[] lineas = texto.split("\n");

// Variables para el análisis
        int numError = 1; // Contador de errores
        java.util.Map<String, String> tablaVariables = new java.util.HashMap<>(); // Almacena variables y sus tipos

// Recorrer cada línea del texto para procesar declaraciones
        for (int i = 0; i < lineas.length; i++) {
            String linea = lineas[i].trim();

            // Identificar declaraciones de variables
            if (linea.startsWith("ent->") || linea.startsWith("rea->") || linea.startsWith("cad->")) {
                String tipo = linea.substring(0, 3); // "ent->", "rea->", "cad->"
                String[] partes = linea.substring(5).replace(";", "").split(",");

                // Añadir la palabra reservada a la tabla de símbolos (sin tipo)
                modeloSimb.addRow(new Object[]{tipo + "->", ""});

                // Procesar cada variable declarada
                for (String var : partes) {
                    var = var.trim();
                    if (var.matches("[a-zA-Zá-úÁ-Ú][a-zA-Z0-9á-úÁ-Ú]*")) {
                        // Añadir a la tabla de símbolos
                        modeloSimb.addRow(new Object[]{var, tipo + "->"});
                        // Registrar la variable en el mapa
                        tablaVariables.put(var, tipo + "->");
                    } else {
                        // Error: Identificador no válido
                        modeloErr.addRow(new Object[]{"ERSem" + numError++, var, i + 1, "Identificador no válido"});
                    }
                }
            }

            // Identificar operaciones
            if (linea.contains("=")) {
                String[] partes = linea.split("=");
                String varAsignada = partes[0].trim();
                String expresion = partes[1].trim();

                // Verificar si la variable asignada está definida en el mapa
                String tipoVarAsignada = tablaVariables.get(varAsignada); // Obtener el tipo de la variable asignada

                // Verificar si tipoVarAsignada es null, lo que indica que la variable no está definida
                if (tipoVarAsignada == null) {
                    modeloErr.addRow(new Object[]{"ERSem" + numError++, varAsignada, i + 1, "Variable Indefinida"});
                } else {
                    // Analizar la expresión
                    String[] elementos = expresion.split("[+\\-*/]");
                    for (String elem : elementos) {
                        elem = elem.trim().replace(";", "");
                        if (!elem.isEmpty() && !tablaVariables.containsKey(elem)) {
                            modeloErr.addRow(new Object[]{"ERSem" + numError++, elem, i + 1, "Variable Indefinida"});
                        }
                    }

                    // Verificar incompatibilidad de tipos
                    for (String elem : elementos) {
                        elem = elem.trim().replace(";", "");

                        // Verificar que el elemento sea una variable registrada
                        if (tablaVariables.containsKey(elem)) {
                            String tipoElem = tablaVariables.get(elem);

                            // Operaciones entre Enteros
                            if (tipoVarAsignada.equals("ent->") && tipoElem.equals("ent->") && (linea.contains("+") || linea.contains("-") || linea.contains("*") || linea.contains("="))) {
                                // OK: enteros pueden operar entre sí
                            } // Operaciones entre Reales y Enteros
                            else if (tipoVarAsignada.equals("rea->") && tipoElem.equals("ent->") && (linea.contains("+") || linea.contains("-") || linea.contains("*") || linea.contains("/") || linea.contains("="))) {
                                // OK: real con entero es válido
                            } // Operaciones entre Reales
                            else if (tipoVarAsignada.equals("rea->") && tipoElem.equals("rea->") && (linea.contains("+") || linea.contains("-") || linea.contains("*") || linea.contains("/") || linea.contains("="))) {
                                // OK: reales pueden operar entre sí
                            } // Operaciones entre Cadenas y Caracteres
                            else if (tipoVarAsignada.equals("cad->") && (tipoElem.equals("cad->") || tipoElem.equals("car->")) && (linea.contains("+") || linea.contains("-") || linea.contains("="))) {
                                // OK: cadenas pueden operar con cadenas y caracteres
                            } // Si no es un caso válido, es un error
                            else {
                                modeloErr.addRow(new Object[]{"ERSem" + numError++, elem, i + 1, "Incompatibilidad de tipos " + tipoVarAsignada + " con " + tipoElem});
                            }
                        }
                    }
                }
            }

        }

// SEGUNDA PASADA: Añadir operadores al final del análisis, en orden de izquierda a derecha
        java.util.Set<String> operadores = new java.util.HashSet<>(); // Para almacenar operadores

// Recorrer todo el texto de izquierda a derecha para asegurarse de añadir todos los operadores
        for (int i = 0; i < lineas.length; i++) {
            String linea = lineas[i].trim();

            // Recorrer cada carácter de la línea para procesar operadores
            for (int j = 0; j < linea.length(); j++) {
                char c = linea.charAt(j);

                // Verificar si es un operador y si ya ha sido procesado
                if (c == '+' && !operadores.contains("+")) {
                    modeloSimb.addRow(new Object[]{"+", ""});
                    operadores.add("+");
                }
                if (c == '-' && !linea.substring(j).startsWith("->") && !operadores.contains("-")) { // Evitar el caso "ent->"
                    modeloSimb.addRow(new Object[]{"-", ""});
                    operadores.add("-");
                }
                if (c == '*' && !operadores.contains("*")) {
                    modeloSimb.addRow(new Object[]{"*", ""});
                    operadores.add("*");
                }
                if (c == '/' && !operadores.contains("/")) {
                    modeloSimb.addRow(new Object[]{"/", ""});
                    operadores.add("/");
                }
                if (c == '=' && !operadores.contains("=")) {
                    modeloSimb.addRow(new Object[]{"=", ""});
                    operadores.add("=");
                }
                if (c == ',' && !operadores.contains(",")) {
                    modeloSimb.addRow(new Object[]{",", ""});
                    operadores.add(",");
                }
                if (c == ';' && !operadores.contains(";")) {
                    modeloSimb.addRow(new Object[]{";", ""});
                    operadores.add(";");
                }
            }
        }
// TERCERA PASADA: Detectar variables indefinidas recorriendo nuevamente el texto
        for (int i = 0; i < lineas.length; i++) {
            String linea = lineas[i].trim();
            String[] tokens = linea.split("[\\s=+\\-*/;,]+"); // Dividir la línea en posibles identificadores

            for (String token : tokens) {
                token = token.trim();
                if (!token.isEmpty() && token.matches("[a-zA-Zá-úÁ-Ú][a-zA-Z0-9á-úÁ-Ú]*")) {
                    // Ignorar palabras clave reservadas
                    if (token.equals("ent") || token.equals("cad") || token.equals("rea")) {
                        continue;
                    }

                    // Si la variable no está en tablaVariables, es indefinida
                    if (!tablaVariables.containsKey(token)) {
                        modeloSimb.addRow(new Object[]{token, ""});
                    }
                }
            }
        }
    }//GEN-LAST:event_JBAnalizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAnalizar;
    private javax.swing.JButton JBLimpiar;
    private javax.swing.JLabel JLEntrada;
    private javax.swing.JLabel JLErrores;
    private javax.swing.JLabel JLSimbolos;
    private javax.swing.JTable JTableErrores;
    private javax.swing.JTable JTableSimbolos;
    private javax.swing.JTextArea JText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
