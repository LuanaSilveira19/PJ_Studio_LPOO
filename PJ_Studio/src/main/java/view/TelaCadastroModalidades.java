package view;

import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.dao.CadastroModalidadeListener;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.dao.PercistenciaJPA;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Modalidades;
import static br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Modalidades_.professores;
import br.edu.ifsul.cc.lpoo.pj_studio.pj_studio.model.Professores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luana
 */
public class TelaCadastroModalidades extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroModalidades
     */
    private PercistenciaJPA jpa;
    private Modalidades modalidade;
    private CadastroModalidadeListener listener;
    
    public TelaCadastroModalidades() {
        initComponents();
        listarProfessores();

    }
 

    public void setListener(CadastroModalidadeListener listener) {
        this.listener = listener;
    }
      private void fecharTelaCadastro() {
        if (listener != null) {
            listener.onModalidadeAtualizada();
        }
        dispose();
    }
      // Método para definir a modalidade
    public void setModalidade(Modalidades modalidade) {
        this.modalidade = modalidade;
        // Aqui você pode carregar os dados da modalidade nos campos da tela de cadastro
        carregarDadosModalidade();
    }

    private void carregarDadosModalidade() {
        if (modalidade != null) {
            // Carregar os dados da modalidade nos campos da tela de cadastro
            TXTdescricao.setText(modalidade.getDescricao());
          
        }
    }
   

    public void listarProfessores() {
        COMBProfessores.removeAll();
        jpa = new PercistenciaJPA();
        jpa.conexaoAberta();
        List<Professores> list = jpa.getProfessores();
        for (Professores p : list) {
            COMBProfessores.addItem(p);
        }

        jpa.fecharConexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBDescricao = new javax.swing.JLabel();
        LBProfessor = new javax.swing.JLabel();
        COMBProfessores = new javax.swing.JComboBox<>();
        BTSalvar = new javax.swing.JButton();
        BTCancelar = new javax.swing.JButton();
        TXTdescricao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBDescricao.setText("Descrição:");

        LBProfessor.setText("Professor:");

        BTSalvar.setText("Salvar");
        BTSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSalvarActionPerformed(evt);
            }
        });

        BTCancelar.setText("Cancelar");
        BTCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCancelarActionPerformed(evt);
            }
        });

        TXTdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTdescricaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LBProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(COMBProfessores, 0, 271, Short.MAX_VALUE)
                            .addComponent(TXTdescricao))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(BTCancelar)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBDescricao)
                    .addComponent(TXTdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBProfessor)
                    .addComponent(COMBProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTSalvar)
                    .addComponent(BTCancelar))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void TXTdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTdescricaoActionPerformed
  
    }//GEN-LAST:event_TXTdescricaoActionPerformed

    private void BTSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalvarActionPerformed
        // SALVAR 
  
       Modalidades m;
        try {
            jpa.conexaoAberta();
            m = (Modalidades) jpa.find(Modalidades.class, modalidade.getId());
            m.setDescricao(TXTdescricao.getText());
            Professores prof = (Professores) COMBProfessores.getSelectedItem();
            m.setProfessores(prof);
            jpa.persist(m);
            JOptionPane.showMessageDialog(rootPane, "Modalidade editada!");
        } catch (Exception ex) {
            Logger.getLogger(TelaCadastroModalidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jpa.fecharConexao();
           fecharTelaCadastro();

    }//GEN-LAST:event_BTSalvarActionPerformed

    private void BTCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCancelarActionPerformed
         this.dispose();
    }//GEN-LAST:event_BTCancelarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroModalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroModalidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCancelar;
    private javax.swing.JButton BTSalvar;
    private javax.swing.JComboBox<Professores> COMBProfessores;
    private javax.swing.JLabel LBDescricao;
    private javax.swing.JLabel LBProfessor;
    private javax.swing.JTextField TXTdescricao;
    // End of variables declaration//GEN-END:variables
}
