import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ventavehiculos extends JFrame{
    
    double p,i=12,t,total,t1,t2,t3,t4,t5;
    JLabel jlnombre,jlprecio,jliva,jlmarca,jlbmw,jlsusuki,jltoyota,jld,jlv,jlc,jlp,img;
    JTextField jtnombre,jtprecio,jtiva,jtmarca,jtp;
    JButton calcular,limpiar;

    public ventavehiculos(){
        
        img=new JLabel(new ImageIcon("logo.png"));
        img.setBounds(20,10,500,100);
        
        jlnombre=new JLabel("Nombre:");
        jlnombre.setBounds(50,100,210,70);
        jtnombre=new JTextField(10);
        jtnombre.setBounds(180,120,150,25);
        
        jlprecio=new JLabel("Precio:");
        jlprecio.setBounds(50,140,210,70);
        jtprecio=new JTextField(10);
        jtprecio.setBounds(180,160,150,25);
        
        jliva=new JLabel("Iva:");
        jliva.setBounds(50,180,210,70);
        jtiva=new JTextField("12");
        jtiva.setBounds(180,200,150,25);
        
        jlmarca=new JLabel("Marca:");
        jlmarca.setBounds(50,220,210,70);
        jtmarca=new JTextField(10);
        jtmarca.setBounds(180,240,150,25);
        
        jlbmw=new JLabel("BMW");
        jlbmw.setBounds(100,260,100,70);
        
        jlsusuki=new JLabel("Suzuki");
        jlsusuki.setBounds(200,260,100,70);
        
        jltoyota=new JLabel("Toyota");
        jltoyota.setBounds(300,260,100,70);
        
        jld=new JLabel("20%");
        jld.setBounds(100,290,100,70);
        
        jlv=new JLabel("50%");
        jlv.setBounds(200,290,100,70);
        
        jlc=new JLabel("10%");
        jlc.setBounds(300,290,100,70);
        
        calcular=new JButton("Calcular");
        calcular.setBounds(120,340,100,30);
        
        limpiar=new JButton("Limpiar");
        limpiar.setBounds(250,340,100,30);
        
        jlp=new JLabel("Su total a pagar es:");
        jlp.setBounds(100,380,150,70);
        jtp=new JTextField(10);
        jtp.setBounds(250,400,150,25);
        
        Container panel=getContentPane();
        panel.setLayout(null);
        panel.add(img);
        panel.add(jlnombre);
        panel.add(jlprecio);
        panel.add(jliva); 
        panel.add(jlmarca); 
        panel.add(jlbmw);
        panel.add(jlsusuki);
        panel.add(jltoyota);
        panel.add(jld);
        panel.add(jlv);
        panel.add(jlc);
        panel.add(jlp);
        panel.add(jtnombre);
        panel.add(jtprecio);
        panel.add(jtiva);
        panel.add(jtmarca);
        panel.add(jtp);
        panel.add(calcular);
        panel.add(limpiar);
        
        calcular.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            String marca = jtmarca.getText().toLowerCase();
            p=Double.parseDouble(jtprecio.getText());

            if (marca.equals("bmw")) {
            t = p / 100;
            t1 = t * 12;
            t2 = p + t1;
            t3 = t2 / 100;
            t4 = t3 * 20;
            t5 = t2 - t4;
           } else if (marca.equals("suzuki")) {
            t = p / 100;
            t1 = t * 12;
            t2 = p + t1;
            t3 = t2 / 100;
            t4 = t3 * 50;
            t5 = t2 - t4;
           }else if (marca.equals("toyota")) {
            t = p / 100;
            t1 = t * 12;
            t2 = p + t1;
            t3 = t2 / 100;
            t4 = t3 * 10;
            t5 = t2 - t4;
            } else {
            
            jtp.setText("Marca no válida");
            
        }
            
            jtp.setText("" + t5);
           }
        });
        
           limpiar.addActionListener(new ActionListener (){
            public void actionPerformed (ActionEvent e){
               jtnombre.setText("");
               jtprecio.setText("");
               jtiva.setText("");
               jtmarca.setText("");              
               jtp.setText("");
               
            }       
        }); 
        
        
    }
    public static void main(String[] args) {
        ventavehiculos ventana= new ventavehiculos();
        ventana.setVisible(true);
        ventana.setSize(500,500);
        ventana.setLocation(250,100);
    }
    
}