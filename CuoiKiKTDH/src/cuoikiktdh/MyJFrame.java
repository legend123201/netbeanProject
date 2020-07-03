/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuoikiktdh;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.abs;
import javax.swing.JPanel;

/**
 *
 * @author legen
 */
public class MyJFrame extends javax.swing.JFrame implements Runnable {

    boolean is2D = true;
    Point pointGiuaManHinh;
    boolean[][] maTranPixel;
    int maxX;
    int maxY;

    int toaDoXTroChuotHienTai;
    int toaDoYTroChuotHienTai;

    String stringToaDo = "";

    public class Point {

        public int toaDoX;
        public int toaDoY;
    }
    
    /**
     * Creates new form MyJFrame
     */
    public MyJFrame() {
        initComponents();

        maxX = jPanel1.getHeight() / 5 + 10; //cong 10 cho chac chan, o pixel no co the la so le
        maxY = jPanel1.getWidth() / 5 + 10;
        maTranPixel = new boolean[maxY][maxX];
        
        for (int i = 0; i < maxY; i++) {
            for (int j = 0; j < maxX; j++) {
                maTranPixel[i][j] = false;
            }
        }
        
        pointGiuaManHinh = LamTronDiem(jPanel1.getWidth()/2, jPanel1.getHeight()/2);
    }

    //hàm làm tròn để xác định điểm muốn vẽ trên ma trận pixel
    public Point LamTronDiem(int x, int y) {
        Point point = new Point();
        if (x % 5 >= 2.5) {
            x = (x / 5) * 5 + 5;
        } else {
            x = (x / 5) * 5;
        }
        if (y % 5 >= 2.5) {
            y = (y / 5) * 5 + 5;
        } else {
            y = (y / 5) * 5;
        }
        point.toaDoX = x;
        point.toaDoY = y;
        return point;
    }
    
    public Point ChuyenToaDo2D(Point p){
        Point temp = new Point();
        temp.toaDoX = abs((pointGiuaManHinh.toaDoX - p.toaDoX) / 5);
        temp.toaDoY = abs((pointGiuaManHinh.toaDoY - p.toaDoY) / 5);
        if(p.toaDoX < pointGiuaManHinh.toaDoX){
            temp.toaDoX = -temp.toaDoX;
        }
        if(p.toaDoY > pointGiuaManHinh.toaDoY){
            temp.toaDoY = -temp.toaDoY;
        }
        return temp;
    }
    
    public void PutPixel(Point point) {
        maTranPixel[point.toaDoX / 5][point.toaDoY / 5] = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);//To change body of generated methods, choose Tools | Templates.

                grphcs.setColor(Color.RED);
                //ve luoi pixel va put pixel da ve
                for(int i = 0; i < jPanel1.getWidth(); i+= 5){
                    for(int j = 0; j < jPanel1.getHeight(); j+=5){
                        grphcs.drawRect(i, j, 5, 5);
                        if(maTranPixel[i/5][j/5] == true){
                            grphcs.setColor(Color.BLACK);
                            grphcs.fillOval(i-2, j-2, 4, 4);
                            grphcs.setColor(Color.RED);
                        }
                    }
                }

                grphcs.setColor(Color.BLACK);
                //ve truc toa do
                if(is2D){
                    grphcs.drawLine(pointGiuaManHinh.toaDoX, 0, pointGiuaManHinh.toaDoX, jPanel1.getHeight()); //ve cot
                    grphcs.drawLine(0,pointGiuaManHinh.toaDoY, jPanel1.getWidth(),pointGiuaManHinh.toaDoY ); //ve hang
                }
                else{
                    grphcs.drawLine(pointGiuaManHinh.toaDoX, 0, pointGiuaManHinh.toaDoX, pointGiuaManHinh.toaDoY); //ve cot
                    grphcs.drawLine(pointGiuaManHinh.toaDoX,pointGiuaManHinh.toaDoY, jPanel1.getWidth(),pointGiuaManHinh.toaDoY ); //ve hang
                    grphcs.drawLine(0,jPanel1.getHeight(), pointGiuaManHinh.toaDoX,pointGiuaManHinh.toaDoY ); //ve duong cheo
                }

            }
        };
        btn2D = new javax.swing.JButton();
        btnHinhChop = new javax.swing.JButton();
        btnHinhHop = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        btn2D.setText("2D Bắn pháo hoa");
        btn2D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2DMouseClicked(evt);
            }
        });

        btnHinhChop.setText("3D Hình chóp");
        btnHinhChop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHinhChopMouseClicked(evt);
            }
        });

        btnHinhHop.setText("3D Hình hộp chữ nhật");
        btnHinhHop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHinhHopMouseClicked(evt);
            }
        });

        jLabel1.setText("Toạ độ");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHinhHop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn2D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHinhChop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btn2D)
                        .addGap(109, 109, 109)
                        .addComponent(btnHinhChop)
                        .addGap(154, 154, 154)
                        .addComponent(btnHinhHop))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2DMouseClicked
        // TODO add your handling code here:
        is2D = true;
    }//GEN-LAST:event_btn2DMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        Point point = LamTronDiem(toaDoXTroChuotHienTai, toaDoYTroChuotHienTai);
        Point temp = ChuyenToaDo2D(point);
        PutPixel(point);
        stringToaDo = "\nToa do cua diem bay gio la: (" + temp.toaDoX + "," + temp.toaDoY + ")";
        jTextArea1.append(stringToaDo);    
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
        toaDoXTroChuotHienTai = evt.getX();
        toaDoYTroChuotHienTai = evt.getY();
    }//GEN-LAST:event_jPanel1MouseMoved

    private void btnHinhChopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHinhChopMouseClicked
        // TODO add your handling code here:
        is2D = false;
    }//GEN-LAST:event_btnHinhChopMouseClicked

    private void btnHinhHopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHinhHopMouseClicked
        // TODO add your handling code here:
        is2D = false;
    }//GEN-LAST:event_btnHinhHopMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MyJFrame main = new MyJFrame();
        main.setVisible(true);
        new Thread((Runnable) main).start();
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
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MyJFrame().setVisible(true);
//            }
//        });
    }

    @Override
    public void run() {
        while (true) {
            jPanel1.repaint();
            //jTextArea1.setText(stringToaDo);
        }
    }

    //cái này để hiện ra hàm override, customize code ở trong phần design nó ko tự hiện
    //và xem tham số của các hàm graphic
    public class VeOPixel extends JPanel {

        @Override
        protected void paintComponent(Graphics grphcs) {
            //grphcs.drawLine(WIDTH, WIDTH, WIDTH, WIDTH);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn2D;
    private javax.swing.JButton btnHinhChop;
    private javax.swing.JButton btnHinhHop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
