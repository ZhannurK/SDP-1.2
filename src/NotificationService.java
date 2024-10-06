import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<Notification> notificationChannels;

    public NotificationService() {
        this.notificationChannels = new ArrayList<>();
    }

    // Add a notification channel
    public void addChannel(Notification channel) {
        notificationChannels.add(channel);
    }

    // Send bulk notifications
    public void sendBulkNotifications(String message, List<String> recipients) {
        for (Notification channel : notificationChannels) {
            for (String recipient : recipients) {
                channel.send(message, recipient);
            }
        }
    }
}