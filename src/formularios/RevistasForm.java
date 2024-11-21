package formularios;

import daos.RevistaDao;
import entidades.Revista;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RevistasForm extends javax.swing.JInternalFrame {

    public RevistasForm() {
        initComponents();
        pintarTabla();
    }
    
    private Object[][] convertirAFilasDeTabla(List<Revista> revistas) {
        Object[][] matriz = new Object[revistas.size()][7];

        for (int i = 0; i < revistas.size(); i++) {
            Revista revista = revistas.get(i);
            matriz[i][0] = revista.getCodigo();
            matriz[i][1] = revista.getTitulo();
            matriz[i][2] = revista.getEditorial();
            matriz[i][3] = revista.getPeriocidad();
            matriz[i][4] = revista.getFechaPub();
            matriz[i][5] = revista.getUnidadesDisp();
            matriz[i][6] = revista.getUbicacion();
        }

        return matriz;
    }
    
    private void pintarTabla() {
        RevistaDao revistaDao = new RevistaDao();
        
        try {
            List<Revista> revistas = revistaDao.obtenerRevistas();
            Object[][] filasDeTabla = convertirAFilasDeTabla(revistas);
            String[] titulosTabla = new String[] {"Codigo", "Titulo", "Editorial", 
                "Periocidad", "Fecha Pub", "Unidades Disp", "Ubicacion"};

            DefaultTableModel model = new DefaultTableModel(filasDeTabla, titulosTabla);
            tblRevistas.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRevistas = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Revistas");

        tblRevistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Editorial", "Periocidad", "Fecha Pub", "Unidades Disp", "Ubicacion"
            }
        ));
        jScrollPane1.setViewportView(tblRevistas);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        pintarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRevistas;
    // End of variables declaration//GEN-END:variables
}
