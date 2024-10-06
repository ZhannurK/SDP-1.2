import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        // Adding notification channels
        notificationService.addChannel(new SMSNotification());
        notificationService.addChannel(new EmailNotification());
        notificationService.addChannel(new PushNotification());

        // List of recipients
        List<String> recipients = List.of("user1@example.com", "user2@example.com", "+1234567890");

        // Sending bulk notifications
        notificationService.sendBulkNotifications("Hello, this is a test message!", recipients);
    }
}