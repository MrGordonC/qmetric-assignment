package kata.supermarket;

import java.math.BigDecimal;
import java.util.List;

public interface Offer {

    BigDecimal apply(List<Item> items);
}
