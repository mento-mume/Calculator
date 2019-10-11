import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private char math_operator;
    private double total1 = 0.0;
    private double total2 = 0.0;

    private JPanel JavaCalculator;
    private JTextField showResult;

    private JButton btnOne;
    private JButton btnZero;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnPlus;
    private JButton btnSubtract;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnDivide;
    private JButton btnMultiply;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnEqual;
    private JButton btnPoint;
    private JButton btnClear;

    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(showResult.getText());
        showResult.setText("");
    }


    public JavaCalculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnOneText = showResult.getText()+ btnOne.getText();
                showResult.setText(BtnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnTwoText = showResult.getText()+ btnTwo.getText();
                showResult.setText(BtnTwoText);

            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnThreeText = showResult.getText()+ btnThree.getText();
                showResult.setText(BtnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnFourText = showResult.getText()+ btnFour.getText();
                showResult.setText(BtnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnFiveText = showResult.getText()+ btnFive.getText();
                showResult.setText(BtnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnSixText = showResult.getText()+ btnSix.getText();
                showResult.setText(BtnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnSevenText = showResult.getText()+ btnSeven.getText();
                showResult.setText(BtnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnEightText = showResult.getText()+ btnEight.getText();
                showResult.setText(BtnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnNineText = showResult.getText()+ btnNine.getText();
                showResult.setText(BtnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnZeroText = showResult.getText()+ btnZero.getText();
                showResult.setText(BtnZeroText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_Text = btnPlus.getText();
                getOperator(button_Text);

            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               switch(math_operator){
                   case '+':
                       total2 = total1 + Double.parseDouble(showResult.getText());
                       break;
                   case '-':
                       total2 = total1 - Double.parseDouble(showResult.getText());
                       break;
                   case '/':
                       total2 = total1 / Double.parseDouble(showResult.getText());
                       break;
                   case '*':
                       total2 = total1 * Double.parseDouble(showResult.getText());
                       break;
               }
                showResult.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                showResult.setText("");
            }
        });
        btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_Text = btnSubtract.getText();
                getOperator(button_Text);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_Text = btnDivide.getText();
                getOperator(button_Text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_Text = btnMultiply.getText();
                getOperator(button_Text);
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showResult.getText().equals("")){
                    showResult.setText("0.");
                }
                else if(showResult.getText().contains(".")){
                    btnPoint.setEnabled(false);
                }
                else{
                    String BtnPointText = showResult.getText() + btnPoint.getText();
                    showResult.setText(BtnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
