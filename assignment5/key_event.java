import javax.swing.*;  
import javax.awt.event.*;  
public class KeyEventDemo extends Frame implements KeyListener{  
    Label l;  
    TextArea area;  
    KeyEventDemo(){  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        area=new TextArea();  
        area.setBounds(20,80,300, 300);  
        area.addKeyListener(this);  
        add(l);
        add(area);  
        setSize(500,500);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent obj) {  
        l.setText("Key Pressed");  
    }  
    public void keyReleased(KeyEvent obj) {  
        l.setText("Key Released");  
    }  
    public void keyTyped(KeyEvent obj) {  
        l.setText("Key Typed");  
    }  
  
    public static void main(String[] args) {  
        new KeyEventDemo();  
    }  
}  
