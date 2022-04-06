import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class main implements ActionListener {
	
	private static String clrPunPara;
	private String line;
	private String myWholeText = "";

	
	ArrayList <String> wholeWord = new ArrayList<String>();

	JFrame window;
	JButton selectButton, clearButton;
	JTextArea textArea;
	JScrollPane scrollPane;

	
	public static void main(String[] args) {
		new main();

	
	}

	public main() {
		createWindow();
		createTextArea();
		createButtons();
		window.setVisible(true);
	}

	public void createWindow() {
		window = new JFrame("Advance Words Count");
		window.setLayout(new FlowLayout());
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void createTextArea() {
		textArea = new JTextArea(30, 40);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		window.add(scrollPane);
	}

	public void createButtons() {

		selectButton = new JButton("Select");
		window.add(selectButton);
		selectButton.addActionListener(this);
		selectButton.setBounds(170, 200, 80, 50);

		clearButton = new JButton("Clear");
		window.add(clearButton);
		clearButton.addActionListener(this);
		clearButton.setBounds(100, 200, 80, 50);
		;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == selectButton) {
			JFileChooser fileChooser = new JFileChooser();

			int response = fileChooser.showOpenDialog(null);// select the file to open

			if (response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());

				try (BufferedReader read = new BufferedReader(new FileReader(file))) {

					while ((line = read.readLine()) != null) {
						myWholeText = myWholeText + line;
						

					}
					duplicateWords(myWholeText);

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}
		if (e.getSource() == clearButton) {
			textArea.setText("");
		}
	}
	
	public void duplicateWords(String inputStringFromFile) {
		ArrayList <String> punctuationList = new ArrayList<String>();
		punctuationList.add("[");
		punctuationList.add("!");
		punctuationList.add("\\");
		punctuationList.add("#");
		punctuationList.add("$");
		punctuationList.add("%");
		punctuationList.add("&");
		punctuationList.add("'");
		punctuationList.add("(");
		punctuationList.add(")");
		punctuationList.add("*");
		punctuationList.add("+");
		punctuationList.add(",");
		punctuationList.add("-");
		punctuationList.add(".");
		punctuationList.add("/");
		punctuationList.add(":");
		punctuationList.add(";");
		punctuationList.add("<");
		punctuationList.add("=");
		punctuationList.add(">");
		punctuationList.add("?");
		punctuationList.add("@");
		punctuationList.add("\\[");
		punctuationList.add("\\]");
		punctuationList.add("^");
		punctuationList.add("_");
		punctuationList.add("`");
		punctuationList.add("{");
		punctuationList.add("}");
		punctuationList.add("|");
		punctuationList.add("~");
		punctuationList.add("");
		
		ArrayList <String> wordList = new ArrayList<String>();
		wordList.add("i");
		wordList.add("me");
		wordList.add("my");
		wordList.add("myself");
		wordList.add("we");
		wordList.add("our");
		wordList.add("ours");
		wordList.add("ourselves");
		wordList.add("you");
		wordList.add("your");
		wordList.add("yours");
		wordList.add("yourself");
		wordList.add("yourselves");
		wordList.add("he");
		wordList.add("him");
		wordList.add("his");
		
		wordList.add("himself");
		wordList.add("she");
		wordList.add("her");
		wordList.add("hers");
		wordList.add("herself");
		wordList.add("it");
		wordList.add("it's");
		wordList.add("itself");
		wordList.add("they");
		wordList.add("them");
		wordList.add("their");
		wordList.add("theirs");
		wordList.add("themselves");
		wordList.add("what");
		wordList.add("which");
		wordList.add("who");

		wordList.add("whom");
		wordList.add("this");
		wordList.add("that");
		wordList.add("these");
		wordList.add("those");
		wordList.add("am");
		wordList.add("is");
		wordList.add("are");
		wordList.add("was");
		wordList.add("were");
		wordList.add("be");
		wordList.add("been");
		wordList.add("being");
		wordList.add("have");
		wordList.add("has");
		wordList.add("had");

		wordList.add("having");
		wordList.add("do");
		wordList.add("does");
		wordList.add("did");
		wordList.add("doing");
		wordList.add("a");
		wordList.add("an");
		wordList.add("the");
		wordList.add("and");
		wordList.add("but");
		wordList.add("if");
		wordList.add("or");
		wordList.add("as");
		wordList.add("because");
		wordList.add("until");
		wordList.add("while");

		wordList.add("of");
		wordList.add("at");
		wordList.add("by");
		wordList.add("for");
		wordList.add("with");
		wordList.add("about");
		wordList.add("against");
		wordList.add("between");
		wordList.add("into");
		wordList.add("through");
		wordList.add("during");
		wordList.add("before");
		wordList.add("after");
		wordList.add("above");
		wordList.add("below");
		wordList.add("to");

		wordList.add("from");
		wordList.add("up");
		wordList.add("down");
		wordList.add("in");
		wordList.add("out");
		wordList.add("on");
		wordList.add("off");
		wordList.add("over");
		wordList.add("under");
		wordList.add("again");
		wordList.add("further");
		wordList.add("then");
		wordList.add("once");
		wordList.add("here");
		wordList.add("there");
		wordList.add("when");

		wordList.add("where");
		wordList.add("why");
		wordList.add("how");
		wordList.add("all");
		wordList.add("any");
		wordList.add("both");
		wordList.add("each");
		wordList.add("few");
		wordList.add("more");
		wordList.add("most");
		wordList.add("other");
		wordList.add("some");
		wordList.add("such");
		wordList.add("no");
		wordList.add("nor");
		wordList.add("not");
		

		wordList.add("only");
		wordList.add("own");
		wordList.add("same");
		wordList.add("so");
		wordList.add("than");
		wordList.add("too");
		wordList.add("very");
		wordList.add("can");
		wordList.add("will");
		wordList.add("just");
		wordList.add("don");
		wordList.add("should");
		wordList.add("now");
		// Create a array contains punctuation.

		// First clear the punctuation from the text.
		inputStringFromFile = inputStringFromFile.toLowerCase();
		inputStringFromFile=inputStringFromFile.replace(",","");
		inputStringFromFile=inputStringFromFile.replace(".","");
		
		final String[] splitwords = inputStringFromFile.split(" ");
		List<String> allwords = Arrays.asList(splitwords);
		wholeWord.addAll(allwords);
		final Map<String, Integer> wordNumbers = new HashMap<String, Integer>();
		wholeWord.removeAll(wordList);
		wholeWord.remove(punctuationList);
		
		Collections.sort(wholeWord, Collections.reverseOrder());

		for (String word : wholeWord) {
			if (wordNumbers.containsKey(word)) {
				wordNumbers.put(word, wordNumbers.get(word) + 1);
			} else {
				wordNumbers.put(word, 1);
			}
		}
		final Set<String> wordsInString = wordNumbers.keySet();
		for (String word : wordsInString) {
			// Before append the words , sort them descending order
			//Collections.sort(word, Collections.reverseOrder());

			if (wordNumbers.get(word) > 1) {
				textArea.append("\n" + "(" +wordNumbers.get(word)  + " , " + word + ")");
			}
		}
	}
}