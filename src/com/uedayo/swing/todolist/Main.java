package com.uedayo.swing.todolist;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Main {

    static JFrame mainFrame;
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // 非同期で実行
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                showTodoList();
            }
        });
    }

    private static void showTodoList() {
        createMain();
        addTodoListPane();
        showMain();
    }

    private static void createMain() {
        mainFrame = new JFrame("ToDoリスト");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void addTodoListPane() {
        Container contentPane = mainFrame.getContentPane();
        JComponent newContentPane = new TodoListPane();
        contentPane.add(newContentPane, BorderLayout.CENTER);
    }

    private static void showMain() {
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
