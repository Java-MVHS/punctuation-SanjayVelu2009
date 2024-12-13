/*
 * Sanjay Velu
 * 12/12/24
 * Punctuation.java
 * This code removes the punctuation of the string given.
 * 
 * Psudocode
 * 
 * Call searchIt in main
 * Make a string, call it text, with the given strings
 * Make text equal to the return value of getPunctuationWords and pass text into it
 * Call printing and pass text, to print the output
 * In getPunctuationWords call checkForPunctuation, pass text as textIn, equate it to the return value of checkForPunctuation, while passing textIn
 * In checkForPunctuation make a string named as word, integer as y and initialize it as 0
 * Also make a string called sentence which will return the end value and a string called puncChar which has all the punctuation
 * Make a for loop with i initialized as an integer, the condition being less than the length of text(text_In) and incrementing each iteration
 * make word equal to the text substring of y and i
 * make a boolean called punc and intialize it as false
 * Make another for loop with and integer b as 0, it being less than the length of puncChar and it incrementing each iteration
 * make another character variable called j and equal to the character at the posistion of the variable b
 * Make an if statement with the index of word string with the index of j
 * Make the statement passed in the if sequence as punc being true
 * Make another if sequence with punc passed
 * The statement in the if sequence will be sentence equal to sentence concatnated to the word string.
 * Outside the if statement make y equal to i plus 1
 * return sequence
 * In the printing method pass text as text2
 * Print text2 using System.out.println
*/
public class Punctuation
{
	public static void main(String[] args)
	{
		Punctuation ps = new Punctuation();
		ps.searchIt();
		
	}
	
	public void searchIt()
	{
		
		String text = new String("Blood, Sweat, and Tears by Winston Churchill " +
		"May 13, 1940" +
		"Mr. Speaker:" +
		"On Friday evening last I received His Majesty’s commission to form a \n new \n" +
		"Administration. It was the evident wish and will of Parliament and the \n nation that this should be conceived on the broadest possible basis and that it should \n include all parties, both those who supported the late Government and also the parties \nof the Opposition.\n" +
		"I have completed the most important part of this task. A War Cabinet has \n been formed of five Members, representing, with the Liberal Opposition, the unity of the \nnation. The three party Leaders have agreed to serve, either in the War Cabinet or in \nhigh executive office. The three Fighting Services have been filled. It was necessary \nthat this should be done in one single day, on account of the extreme urgency and\n rigour of events. A number of other key positions were filled yesterday, and I am \nsubmitting a further list to His Majesty tonight. I hope to complete the appointment of the \nprincipal Ministers during tomorrow. The appointment of the other Ministers usually \ntakes a little longer, but I trust that, when Parliament meets again, this part of my task \nwill be completed, and that the Administration will be complete in all respects.\n" +
		"Sir, I considered it in the public interest to suggest that the House should\nbe summoned to meet today. Mr. Speaker agreed and took the necessary steps, in \naccordance with the powers conferred upon him by the Resolution of the House. At the \nend of the proceedings today, the Adjournment of the House will be proposed until \nTuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The \nbusiness to be considered during that week will be notified to Members at the earliest \nopportunity. I now invite the House, by the Resolution which stands in my name, to \nrecord its approval of the steps taken and to declare its confidence in the new \nGovernment.\n" +
		"Sir, to form an Administration of this scale and complexity is a serious \nundertaking in itself, but it must be remembered that we are in the preliminary stage of \none of the greatest battles in history, that we are in action at many points in Norway and \nin Holland, that we have to be prepared in the Mediterranean, that the air battle is \ncontinuous and that many preparations have to be made here at home. In this crisis I \nhope I may be pardoned if I do not address the House at any length today. I hope that \nany of my friends and colleagues, or former colleagues, who are affected by the political\nreconstruction, will make all allowances for any lack of ceremony with which it has been\nnecessary to act. I would say to the House, as I said to those who’ve joined this\ngovernment: \"I have nothing to offer but blood, toil, tears and sweat.\"" +
		"We have before us an ordeal of the most grievous kind. We have before\nus many, many long months of struggle and of suffering. You ask, what is our policy? I\nwill say: It is to wage war, by sea, land and air, with all our might and with all the\nstrength that God can give us; to wage war against a monstrous tyranny, never\nsurpassed in the dark and lamentable catalogue of human crime. That is our policy. You\nask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in\nspite of all terror, victory, however long and hard the road may be; for without victory,\nthere is no survival. Let that be realised; no survival for the British Empire, no survival\nfor all that the British Empire has stood for, no survival for the urge and impulse of the\nages, that mankind will move forward towards its goal. " +
		"But I take up my task with buoyancy and hope. I feel sure that our cause\nwill not be suffered to fail among men. At this time I feel entitled to claim the aid of all,\nand I say, \"Come then, let us go forward together with our united strength.\"");

		String text1 = getPunctuationWords(text); //calling getPunctuation
		printing(text1);							//calling printing to print output
	}
	
	public String getPunctuationWords(String textIn)
	{
		return textIn = checkForPunctuation(textIn);	//calling checkForPunctuation
	}
	
	public String checkForPunctuation(String text_In)
	{
		
		String word = new String(""); 					//singular words
		int y = 0;										//used to get words, using substring
		String sentence = new String("");				//final output
		String puncChar = ",.;!?\"'()-:";				//all punctuation
		boolean punc;									//if there is punctuation
		for(int i = 0; i < text_In.length(); i++)
		{
			if(text_In.charAt(i) == ' ' || i == text_In.length())
			{
				word = text_In.substring(y, i);
				punc = false;
			
			for(int b = 0; b< puncChar.length(); b++)
			{
				char j = puncChar.charAt(b);
				if(word.indexOf(j) != -1)
				{
					punc = true;
				}
			}
			if(punc)
			{
				sentence = sentence.concat(word);
			}
			y = i+1;
		
	}
		}
		return sentence;
	}
               			
	public void printing(String text2)
	{
		System.out.print(text2);
	}

}


