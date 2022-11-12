import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class TextEditor implements ActionListener{
    JFrame frame;
    JMenuBar menuBar;
    JMenu file, edit;
    JMenuItem newFile, openFile, saveFile;
    JMenuItem cut, copy, paste, selectAll, close;

    JTextArea textArea;
    TextEditor(){
        //Initialized this frame
        frame = new JFrame();
//initialize menu
        menuBar=new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("Edit");

        menuBar.add(file);
        menuBar.add(edit);
//init textArea
        textArea=new JTextArea();

        //init menu items
        newFile=new JMenuItem("New File");
        openFile=new JMenuItem("Open File");
        saveFile=new JMenuItem("Save File");

        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
//         file.add(newFile);
//         file.add(openFile);
//         file.add(saveFile);

        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);


        cut=new JMenuItem("Cut");
        copy=new JMenuItem("Copy");
        paste=new JMenuItem("Paste");
        selectAll=new JMenuItem("Select All");
        close=new JMenuItem("Close");

        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        close.addActionListener(this);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        edit.add(close);

        frame.add(textArea);
        frame.setJMenuBar(menuBar);

        frame.setBounds(100, 100, 400 , 400);
        frame.setVisible(true);
        frame.setTitle("Text Editor");

    }
    public static void main(String[] args){
        TextEditor textEditor = new TextEditor();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        e.getSource();
        if(e.getSource()==newFile)
        {


        }
        if(e.getSource()==saveFile)
        {

        }
        if(e.getSource()==openFile)
        {


        }
        if(e.getSource()==cut)
        {
            textArea.cut();

        }
        if(e.getSource()==paste)
        {
            textArea.paste();

        }
        if(e.getSource()==copy)
        {
            textArea.copy();

        }
        if(e.getSource()==selectAll)
        {
            textArea.selectAll();

        }
        if(e.getSource()==close)
        {
            System.exit(0);

        }

    }
}
