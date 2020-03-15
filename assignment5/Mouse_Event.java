import javax.awt.*;  
import javax.awt.event.*;  
public class MouseEventDemo implements MouseListener{  
    Label l;  
    MouseEventDemo(){  
        JFrame frame=new JFrame("Mouse Event");
        l=new Label();  
        l.setBounds(20,50,100,20);  
        frame.add(l);  
        frame.setSize(300,300);  
        frame.setLayout(null);  
        frame.setVisible(true); 
        addMouseListener(this); 
        l=new Label();  
        l.setBounds(20,50,100,20)
    }  
    public void mouseClicked(MouseEvent obj) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent obj) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent obj) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent obj) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent obj) {  
        l.setText("Mouse Released");  
    }  
public static void main(String[] args) {  
    new MouseEventDemo();  
}  
}
