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

public class PrestamosAdmForm extends javax.swing.JInternalFrame {

    private Usuario usuario;
    private PrestamoDao prestamoDao;
    private ParametroSistemaDao parametroSistemaDao;
    
    public PrestamosAdmForm(Usuario usuario) {
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
        
        String carnet = txtCarnet.getText();
        
        try {
            List<Prestamo> prestamos = prestamoDao.obtenerPrestamosPorCarnet(carnet);
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
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 760, 120));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel1.setText("Carnet:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        getContentPane().add(txtCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        pintarTabla();
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPrestamos;
    private javax.swing.JTextField txtCarnet;
    // End of variables declaration//GEN-END:variables
}
