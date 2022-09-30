package Learning.Localization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumber {
    /**
     * Number has different formats, for example:
     * 2,360.85
     * 2360.85
     * 2‘360,85...
     * */

    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        String res = numberFormat.format(32360.856947);
        System.out.println(res);

        String chinaLocale = Locale.CHINA.getLanguage() + " : " + Locale.CHINA.getCountry();
        System.out.println(chinaLocale);

        NumberFormat numberFormat1 = NumberFormat.getInstance(Locale.CHINA);
        numberFormat1.setMaximumFractionDigits(2);
        String res1 = numberFormat1.format(32360.856947);
        System.out.println(res1);


        //注意这里面可以直接用new构造。
        DecimalFormat decimalFormat = new DecimalFormat("$#0.000");
        String res2 = decimalFormat.format(32360.856947);
        System.out.println(res2);
    }
}
