package servises;

import module.Banks;
import module.Model;

public class Controller extends Model {
    public Banks goodadvise(){
        if((getPurchase().equals("машина"))&&(getEarlyRepayment().equals("да"))&&(getCreditLineIncrease().equals("да"))||(getPurchase().equals("квартира"))&&(getEarlyRepayment().equals("нет"))&&(getCreditLineIncrease().equals("нет"))) return Banks.SWED;
        if((getPurchase().equals("машина"))&&(getEarlyRepayment().equals("нет"))&&(getCreditLineIncrease().equals("да"))||(getPurchase().equals("квартира"))&&(getEarlyRepayment().equals("да"))&&(getCreditLineIncrease().equals("нет"))) return Banks.PRIVAT;
        if((getPurchase().equals("машина"))&&(getEarlyRepayment().equals("да"))&&(getCreditLineIncrease().equals("нет"))||(getPurchase().equals("квартира"))&&(getEarlyRepayment().equals("нет"))&&(getCreditLineIncrease().equals("да"))) return Banks.MONO;
        return Banks.IBOX;

    }
}
