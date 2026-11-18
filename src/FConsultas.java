
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author diana
 */
public class FConsultas extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FConsultas.class.getName());

    ArrayList<ArrayList<String>> datos = new ArrayList();

    ArrayList<String> series = new ArrayList();

    GraficaXY chart;

    Conexion cnx;

    public FConsultas() {
        initComponents();
        setLocationRelativeTo(null);

        cnx = new Conexion();

        if (cnx.conectar("localhost", "insulina", "root", null) == 0) {
            JOptionPane.showMessageDialog(this, "No se pudo conectar a la BD...");
            System.exit(0);
        }

        ArrayList<ArrayList<String>> listaPacientes = cnx.consultar("SELECT DISTINCT nombrep FROM promedio_mensual ORDER BY nombrep");

//        limpia el comboBox para que no aparezcan los items, solo los nombres de los pacientes
        CBPacientes.removeAllItems();
//        cargar los nombres de los pacientes por medio del comboBox
        for (ArrayList<String> fila : listaPacientes) {
            CBPacientes.addItem(fila.get(0));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        BPromedioMens = new javax.swing.JButton();
        BPromedioGen = new javax.swing.JButton();
        CBPacientes = new javax.swing.JComboBox<>();
        PGrafica = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TQuery = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setText("GRAFICACIÓN DE VALORES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        jToolBar1.setRollover(true);

        BPromedioMens.setBackground(new java.awt.Color(204, 204, 255));
        BPromedioMens.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        BPromedioMens.setText("Promedio Mensual");
        BPromedioMens.setFocusable(false);
        BPromedioMens.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BPromedioMens.setMaximumSize(new java.awt.Dimension(150, 60));
        BPromedioMens.setMinimumSize(new java.awt.Dimension(150, 60));
        BPromedioMens.setPreferredSize(new java.awt.Dimension(150, 60));
        BPromedioMens.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BPromedioMens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPromedioMensActionPerformed(evt);
            }
        });
        jToolBar1.add(BPromedioMens);

        BPromedioGen.setBackground(new java.awt.Color(204, 204, 255));
        BPromedioGen.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        BPromedioGen.setText("Promedio General");
        BPromedioGen.setFocusable(false);
        BPromedioGen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BPromedioGen.setMaximumSize(new java.awt.Dimension(150, 60));
        BPromedioGen.setMinimumSize(new java.awt.Dimension(150, 60));
        BPromedioGen.setPreferredSize(new java.awt.Dimension(150, 60));
        BPromedioGen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BPromedioGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPromedioGenActionPerformed(evt);
            }
        });
        jToolBar1.add(BPromedioGen);

        CBPacientes.setBackground(new java.awt.Color(204, 204, 255));
        CBPacientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBPacientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PM por Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12), new java.awt.Color(102, 0, 102))); // NOI18N
        CBPacientes.setMaximumSize(new java.awt.Dimension(160, 70));
        CBPacientes.setMinimumSize(new java.awt.Dimension(160, 70));
        CBPacientes.setPreferredSize(new java.awt.Dimension(160, 70));
        CBPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPacientesActionPerformed(evt);
            }
        });
        jToolBar1.add(CBPacientes);

        PGrafica.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout PGraficaLayout = new javax.swing.GroupLayout(PGrafica);
        PGrafica.setLayout(PGraficaLayout);
        PGraficaLayout.setHorizontalGroup(
            PGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        PGraficaLayout.setVerticalGroup(
            PGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        TQuery.setBackground(new java.awt.Color(204, 204, 255));
        TQuery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TQuery);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPromedioMensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPromedioMensActionPerformed
//        promedio mensual de un paciente en especifico 
        String query = "SELECT CONCAT(mes, '-', año) AS periodo, glucosa_prom "
                + "FROM promedio_mensual "
                + "WHERE curp = 'ausl120130a' "
                + "ORDER BY año, mes";

        datos = cnx.consultar(query);

        series.clear();
        series.add("Luisa Aguilera Saldivar");

        PGrafica.removeAll();
        PGrafica.setLayout(new java.awt.BorderLayout());
        chart = new GraficaXY("Promedio Mensual de Glucosa",
                "Periodo (Mes-Año)", "Glucosa Promedio", series, datos);

        PGrafica.add(chart.chartPanel, java.awt.BorderLayout.CENTER);
        PGrafica.revalidate();
        PGrafica.repaint();

        cnx.entablar(query, TQuery, 80, 100);
    }//GEN-LAST:event_BPromedioMensActionPerformed

    private void BPromedioGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPromedioGenActionPerformed
//        promedio general de los pacientes por mes
        String query = "SELECT CONCAT(mes, '-', año) AS periodo, ROUND(AVG(glucosa_prom), 2) AS promedio_global "
                + "FROM promedio_mensual "
                + "GROUP BY año, mes "
                + "ORDER BY año, mes";

        datos = cnx.consultar(query);

        series.clear();
        series.add("Todos los Pacientes");

        PGrafica.removeAll();
        PGrafica.setLayout(new java.awt.BorderLayout());
        chart = new GraficaXY("Promedio Mensual General de Glucosa",
                "Periodo (Mes-Año)", "Glucosa Promedio", series, datos);

        PGrafica.add(chart.chartPanel, java.awt.BorderLayout.CENTER);
        PGrafica.revalidate();
        PGrafica.repaint();

        cnx.entablar(query, TQuery, 80, 100);
    }//GEN-LAST:event_BPromedioGenActionPerformed

    private void CBPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPacientesActionPerformed
//          seleccion por paciente para ver su promedio mensual                                          
        if (CBPacientes.getSelectedItem() == null) {
            return;
        }

        String pacienteSeleccionado = CBPacientes.getSelectedItem().toString();

        String query = "SELECT CONCAT(mes, '-', año) AS periodo, glucosa_prom "
                + "FROM promedio_mensual "
                + "WHERE nombrep = '" + pacienteSeleccionado + "' "
                + "ORDER BY año, mes";

        datos = cnx.consultar(query);

        series.clear();
        series.add(pacienteSeleccionado);

        PGrafica.removeAll();
        PGrafica.setLayout(new java.awt.BorderLayout());
        chart = new GraficaXY("Promedio Mensual de Glucosa",
                "Periodo (Mes-Año)", "Glucosa Promedio", series, datos);

        PGrafica.add(chart.chartPanel, java.awt.BorderLayout.CENTER);
        PGrafica.revalidate();
        PGrafica.repaint();

        cnx.entablar(query, TQuery, 80, 100);

    }//GEN-LAST:event_CBPacientesActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FConsultas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BPromedioGen;
    private javax.swing.JButton BPromedioMens;
    private javax.swing.JComboBox<String> CBPacientes;
    private javax.swing.JPanel PGrafica;
    private javax.swing.JTable TQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
