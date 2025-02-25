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
        JLLinea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Semántico");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1132, 590));
        setMinimumSize(new java.awt.Dimension(1132, 590));
        setResizable(false);

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

        JLLinea.setForeground(new java.awt.Color(102, 102, 102));
        JLLinea.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JLLinea.setText("<html><div align='right'>1<br>2<br>3<br>4<br>5<br>6<br>7<br>8<br>9<br>10<br>11<br>12<br>13<br>14<br>15<br>16<br>17<br>18<br>19<br>20<br>21<br>22<br>23<br>24<br>25</div></html>");
        JLLinea.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JLLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(JLEntrada)
                        .addGap(198, 198, 198)
                        .addComponent(JLSimbolos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLErrores)
                        .addGap(266, 266, 266))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEntrada)
                            .addComponent(JLSimbolos)
                            .addComponent(JLErrores))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(1176, 598));
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
        String texto = ""; //Limpia la variable texto para eliminar los posibles residuos de un analisis anterior
        texto = JText.getText().replaceAll(" ", ""); // replaceAll elimina los espacios
        String[] lineas = texto.split("\n");

// Variables para el análisis
        int numError = 1; // Contador de errores
        java.util.Map<String, String> tablaVariables = new java.util.HashMap<>(); // Almacena variables y sus tipos

// Expresiones regulares para detectar tipos de datos en valores literales
        String regexEntero = "^[0-9]+$";
        String regexReal = "^[0-9]+\\.[0-9]+$";
        String regexCadena = "^\".*\"$";
        
        
// PRIMERA PASADA: Analisis completo
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
                String tipoVarAsignada = tablaVariables.get(varAsignada);

                if (tipoVarAsignada == null) {
                    modeloErr.addRow(new Object[]{"ERSem" + numError++, varAsignada, i + 1, "Variable Indefinida"});
                } else {
                    // Analizar la expresión
                    String[] elementos = expresion.split("[+\\-*/]");
                    for (String elem : elementos) {
                        elem = elem.trim().replace(";", "");

                        if (!elem.isEmpty()) {
                            if (tablaVariables.containsKey(elem)) {
                                // Variable conocida, no hacer nada
                            } else if (elem.matches(regexEntero)) {
                                modeloSimb.addRow(new Object[]{elem, "ent->"});
                            } else if (elem.matches(regexReal)) {
                                modeloSimb.addRow(new Object[]{elem, "rea->"});
                            } else if (elem.matches(regexCadena)) {
                                modeloSimb.addRow(new Object[]{elem, "cad->"});
                            } else {
                                modeloErr.addRow(new Object[]{"ERSem" + numError++, elem, i + 1, "Variable Indefinida"});
                            }
                        }
                    }

                    // Verificar incompatibilidad de tipos
                    for (String elem : elementos) {
                        elem = elem.trim().replace(";", "");

                        String tipoElem;
                        if (tablaVariables.containsKey(elem)) {
                            tipoElem = tablaVariables.get(elem);
                        } else if (elem.matches(regexEntero)) {
                            tipoElem = "ent->";
                        } else if (elem.matches(regexReal)) {
                            tipoElem = "rea->";
                        } else if (elem.matches(regexCadena)) {
                            tipoElem = "cad->";
                        } else {
                            continue; // Ignorar elementos no válidos
                        }

                        // Verificar incompatibilidad de tipos
                        if (!(tipoVarAsignada.equals("ent->") && tipoElem.equals("ent->"))
                                && !(tipoVarAsignada.equals("rea->") && (tipoElem.equals("rea->") || tipoElem.equals("ent->")))
                                && !(tipoVarAsignada.equals("cad->") && tipoElem.equals("cad->"))) {
                            modeloErr.addRow(new Object[]{"ERSem" + numError++, elem, i + 1, "Incompatibilidad de tipos " + tipoVarAsignada + " con " + tipoElem});
                        }

                    }
                }
            }
        }

// SEGUNDA PASADA: Añadir operadores despues de analizar
        java.util.Set<String> operadores = new java.util.HashSet<>();

        for (int i = 0; i < lineas.length; i++) {
            String linea = lineas[i].trim();

            for (int j = 0; j < linea.length(); j++) {
                char c = linea.charAt(j);

                if (c == '+' && !operadores.contains("+")) {
                    modeloSimb.addRow(new Object[]{"+", ""});
                    operadores.add("+");
                }
                if (c == '-' && !linea.substring(j).startsWith("->") && !operadores.contains("-")) {
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
// TERCERA PASADA: Detectar variables indefinidas recorriendo nuevamente el texto y añádirlas al final de la tabla
        // Conjunto para almacenar variables indefinidas ya registradas
        java.util.Set<String> variablesIndefinidas = new java.util.HashSet<>();
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

                    // Si la variable no está en tablaVariables y no ha sido agregada antes, es indefinida
                    if (!tablaVariables.containsKey(token) && !variablesIndefinidas.contains(token)) {
                        modeloSimb.addRow(new Object[]{token, ""});
                        variablesIndefinidas.add(token); // Marcarla como agregada
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
    private javax.swing.JLabel JLLinea;
    private javax.swing.JLabel JLSimbolos;
    private javax.swing.JTable JTableErrores;
    private javax.swing.JTable JTableSimbolos;
    private javax.swing.JTextArea JText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
