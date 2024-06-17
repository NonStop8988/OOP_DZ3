import java.util.Collections;
import java.util.List;

public class StreamService {
    public void sortPotoks(List<Potok> potoks) {
        Collections.sort(potoks, new StreamComparator());
    }
}
