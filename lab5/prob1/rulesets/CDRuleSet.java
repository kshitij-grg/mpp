package prob1.rulesets;

import prob1.gui.CDWindow;

import java.awt.*;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Price must be a floating point number with two decimal places
 * 3. Price must be a number greater than 0.49.
 */

public class CDRuleSet implements RuleSet {
    private CDWindow cdWindow;

    @Override
    public void applyRules(Component ob) throws RuleException {
        // TODO Auto-generated method stub
        cdWindow = (CDWindow) ob;
        emptyFieldValidation();
        priceValidation();
    }

    public void emptyFieldValidation() throws RuleException {
        if (cdWindow.getTitleValue().trim().isEmpty() ||
                cdWindow.getArtistValue().trim().isEmpty() ||
                cdWindow.getPriceValue().trim().isEmpty()) {
            throw new RuleException("All fields must be non-empty!");
        }
    }

    public void priceValidation() throws RuleException {
        String price = cdWindow.getPriceValue();
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
