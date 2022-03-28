package seedu.tinner.ui;

import java.time.LocalDate;
import java.util.logging.Logger;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import seedu.tinner.commons.core.LogsCenter;
import seedu.tinner.model.reminder.UniqueReminderList;

/**
 * Controller for a help page
 */
public class ReminderWindow extends UiPart<Stage> {

    private static final Logger logger = LogsCenter.getLogger(ReminderWindow.class);
    private static final String FXML = "ReminderWindow.fxml";

    @FXML
    private StackPane reminderDateListPanelPlaceholder;

    public ReminderWindow(Stage root) {
        super(FXML, root);
        UniqueReminderList reminderList = UniqueReminderList.getInstance();
        setReminderListPanelListViewPlaceholder(reminderList.getReminderDates());
    }

    /**
     * Creates a new HelpWindow.
     */
    public ReminderWindow() {
        this(new Stage());
    }

    /**
     * Updates <code>roleListPanelPlaceholder</code> to reflect the contents of the current <code>roleList</code>
     */
    public void setReminderListPanelListViewPlaceholder(ObservableList<LocalDate> roleList) {
        ReminderDateListPanel reminderDateListPanel = new ReminderDateListPanel(roleList);
        reminderDateListPanelPlaceholder.getChildren().add(reminderDateListPanel.getRoot());
    }

    /**
     * Shows the reminder window.
     *
     * @throws IllegalStateException <ul>
     *                               <li>
     *                               if this method is called on a thread other than the JavaFX Application
     *                               Thread.
     *                               </li>
     *                               <li>
     *                               if this method is called during animation or layout processing.
     *                               </li>
     *                               <li>
     *                               if this method is called on the primary stage.
     *                               </li>
     *                               <li>
     *                               if {@code dialogStage} is already showing.
     *                               </li>
     *                               </ul>
     */
    public void show() {
        logger.fine("Showing reminder page for upcoming deadlines.");
        getRoot().show();
        getRoot().centerOnScreen();
    }

    /**
     * Returns true if the help window is currently being shown.
     */
    public boolean isShowing() {
        return getRoot().isShowing();
    }

    /**
     * Hides the help window.
     */
    public void hide() {
        getRoot().hide();
    }

    /**
     * Focuses on the help window.
     */
    public void focus() {
        getRoot().requestFocus();
    }

//    /**
//     * Copies the URL to the user guide to the clipboard.
//     */
//    @FXML
//    private void copyUrl() {
//        final Clipboard clipboard = Clipboard.getSystemClipboard();
//        final ClipboardContent url = new ClipboardContent();
//        url.putString(USERGUIDE_URL);
//        clipboard.setContent(url);
//    }
}
