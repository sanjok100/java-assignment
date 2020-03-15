
import javax.swing.*;
import javax.awt.event.*;

class FocusEventDemo {
 
  public static void main(String[] args) {
  JFrame frame = new JFrame("Example Frame");
 
JTextArea ta = new TextArea("Sample text...");
ta.setBounds(100,50,150,20);
 JButton btn = new JButton("Click Me!!");
 btn.setBounds(100,100,150,20);
 frame.add(ta);
 frame.add(btn);
btn.addFocusListener(new FocusListener() {
    public void focusLost(FocusEvent obj) {
 
  if (obj.isTemporary()) {
 
System.out.println("Button lost focus temporary");
 
  } 
  else {
 System.out.println("Button lost focus permanently");
  }
  Component c = obj.getOppositeComponent();
  System.out.println("Componenet " + c + " gained focus");
   }
   public void focusGained(FocusEvent obj) {
  Component c = obj.getOppositeComponent();
 
  System.out.println("Componenet " + c + " lost focus");
  }
 
});
 frame.setSize(500, 600);
 frame.setVisible(true);
 frame.setLayout(null);
  }
 
}
