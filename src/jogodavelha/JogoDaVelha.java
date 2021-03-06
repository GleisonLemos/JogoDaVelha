
package jogodavelha;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JogoDaVelha extends JFrame {
    
    JPanel pTela = new JPanel(new GridLayout(3, 3, 10, 10));
    JLabel lInformacao = new JLabel();
    
    Bloco[] blocos = new Bloco[9];
    
    final int JOGADOR_1 = 1;
    final int JOGADOR_2 = 2;
    
    public JogoDaVelha(){
        configurarJanela();
        configurarTela();
    } 
    
    public void configurarTela() {
        add(BorderLayout.CENTER,pTela);
        add(Borderlayout.NORTH,lInformacao);
        pTela.setBackground(Color.BLACK);
        
        for(int i=0; i<9; i++){
            Bloco bloco = new Bloco();
            blocos[i] = bloco;
            pTela.add(bloco);                    
                    
        }
        
    
    }
    
    public void configurarJanela() {
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);             
    }
    
    public static void main(String[] args) {
        new JogoDaVelha();
         
    }
    
    public class Bloco extends JButton{
        int quem = 0;
        public Bloco(){
        setBackground(Color.WHITE);
        
       }
    
    
    }
       
    
}
