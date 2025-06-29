package prob1.rulesets;

import prob1.gui.BookWindow;

import java.awt.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places
 * 6. Price must be a number greater than 0.49.
 */
public class BookRuleSet implements RuleSet {
    private BookWindow bookWindow;

    @Override
    public void applyRules(Component ob) throws RuleException {
        // TODO Auto-generated method stub
        bookWindow = (BookWindow) ob;
        emptyFieldValidation();
        isbnValidation();
        priceValidation();
    }

    public void emptyFieldValidation() throws RuleException {
        if (bookWindow.getTitleValue().trim().isEmpty() ||
                bookWindow.getIsbnValue().trim().isEmpty() ||
                bookWindow.getPriceValue().trim().isEmpty()) {
            throw new RuleException("All fields must be non-empty!");
        }
    }

    public void isbnValidation() throws RuleException {
        String isbn = bookWindow.getIsbnValue();
        int len = isbn.length();
        try {
            long isbnVal = Long.parseLong(isbn);
            if (len != 13 && len != 10) {
                throw new RuleException("ISBN must consist either 10 or 13 characters");
            }
            switch (len) {
                case 10:
                    if (isbn.charAt(0) != '0' && isbn.charAt(0) != '1') {
                        throw new RuleException("First character must be 0 or 1");
                    }
                    break;
                case 13:
                    if (!isbn.startsWith("978") && !isbn.startsWith("979")) {
                        throw new RuleException("First 3 digits must be either 978 or 979");
                    }
            }
        } catch (NumberFormatException e) {
            throw new RuleException("ISBN must be numeric");
        }
    }

    public void priceValidation() throws RuleException {
        String price = bookWindow.getPriceValue();
        if (!price.matches("\\d+\\.\\d{2}")) {
            throw new RuleException("Price must be a floating number with two decimal places");
        }
        try {
            float priceVal = Float.parseFloat(price);
            if (priceVal < 0.49) {
                throw new RuleException("Price must be greater than 0.49");
            }
        } catch (NumberFormatException e) {
            throw new RuleException("Price must be floating number");
        }
    }
}
