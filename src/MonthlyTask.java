import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask extends Task {
    public MonthlyTask(String title, String description, Type type, LocalDateTime taskDateTime) {
        super(title, description, type, taskDateTime);
    }

    @Override
    public boolean isAvailable(LocalDate inputDate) {
        var startDate = getDateTime().toLocalDate();
        while (!startDate.isAfter(inputDate)) {
            startDate = startDate.plusMonths(1);
        }
        return startDate.equals(inputDate);
    }
}
