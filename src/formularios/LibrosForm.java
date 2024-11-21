package formularios;

import daos.LibroDao;
import entidades.Libro;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class LibrosForm extends javax.swing.JInternalFrame {

    public LibrosForm() {
        initComponents();
        pintarTabla();
    }
    
    private Object[][] convertirAFilasDeTabla(List<Libro> libros) {
        Object[][] matriz = new Object[libros.size()][9];

        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            matriz[i][0] = libro.getCodigo();
            matriz[i][1] = libro.getTitulo();
            matriz[i][2] = libro.getAutor();
            matriz[i][3] = libro.getNumPag();
            matriz[i][4] = libro.getEditorial();
            matriz[i][5] = libro.getIsbn();
            matriz[i][6] = libro.getAnioPub();
            matriz[i][7] = libro.getUnidadesDisp();
            matriz[i][8] = libro.getUbicacion();
        }

        return matriz;
    }
    
    private void pintarTabla() {
        LibroDao libroDao = new LibroDao();
        
        try {
            List<Libro> libros = libroDao.obtenerLibros();
            Object[][] filasDeTabla = convertirAFilasDeTabla(libros);
            String[] titulosTabla = new String[] {"Codigo", "Titulo", "Autor", 
                "Num Pagina", "Editorial", "ISBN", "Anio Pub", 
                "Unidades Disp", "Ubicacion"};

            DefaultTableModel model = new DefaultTableModel(filasDeTabla, titulosTabla);
            tblLibros.setModel(model);
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
        tblLibros = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Libros");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Autor", "Num Pagina", "Editorial", "ISBN", "Anio Pub", "Unidades Disp", "Ubicacion"
            }
        ));
        jScrollPane1.setViewportView(tblLibros);

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
    private javax.swing.JTable tblLibros;
    // End of variables declaration//GEN-END:variables
}
