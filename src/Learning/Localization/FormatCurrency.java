package Learning.Localization;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class FormatCurrency {
    public static void main(String[] args) {
        var amount = 567.87;
        Locale locale = Locale.getDefault();
        Locale chinaLocale = Locale.CHINA;

        Currency currency = Currency.getInstance(locale);
        System.out.println(currency.getDisplayName());
        System.out.println(currency.getSymbol());

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        NumberFormat chineseCurrencyFormatter = NumberFormat.getCurrencyInstance(chinaLocale);
        String formattedCurrency = currencyFormatter.format(amount);

        System.out.println(formattedCurrency);
        System.out.println(chineseCurrencyFormatter.format(amount));
    }
}
