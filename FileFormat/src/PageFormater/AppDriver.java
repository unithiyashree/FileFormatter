package PageFormater;


import java.awt.List;
import java.util.ArrayList;

public class AppDriver {
	public static void driver(ArrayList<String> lines) {
		//Original text in ArrayList
		ArrayList<String> text = new ArrayList<String>();
		//-----------------------------------
			
		
		//text and commands will be separated by flags 
		//in the middle of paragraphs
		ArrayList<ArrayList<String>> textList = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<Character>> commandList = new ArrayList<ArrayList<Character>>();
		
		//initialize first List in ArrayList
		textList.add(new ArrayList<String>());
		commandList.add(new ArrayList<Character>());
		
		//showing the previous data type
		Boolean wasCommand = true;
		
		int i = 0; //tracking original text
		int j = 0; //tracking block of separated text
		while (i < text.size()) {
			
			//we separate text when we get a command after text
			if (text.get(i).charAt(0) == '-' && wasCommand) {
				commandList.get(j).add(text.get(i).charAt(1));
			}
			else if (text.get(i).charAt(0) == '-' && !wasCommand) {
				commandList.add(new ArrayList<Character>());
				textList.add(new ArrayList<String>());
				j ++;
				commandList.get(j).add(text.get(i).charAt(1));
				wasCommand = true;
			}
			else {
				textList.get(j).add(text.get(i));
				wasCommand = false;
			}
			i ++;
		}//end of while
		
		int a = 0; //tracking block #
		int b = 0; //tracking individual block command elements
		char choice;
		while (a < commandList.size()) {
			while (b < commandList.get(a).size()) {
				choice = commandList.get(a).get(b);
				switch (choice) {
					//Alignment
					case 'l':
						//left justification
						for (int x = 0; x < textList.get(a).size(); x++) {
							//textList.get(a).get(x).leftJust()
							//----------------------
						}
						break;
					case 'r':
						//right justification
						for (int x = 0; x < textList.get(a).size(); x++) {
							//textList.get(a).get(x).rightJust()
							//--------------------------------
						}
						break;
					case 'c':
						//center justification
						for (int x = 0; x < textList.get(a).size(); x++) {
							//textList.get(a).get(x).centerJust()
							//--------------------------------
						}
						break;
					case 't':
						//centered title
						for (int x = 0; x < textList.get(a).size(); x++) {
							//textList.get(a).get(x).centerTitle()
							//--------------------------------
						}
						break;
						
					//Spacing
					case 's':
						//single space
						for (int x = 0; x < textList.get(a).size(); x++) {
							//textList.get(a).get(x).single()
							//--------------------------------
						}
						break;
					case 'd':
						//double space
						for (int x = 0; x < textList.get(a).size(); x++) {
							//textList.get(a).get(x).double()
							//--------------------------------
						}
						break;
						
					//Indentation
					case 'i':
						//first line 5 spaces
						for (int x = 0; x < textList.get(a).size(); x++) {
							//textList.get(a).get(x).firstLine()
							//--------------------------------
						}
						break;
					case 'b':
						//multiple line 10 spaces
						for (int x = 0; x < textList.get(a).size(); x++) {
							//textList.get(a).get(x).Lines()
							//--------------------------------
						}
						break;
					case 'n':
						//remove indentation
						for (int x = 0; x < textList.get(a).size(); x++) {
							//textList.get(a).get(x).rmInden()
							//--------------------------------
						}
						break;
					case '2':
						//create 2 columns, 35 char each, 10 char padding
						for (int x = 0; x < textList.get(a).size(); x++) {
							//textList.get(a).get(x).2Col()
							//--------------------------------
						}
						break;
					case '1':
						//create 1 column
						for (int x = 0; x < textList.get(a).size(); x++) {
							//textList.get(a).get(x).1Col()
							//--------------------------------
						}
						break;
					case 'e':
						//insert a blank line
						for (int x = 0; x < textList.get(a).size(); x++) {
							//textList.get(a).get(x).insert()
							//--------------------------------
						}
						break;
					default:
						break;
				}//end of switch
				b ++;
			}
			a ++;

		}//end of while
	}
}
