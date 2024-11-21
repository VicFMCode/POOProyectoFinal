package formularios;

import daos.MaterialDao;
import daos.RevistaDao;
import entidades.Material;
import entidades.Revista;
import entidades.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RevistaForm extends javax.swing.JInternalFrame {

    private RevistaDao revistaDao;
    private MaterialDao materialDao;
    private Usuario usuario;
    
    public RevistaForm(Usuario usuario) {
        initComponents();
        this.revistaDao = new RevistaDao();
        this.materialDao = new MaterialDao();
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUnidadesDisp = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtPeriocidad = new javax.swing.JTextField();
        dchFechaPub = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Revista");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 27, 83, -1));

        jLabel2.setText("Titulo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 65, -1, -1));
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 62, 245, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 27, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 296, 99, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 296, 95, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 296, 92, -1));

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMensaje.setText(" ");
        getContentPane().add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 331, 347, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 27, -1, -1));

        jLabel4.setText("Editorial:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 99, -1, -1));

        jLabel5.setText("Periocidad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 139, -1, -1));

        jLabel8.setText("Fecha Pub:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 176, -1, -1));

        jLabel9.setText("Unidades Disp:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 219, -1, -1));
        getContentPane().add(txtUnidadesDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 216, 245, -1));
        getContentPane().add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 96, 245, -1));
        getContentPane().add(txtPeriocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 136, 245, -1));
        getContentPane().add(dchFechaPub, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 176, 245, -1));

        jLabel10.setText("Ubicacion:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 259, -1, -1));
        getContentPane().add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 256, 245, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar() {
        txtCodigo.setText("");
        txtTitulo.setText("");
        txtEditorial.setText("");
        txtPeriocidad.setText("");
        txtUnidadesDisp.setText("");
        dchFechaPub.setDate(null);
        txtUbicacion.setText("");
        lblMensaje.setText("");
    }
    
    private void llenarFormulario(Revista revista) {
        limpiar();
        if (revista == null) {
           lblMensaje.setText("Registro no encontrado");
        } else {
            txtCodigo.setText(revista.getCodigo());
            txtTitulo.setText(revista.getTitulo());
            txtEditorial.setText(revista.getEditorial());
            txtPeriocidad.setText(revista.getPeriocidad());
            dchFechaPub.setDate(revista.getFechaPub());
            txtUnidadesDisp.setText(String.valueOf(revista.getUnidadesDisp()));
            txtUbicacion.setText(revista.getUbicacion());
        }
    }
    
    private Revista obtenerDesdeFormulario() {
        Revista revista = new Revista();
        revista.setCodigo(txtCodigo.getText());
        revista.setTitulo(txtTitulo.getText());
        revista.setEditorial(txtEditorial.getText());
        revista.setPeriocidad(txtPeriocidad.getText());
        revista.setFechaPub(dchFechaPub.getDate());
        revista.setUnidadesDisp(Integer.valueOf(txtUnidadesDisp.getText()));
        revista.setUbicacion(txtUbicacion.getText());
        return revista;
    }
    
    private void registrarMaterial() {
        try {
            Material material = new Material();
            material.setCodigo(txtCodigo.getText());
            material.setIdUsuario(usuario.getIdUsuario());
            materialDao.registrarMaterial(material);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo = txtCodigo.getText();
        
        try {
            Revista revista = revistaDao.obtenerRevista(codigo);
            llenarFormulario(revista);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            Revista revista = obtenerDesdeFormulario();
            revistaDao.registrarRevista(revista);
            registrarMaterial();
            limpiar();
            lblMensaje.setText("Registrado exitosamente!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            Revista revista = obtenerDesdeFormulario();
            revistaDao.modificarRevista(revista);
            limpiar();
            lblMensaje.setText("Modificado exitosamente!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo = txtCodigo.getText();
        
        try {
            revistaDao.eliminarRevista(codigo);
            limpiar();
            lblMensaje.setText("Eliminado exitosamente!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private com.toedter.calendar.JDateChooser dchFechaPub;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtPeriocidad;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtUnidadesDisp;
    // End of variables declaration//GEN-END:variables
}