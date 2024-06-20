package Input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        
        JOptionPane.showMessageDialog(null,
                "Não há uma entrada aqui; digite uma mensagem",
                "Título",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Esta é uma pergunta?",
                "Título da Caixa de Diálogo",
                3,
                null,
                null,
                "Digite algo aqui.");
        
        
        String[] acceptableValues = {"Opção 1", "Opção 2", "Opção 3"};
        var input2 = (String)JOptionPane.showInputDialog(null,
                "Esta é uma pergunta?",
                "Título da Caixa de Diálogo",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        
        
          
    }
}
