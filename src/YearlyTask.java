import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task{
    public YearlyTask(String title, String description, Type type, LocalDateTime taskDateTime) {
        super(title, description, type, taskDateTime);
    }

    @Override
    public boolean isAvailable(LocalDate inputDate) {
        var startDate = getDateTime().toLocalDate();
        while (!startDate.isAfter(inputDate)) {
            startDate = startDate.plusYears(1);
        }
        return startDate.equals(inputDate);
    }
}
