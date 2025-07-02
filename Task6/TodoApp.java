import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TodoApp extends JFrame {
    private JTextField taskField;
    private JButton addButton;
    private JButton deleteButton;
    private DefaultListModel<String> listModel;
    private JList<String> taskList;

    public TodoApp() {
        // Frame settings
        setTitle("To-Do List App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Top Panel (Text field + buttons)
        JPanel topPanel = new JPanel();
        taskField = new JTextField(20);
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");

        topPanel.add(taskField);
        topPanel.add(addButton);
        topPanel.add(deleteButton);

        add(topPanel, BorderLayout.NORTH);

        // List of tasks
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList);
        add(scrollPane, BorderLayout.CENTER);

        // Add Button Action
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText().trim();
                if (!task.isEmpty()) {
                    listModel.addElement(task);
                    taskField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a task.");
                }
            }
        });

        // Delete Button Action
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(null, "Select a task to delete.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TodoApp().setVisible(true);
        });
    }
}
