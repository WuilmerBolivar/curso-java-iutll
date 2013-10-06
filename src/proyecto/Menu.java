package proyecto;

    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;

public class Menu extends JFrame
{
   private final Color valoresColor[]={Color.black,Color.blue,Color.red,Color.green };   
   private JRadioButtonMenuItem elementosColor[], tiposLetra[];
   private JCheckBoxMenuItem elementosEstilo[];
   private JLabel pantallaEtiqueta;
   private int estilo;


   public Menu() {
      super( ".:MENU PRINCIPAL:." );     

      JMenu menuArchivo = new JMenu( "Archivo" );
      menuArchivo.setMnemonic( 'A' );
     
      JMenuItem elementoSalir = new JMenuItem( "Salir" );
      elementoSalir.setMnemonic( 'S' );
      menuArchivo.add( elementoSalir );
      elementoSalir.addActionListener(

         new ActionListener() {  
            public void actionPerformed( ActionEvent evento )
            {
               System.exit( 0 );
            }
         } 
      );
 
      JMenuBar barra = new JMenuBar();  
      setJMenuBar( barra );  
      barra.add( menuArchivo );    
   

      JMenu menuCreditos = new JMenu( "Creditos" );
      menuCreditos.setMnemonic( 'C' );

      JMenuItem elementoAcerca = new JMenuItem( "Acerca de..." );
      menuCreditos.add( elementoAcerca );
      elementoAcerca.addActionListener(

         new ActionListener() {  
            public void actionPerformed( ActionEvent evento )
            {
               JOptionPane.showMessageDialog( Menu.this,
                  "Modificando y aprendiendo\nun poco de Java. By: @WuilmerBolivar",
                  "Acerca de", JOptionPane.PLAIN_MESSAGE );
            }
         }  
      );    
      
      barra.add( menuCreditos );
      
 
      
      
      
      pantallaEtiqueta = new JLabel( "TU SALUDO AQUI", SwingConstants.CENTER );
      pantallaEtiqueta.setForeground( valoresColor[ 3 ] );
      pantallaEtiqueta.setFont( new Font( "Serif", Font.PLAIN, 72 ) );
      getContentPane().setBackground( Color.black );
      getContentPane().add( pantallaEtiqueta, BorderLayout.CENTER );
      setSize( 800, 600 );
      setVisible( true );      
      
      

   } 
      
      public static void main( String args[] ) {
      Menu aplicacion = new Menu();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   
} 