/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stark_travel;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        Estrella e1=new Estrella("e1",false);
        Estrella e2=new Estrella("e2",false);
        Estrella e3=new Estrella("e3",false);
        Estrella e4=new Estrella("e4",false);
        Estrella e5=new Estrella("e5",false);
        Estrella e6=new Estrella("e6",false);
        Estrella e7=new Estrella("e7",false);
        Adyacencia x11=new Adyacencia(e2,e1,false,1);
        Adyacencia x12=new Adyacencia(e4,e1,false,4);
        Adyacencia x13=new Adyacencia(e6,e1,false,5);
        Adyacencia x14=new Adyacencia(e5,e1,false,6);
        Adyacencia x15=new Adyacencia(e3,e1,false,3);
        x14.setNext(x15);
        x13.setNext(x14);
        x12.setNext(x13);
        x11.setNext(x12);
        e1.setAdj(x11);
        Adyacencia x61=new Adyacencia(e4,e6,false,9);
        Adyacencia x62=new Adyacencia(e1,e6,false,5);
        Adyacencia x63=new Adyacencia(e5,e6,false,8);
        Adyacencia x64=new Adyacencia(e7,e6,false,10);
        x63.setNext(x64);
        x62.setNext(x63);
        x61.setNext(x62);
        e6.setAdj(x61);
        Adyacencia x51=new Adyacencia(e7,e5,false,11);
        Adyacencia x52=new Adyacencia(e6,e5,false,8);
        Adyacencia x53=new Adyacencia(e1,e5,false,6);
        Adyacencia x54=new Adyacencia(e3,e5,false,7);
        x53.setNext(x54);
        x52.setNext(x53);
        x51.setNext(x52);
        e5.setAdj(x51);
        Adyacencia x41=new Adyacencia(e2,e4,false,2);
        Adyacencia x42=new Adyacencia(e1,e4,false,4);
        Adyacencia x43=new Adyacencia(e6,e4,false,9);
        x42.setNext(x43);
        x41.setNext(x42);
        e4.setAdj(x41);
        Adyacencia x21=new Adyacencia(e4,e2,false,2);
        Adyacencia x22=new Adyacencia(e1,e2,false,1);
        x21.setNext(x22);
        e2.setAdj(x21);
        Adyacencia x71=new Adyacencia(e6,e7,false,10);
        Adyacencia x72=new Adyacencia(e5,e7,false,11);
        x71.setNext(x72);
        e7.setAdj(x71);
        Adyacencia x31=new Adyacencia(e1,e3,false,3);
        Adyacencia x32=new Adyacencia(e5,e3,false,7);
        x31.setNext(x32);
        e3.setAdj(x31);
        e6.setNext(e7);
        e5.setNext(e6);
        e4.setNext(e5);
        e3.setNext(e4);
        e2.setNext(e3);
        e1.setNext(e2);
        lista=e1;
        lista_fin=e7;
        Estrella kkl=kruskal(e1);
        DefaultComboBoxModel modelo=(DefaultComboBoxModel)kruska.getModel();
        modelo.addElement(kkl);
        modelo.addElement(kkl.getNext());
        modelo.addElement(kkl.getNext().getNext());
        modelo.addElement(kkl.getNext().getNext().getNext());
        modelo.addElement(kkl.getNext().getNext().getNext().getNext());
        modelo.addElement(kkl.getNext().getNext().getNext().getNext().getNext());
        modelo.addElement(kkl.getNext().getNext().getNext().getNext().getNext().getNext());
        kruska.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        cbx_stars = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        kruska = new javax.swing.JComboBox<>();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre de la Estrella");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Registro");

        jButton3.setText("Agregar al universo");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro.getContentPane());
        Registro.getContentPane().setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel3))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton3)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton3)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Universo");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(cbx_stars, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addComponent(cbx_stars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 3, 24)); // NOI18N
        jLabel1.setText("STAR TRAVELER");

        jButton1.setText("Comenzar Travesia Espacial");

        jButton2.setText("Registro de Estrellas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(kruska, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(48, 48, 48)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(kruska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if(lista.equals(null)){
            Estrella nueva=new Estrella(tf_nombre.getText(),false);
            lista=nueva;
            tf_nombre.setText("");
            lista_fin=nueva;
        }else{
            Estrella nueva=new Estrella(tf_nombre.getText(),false);
            lista_fin.setNext(nueva);
            lista_fin=nueva;
        }
        JOptionPane.showMessageDialog(this, "una nueva Estrella a nacido");
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Registro;
    private javax.swing.JComboBox<String> cbx_stars;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> kruska;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
public Estrella kruskal(Estrella grafo){
    Estrella temp=lista;
    Estrella temp_2=new Estrella();
    int size=1;
    boolean revision=true;
    while(revision){
        if(!temp.getNext().equals(null)){
            System.out.println(temp.getNombre());
            size++;
            temp=temp.getNext();
        }else{
            revision=false;
        }
    }
    temp=lista;
    Estrella temp_3=new Estrella();
    for (int i = 0; i < size; i++) {
        if(grafo.getNombre().equals(temp.getNombre())){
            temp.setVisitado(true);
        }
        if(i==0){
            temp_2=temp;
        }else{
            temp_3.setNext(temp);
        }
        temp_3=temp;
        temp=temp.getNext(); 
    }
    temp=temp_2;
    boolean recorriendo=true;
    while(recorriendo){
        Adyacencia opciones=new Adyacencia();
        Adyacencia opciones_final=new Adyacencia();
        for (int i = 0; i < size; i++) {
            if(temp.isVisitado()){
                boolean agregar=true;
                while(agregar){
                    if (opciones.equals(null)) {
                        opciones=temp.getAdj();
                        Adyacencia mas_op=opciones;
                        while(!mas_op.getNext().equals(null)){
                            mas_op=mas_op.getNext();
                        }
                        opciones_final=mas_op;
                    }else{
                        opciones_final.setNext(temp.getAdj());
                        Adyacencia mas_op=opciones_final;
                        while(!mas_op.getNext().equals(null)){
                            mas_op=mas_op.getNext();
                        }
                        opciones_final=mas_op;
                    }
                } 
            }
            temp=temp.getNext();
        }
        boolean verificar=true;
        Adyacencia menor=new Adyacencia();
        Adyacencia menor_final=new Adyacencia();
        menor.setPeso(-9);
        while(!opciones.getNext().equals(null)){
            if (opciones.getPeso()<menor.getPeso()&&menor.getOrigen().isVisitado()==false){
                if (menor.getPeso()==-9) {
                    Adyacencia nueva=opciones;
                    menor=nueva;
                    menor_final=nueva;
                    menor.setNext(null);
                }else{
                    Adyacencia nueva=opciones;
                    menor_final.setNext(nueva);
                    menor_final=nueva;
                    menor_final.setNext(null);
                }
               
            }
            opciones=opciones.getNext();
        }
        while(!menor.equals(null)){
            menor.getEstrella().setVisitado(true);
            boolean si=true;
            while(!temp.equals(null)){
                if (temp.getNombre().equals(menor.getOrigen().getNombre())) {
                    if (temp.getAdj().isCamino_kruskal()) {
                        Adyacencia temp_ady=temp.getAdj();
                        if (temp_ady.getNext().equals(null)) {
                            temp.getAdj().setNext(new Adyacencia(menor.getEstrella(),menor.getOrigen(),true,menor.getPeso()));
                        }else{
                            while(!temp_ady.getNext().equals(null)){
                                temp_ady=temp_ady.getNext(); 
                            }
                            temp_ady.setNext(new Adyacencia(menor.getEstrella(),menor.getOrigen(),true,menor.getPeso()));
                        }
                    }else{
                        temp.setAdj(new Adyacencia(menor.getEstrella(),menor.getOrigen(),true,menor.getPeso()));
                    }
                }
                temp=temp.getNext();
            }
            menor=menor.getNext();
        }
        Estrella temp_x=temp;
        boolean ultima_rev=false;
        for (int i = 0; i < size; i++) {
            if (temp_x.isVisitado()==false) {
                ultima_rev=true;
            }
        }
        if (ultima_rev==false) {
            recorriendo=false;
        }
    }
    
    return temp;
}
Estrella lista;
Estrella lista_fin;
}
