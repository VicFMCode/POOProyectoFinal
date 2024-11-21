package formularios;

import daos.ObraDao;
import daos.MaterialDao;
import entidades.Obra;
import entidades.Material;
import entidades.Usuario;

public class ObraForm extends javax.swing.JInternalFrame {

    private ObraDao obraDao;
    private MaterialDao materialDao;
    private Usuario usuario;
    
    public ObraForm(Usuario usuario) {
        initComponents();
        this.obraDao = new ObraDao();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUnidadesDisp = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Obra");
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
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 99, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 95, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 92, -1));

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMensaje.setText(" ");
        getContentPane().add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 347, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 27, -1, -1));

        jLabel4.setText("Autor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 99, -1, -1));

        jLabel6.setText("Editorial:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel7.setText("Genero:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel9.setText("Unidades Disp:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
        getContentPane().add(txtUnidadesDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 245, -1));
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 96, 245, -1));
        getContentPane().add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 245, -1));
        getContentPane().add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 245, -1));

        jLabel10.setText("Ubicacion:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
        getContentPane().add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 245, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar() {
        txtCodigo.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        txtEditorial.setText("");
        txtGenero.setText("");
        txtUnidadesDisp.setText("");
        txtUbicacion.setText("");
        lblMensaje.setText("");
    }
    
    private void llenarFormulario(Obra obra) {
        limpiar();
        if (obra == null) {
           lblMensaje.setText("Registro no encontrado");
        } else {
            txtCodigo.setText(obra.getCodigo());
            txtTitulo.setText(obra.getTitulo());
            txtAutor.setText(obra.getAutor());
            txtEditorial.setText(obra.getEditorial());
            txtGenero.setText(obra.getGenero());
            txtUnidadesDisp.setText(String.valueOf(obra.getUnidadesDisp()));
            txtUbicacion.setText(obra.getUbicacion());
        }
    }
    
    private Obra obtenerDesdeFormulario() {
        Obra obra = new Obra();
        obra.setCodigo(txtCodigo.getText());
        obra.setTitulo(txtTitulo.getText());
        obra.setAutor(txtAutor.getText());
        obra.setEditorial(txtEditorial.getText());
        obra.setGenero(txtGenero.getText());
        obra.setUnidadesDisp(Integer.valueOf(txtUnidadesDisp.getText()));
        obra.setUbicacion(txtUbicacion.getText());
        return obra;
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
            Obra obra = obraDao.obtenerObra(codigo);
            llenarFormulario(obra);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            Obra obra = obtenerDesdeFormulario();
            obraDao.registrarObra(obra);
            registrarMaterial();
            limpiar();
            lblMensaje.setText("Registrado exitosamente!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            Obra obra = obtenerDesdeFormulario();
            obraDao.modificarObra(obra);
            limpiar();
            lblMensaje.setText("Modificado exitosamente!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo = txtCodigo.getText();
        
        try {
            obraDao.eliminarObra(codigo);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtUnidadesDisp;
    // End of variables declaration//GEN-END:variables
}
