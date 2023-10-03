package period_tracker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class MenstrualApp {
    public LocalDate checkNextFlowDate(String lastPeriod, int menstrualCycleDuration) {
        String specifiedDate = parseDate(lastPeriod);
        LocalDate specificDate = LocalDate.parse(specifiedDate);
        return specificDate.plusDays(menstrualCycleDuration);
    }

    public LocalDate ovulationDate(String lastPeriod, int menstrualCycleDuration) {
        String specifiedDate = parseDate(lastPeriod);
        LocalDate specificDate = LocalDate.parse(specifiedDate);
        return specificDate.plusDays(menstrualCycleDuration / 2);
    }

    public LocalDate nextSafeDate(String lastPeriod, int menstrualCycleDuration) {
        String specifiedDate = parseDate(lastPeriod);
        LocalDate specificDate = LocalDate.parse(specifiedDate);
        return specificDate.plusDays(menstrualCycleDuration - 7);
    }

    private static String parseDate(String dateStr) {
        try {
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedDate = dateFormat1.parse(dateStr);

            return dateStr;
        } catch (ParseException error) {
            throw new IllegalArgumentException("----------Invalid Date Format");
        }
    }
}
