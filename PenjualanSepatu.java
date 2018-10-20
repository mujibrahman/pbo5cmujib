
package pbobjb;

import javax.swing.*; 
import java.awt.event.*;

public class PenjualanSepatu extends JFrame 
{
JLabel lblnama=new JLabel("Merk Sepatu");    
JTextField txnama=new JTextField(20);    
JLabel lblid=new JLabel("Size");    
JTextField txnid=new JTextField(7);    
JLabel lblpembelian=new JLabel("Kualitas");    
JRadioButton Ori=new JRadioButton("Ori");    
JRadioButton Kwsuper=new JRadioButton("KW Super");    
ButtonGroup total=new ButtonGroup();    
JLabel lbltotal=new JLabel("Kisaran");    
JCheckBox limaratuslebih=new JCheckBox("500 RIBU+");    
JCheckBox sejutalebih=new JCheckBox("1 JUTA+");    
JCheckBox tigajutakurang=new JCheckBox("3 JUTA-");    
JButton cetak=new JButton("Cetak");    
JTextArea hasil=new JTextArea();    
    
PenjualanSepatu()    
{       
 setTitle("Pemesanan Sepatu");       
 setLocation(300,100);       
 setSize(300,320);       
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
}  
 
 void KomponenVisual()    
 {       
  getContentPane().setLayout(null);
  getContentPane().add(lblnama);       
  lblnama.setBounds(10,10,80,20);       
  getContentPane().add(txnama);       
  txnama.setBounds(105,10,175,20);       
  getContentPane().add(lblid);       
  lblid.setBounds(10,33,80,20);       
  getContentPane().add(txnid);       
  txnid.setBounds(105,33,70,20);       
  getContentPane().add(lblpembelian);      
  lblpembelian.setBounds(10,56,80,20);  
  total.add(Ori);    
  total.add(Kwsuper);      
  getContentPane().add(Ori);  
  Ori.setBounds(105,56,62,20);    
  getContentPane().add(Kwsuper);
  Kwsuper.setBounds(160,56,100,20);       
  getContentPane().add(lbltotal);       
  lbltotal.setBounds(10,80,70,20);       
  getContentPane().add(limaratuslebih);       
  limaratuslebih.setBounds(105,80,100,20);       
  getContentPane().add(sejutalebih);       
  sejutalebih.setBounds(105,103,100,20);       
  getContentPane().add(tigajutakurang);       
  tigajutakurang.setBounds(105,126,100,20);       
  getContentPane().add(cetak);       
  cetak.setBounds(10,150,270,20);       
  getContentPane().add(hasil);       
  hasil.setBounds(10,180,270,100);       
  setVisible(true); 
 }

 void AksiReaksi()    
 {       
  cetak.addActionListener(new ActionListener()       
  {          
   public void actionPerformed(ActionEvent e)          
   {             
    hasil.append(txnama.getText()+"\n");             
    hasil.append(txnid.getText()+"\n");             
    if(Ori.isSelected()==true)             
    {                
     hasil.append(Ori.getText()+"\n");             
    }             
    else             
    {                
    hasil.append(Kwsuper.getText()+"\n");             
    }  
    if(limaratuslebih.isSelected()==true)             
    {                
     hasil.append(limaratuslebih.getText()+"\n");             
    }             
    if(sejutalebih.isSelected()==true)             
    {                
     hasil.append(sejutalebih.getText()+"\n");             
    }             
    if(tigajutakurang.isSelected()==true)             
    {                
     hasil.append(tigajutakurang.getText()+"\n");             
    } 
  }       
  });    
 }  
  public static void main(String args[])    
  {       
   PenjualanSepatu e5=new PenjualanSepatu();       
   e5.KomponenVisual();       
   e5.AksiReaksi();    
  }

}

