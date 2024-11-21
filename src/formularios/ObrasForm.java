package formularios;

import daos.ObraDao;
import entidades.Obra;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ObrasForm extends javax.swing.JInternalFrame {

    public ObrasForm() {
        initComponents();
        pintarTabla();
    }
    
    private Object[][] convertirAFilasDeTabla(List<Obra> obras) {
        Object[][] matriz = new Object[obras.size()][7];

        for (int i = 0; i < obras.size(); i++) {
            Obra obra = obras.get(i);
            matriz[i][0] = obra.getCodigo();
            matriz[i][1] = obra.getTitulo();
            matriz[i][2] = obra.getAutor();
            matriz[i][3] = obra.getEditorial();
            matriz[i][4] = obra.getGenero();
            matriz[i][5] = obra.getUnidadesDisp();
            matriz[i][6] = obra.getUbicacion();
        }

        return matriz;
    }
    
    private void pintarTabla() {
        ObraDao obraDao = new ObraDao();
        
        try {
            List<Obra> obras = obraDao.obtenerObras();
            Object[][] filasDeTabla = convertirAFilasDeTabla(obras);
            String[] titulosTabla = new String[] {"Codigo", "Titulo", "Autor", 
                "Editorial", "Genero", "Unidades Disp", "Ubicacion"};

            DefaultTableModel model = new DefaultTableModel(filasDeTabla, titulosTabla);
            tblObras.setModel(model);
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
        tblObras = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Obras");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblObras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Autor", "Editorial", "Genero", "Unidades Disp", "Ubicacion"
            }
        ));
        jScrollPane1.setViewportView(tblObras);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 62, 760, 120));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        pintarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblObras;
    // End of variables declaration//GEN-END:variables
}