package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Purchase extends Model   {
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
    public Purchase() {

        System.out.println("Введите цель кредита(машина/квартира)");


        try {
            String numa = reader.readLine();
             setPurchase(numa);

            System.out.println("Ваша цель: " + getPurchase() );
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
