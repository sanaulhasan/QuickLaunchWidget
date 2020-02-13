
package com.desktopWidget;

import com.teknikindustries.yahooweather.WeatherDisplay;
import com.teknikindustries.yahooweather.WeatherDoc;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;


public class MainFrame extends javax.swing.JFrame {

    
    public MainFrame() {
        initComponents();
        getWeather();
        setPosition();
    }

    
    public final void getWeather(){
    
    WeatherDoc doc = new WeatherDoc("2211177","c");
    WeatherDisplay display = new WeatherDisplay();
    condition.setText(display.getCondition());
    temp.setText(display.getTemperature());
    sunrise.setText(display.getSunrise());
    sunset.setText(display.getSunset());
    pressure.setText(display.getPressure());
    Humidity.setText(display.getHumidity());
    visibility.setText(display.getVisibility());
    windspeed.setText(display.getWindSpeed());
    country.setText(display.getCity()+", "+display.getCountry());
    String a = display.getCity()+", "+display.getCountry();
    System.out.print(a);
    }
    
    
    
    public final void setPosition(){
        
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
    
        
          int x = (int) rect.getMaxX() - this.getWidth();
          int y = 0;
        
        
        
        this.setLocation(x, y);
        this.setVisible(true);
    
    
    
    }
    
    
    int mouseX;
    int mouseY;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        condition = new javax.swing.JLabel();
        temp = new javax.swing.JLabel();
        country = new javax.swing.JLabel();
        pressure = new javax.swing.JLabel();
        sunrise = new javax.swing.JLabel();
        sunset = new javax.swing.JLabel();
        Humidity = new javax.swing.JLabel();
        windspeed = new javax.swing.JLabel();
        quite = new javax.swing.JLabel();
        visibility = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(300, 250));
        setMinimumSize(new java.awt.Dimension(300, 250));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(300, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        condition.setFont(new java.awt.Font("Osaka", 1, 12)); // NOI18N
        condition.setForeground(new java.awt.Color(204, 204, 204));
        condition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        condition.setText("Mostly Cloudy");
        condition.setToolTipText("");
        condition.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                conditionMouseDragged(evt);
            }
        });
        getContentPane().add(condition, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 90, 120, 30));

        temp.setFont(new java.awt.Font("STHeiti", 1, 55)); // NOI18N
        temp.setForeground(new java.awt.Color(255, 255, 255));
        temp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        temp.setText("23");
        getContentPane().add(temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 80, 80));

        country.setFont(new java.awt.Font("Osaka", 1, 13)); // NOI18N
        country.setForeground(new java.awt.Color(204, 204, 204));
        country.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        country.setText("Lahore, Pakistan");
        country.setToolTipText("Lahore, Pakistan");
        getContentPane().add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, 120, 30));

        pressure.setFont(new java.awt.Font("Osaka", 1, 10)); // NOI18N
        pressure.setForeground(new java.awt.Color(204, 204, 204));
        pressure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pressure.setText("1015.95");
        pressure.setToolTipText("");
        getContentPane().add(pressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 125, 120, 30));

        sunrise.setFont(new java.awt.Font("Osaka", 1, 14)); // NOI18N
        sunrise.setForeground(new java.awt.Color(255, 255, 255));
        sunrise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sunrise.setText("5:30 am");
        sunrise.setToolTipText("");
        getContentPane().add(sunrise, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 27, 120, 30));

        sunset.setFont(new java.awt.Font("Osaka", 1, 14)); // NOI18N
        sunset.setForeground(new java.awt.Color(255, 255, 255));
        sunset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sunset.setText("5:45 pm");
        sunset.setToolTipText("");
        getContentPane().add(sunset, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 53, 120, 30));

        Humidity.setFont(new java.awt.Font("Osaka", 1, 10)); // NOI18N
        Humidity.setForeground(new java.awt.Color(204, 204, 204));
        Humidity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Humidity.setText("72");
        Humidity.setToolTipText("");
        getContentPane().add(Humidity, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 150, 120, 30));

        windspeed.setFont(new java.awt.Font("Osaka", 1, 10)); // NOI18N
        windspeed.setForeground(new java.awt.Color(204, 204, 204));
        windspeed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        windspeed.setText("1.99");
        windspeed.setToolTipText("");
        getContentPane().add(windspeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 197, 120, 30));

        quite.setFont(new java.awt.Font("Osaka", 1, 12)); // NOI18N
        quite.setForeground(new java.awt.Color(0, 153, 153));
        quite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quite.setToolTipText("Quit this Widget");
        quite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                quiteMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quiteMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quiteMouseEntered(evt);
            }
        });
        getContentPane().add(quite, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 30, 20));

        visibility.setFont(new java.awt.Font("Osaka", 1, 10)); // NOI18N
        visibility.setForeground(new java.awt.Color(204, 204, 204));
        visibility.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        visibility.setText("6.99");
        visibility.setToolTipText("");
        getContentPane().add(visibility, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 175, 120, 30));

        drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragMouseDragged(evt);
            }
        });
        drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dragMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dragMouseEntered(evt);
            }
        });
        getContentPane().add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 6, 290, 240));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/desktopWidget/weather_widget.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quiteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quiteMouseEntered
      quite.setText("Quit");
    }//GEN-LAST:event_quiteMouseEntered

    private void quiteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quiteMouseExited
        // TODO add your handling code here:
        quite.setText("");
    }//GEN-LAST:event_quiteMouseExited

    private void quiteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quiteMouseReleased
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quiteMouseReleased

    private void conditionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conditionMouseDragged
        
    }//GEN-LAST:event_conditionMouseDragged

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
       int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_dragMouseDragged

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void dragMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseEntered
        // TODO add your handling code here:
      
    }//GEN-LAST:event_dragMouseEntered

    private void dragMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseClicked
         getWeather();
    }//GEN-LAST:event_dragMouseClicked

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Humidity;
    private javax.swing.JLabel background;
    private javax.swing.JLabel condition;
    private javax.swing.JLabel country;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel pressure;
    private javax.swing.JLabel quite;
    private javax.swing.JLabel sunrise;
    private javax.swing.JLabel sunset;
    private javax.swing.JLabel temp;
    private javax.swing.JLabel visibility;
    private javax.swing.JLabel windspeed;
    // End of variables declaration//GEN-END:variables
}
