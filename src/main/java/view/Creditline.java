package view;

import java.io.IOException;

public class Creditline extends Repayment {
    public Creditline() {
        System.out.println("Вас интересует возможность увеличения кредитной линии ?(да/нет)");
        try {
            String numa = reader.readLine();
            setCreditLineIncrease(numa);

            System.out.println("Вы сказали: " + getCreditLineIncrease() );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
