package formularios;

import daos.ParametroSistemaDao;
import daos.PrestamoDao;
import entidades.ParametroSistema;
import entidades.Prestamo;
import entidades.Usuario;
import java.util.Calendar;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import utilidades.Utilidades;

public class PrestamosProAluForm extends javax.swing.JInternalFrame {

    private Usuario usuario;
    private PrestamoDao prestamoDao;
    private ParametroSistemaDao parametroSistemaDao;
    
    public PrestamosProAluForm(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        this.prestamoDao = new PrestamoDao();
        this.parametroSistemaDao = new ParametroSistemaDao();
        pintarTabla();
    }
    
    private Object[][] convertirAFilasDeTabla(List<Prestamo> prestamos) {
        Object[][] matriz = new Object[prestamos.size()][4];

        for (int i = 0; i < prestamos.size(); i++) {
            Prestamo prestamo = prestamos.get(i);
            matriz[i][0] = prestamo.getCodigo();
            matriz[i][1] = prestamo.getFechaPrestamo();
            matriz[i][2] = prestamo.getFechaDevolucion();
            matriz[i][3] = Utilidades.calcularMora(prestamo);
        }

        return matriz;
    }
    
    private void pintarTabla() {
        
        try {
            List<Prestamo> prestamos = prestamoDao.obtenerPrestamosPorIdUsuario(usuario.getIdUsuario());
            Object[][] filasDeTabla = convertirAFilasDeTabla(prestamos);
            String[] titulosTabla = new String[] {"Codigo", "Fecha Prestamo", 
                "Fecha Devolucion", "Mora"};

            DefaultTableModel model = new DefaultTableModel(filasDeTabla, titulosTabla);
            tblPrestamos.setModel(model);
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
        tblPrestamos = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Prestamos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Fecha Prestamo", "Fecha Devolucion", "Mora"
            }
        ));
        jScrollPane1.setViewportView(tblPrestamos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, 760, 120));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        pintarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPrestamos;
    // End of variables declaration//GEN-END:variables
}
