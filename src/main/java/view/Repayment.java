package view;

import java.io.IOException;

public class Repayment extends Purchase {
    public Repayment() {
        System.out.println("Вас интересует возможность досрочного погашения кредита?(да/нет)");
        try {
            String numa = reader.readLine();

            setEarlyRepayment(numa);

            System.out.println("Вы сказали: " + getEarlyRepayment() );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
