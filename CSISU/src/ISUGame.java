//Andrei Olar
//2021-06-15
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Scanner;
public class ISUGame implements ActionListener {
	private JFrame f;
	private JButton b;
	private static int pts = 0;
	private static String user;
	private static int hintcount=0;
	ISUGame(){
		ImageIcon play = new ImageIcon("7-75606_play-button-png-image-instagram.png");
		b = new JButton("Press to Play");
	    f = new JFrame();
		b.addActionListener(this);
		b.setBounds(170, 200, 135, 45);
		f.setSize(500,500);
		b.setBackground(new Color(230,210,250));
		f.setVisible(true);
		f.setLayout(null);
		f.setTitle("Andrei's Riddle Game!");
		f.getContentPane().setBackground(new Color(153,50,204));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(b);
	}
	public static void main(String[] args) {
		new ISUGame();
	}

	public static void RunGame() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Welcome to the Riddle Game!");
		System.out.println("Please tell me what is your username(no spaces): ");
		user = scn.next();
		if(user.length() > 16) {
			System.out.println("Username is too long, try again");
			System.exit(0);
		}
		System.out.println("Hello and welcome to the game, " + user + "!");
		System.out.println("There will be 5 riddles for you to solve! 2 easy difficulty, 2 medium, and 1 hard!");
		System.out.println("There will also be up to 3 hints that you will be able to use per riddle, but careful, they will decrease your points earned.");
		System.out.println("Aim for the highest score! A perfect score will uncover a secret...");
		System.out.println("For your answers, please put underscores instead of spaces: the_dog_jumped_over_the_fence");
		Riddle1();
		Riddle2();
		Riddle3();
		Riddle4();
		Riddle5();
		System.out.println("Congrats, " + user + " your points total was " + pts);
		if(pts<160) {
			System.out.println("Better luck next time!");
		}
		if(pts<=160 && pts < 340) {
			System.out.println("Good job! Nice work");
		}
		if(pts<=340 && pts < 500) {
			System.out.println("Wow! What a riddle solving maestro you are!");
		}
		System.out.println("You needed " + hintcount + " hints to guess the riddles");
		if(pts==500) {
			System.out.println("A perfect Score! You deserve a bonus riddle!");
			System.out.println("What word in the English language does the following: the first two letters signify a male, the first three letters signify a female, the first four letters signify a great person,"
					+ " while the entire word signifies a great woman. What is the word?");
			System.out.println("No hints! Whats the answer?");
			String correct = "heroine";
				String guess = scn.next();
					if((guess.toLowerCase()).contains(correct)) {
						System.out.println("Congrats that was right!");
						System.out.println("¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \r\n"
								+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ \r\n"
								+ "¶¶¶¶¶¶¶8888¶¶¶¶¶¶¶¶8888¶¶¶¶¶ \r\n"
								+ "¶¶¶¶¶88___8¶88888¶8___8¶¶¶¶¶ \r\n"
								+ "¶¶¶¶¶8__8__8_____8__8__8¶¶¶¶ \r\n"
								+ "¶¶¶¶¶8_888_________888__8¶¶¶ \r\n"
								+ "¶¶¶¶¶8__________________8¶¶¶ \r\n"
								+ "¶¶¶¶¶¶8________________8¶¶¶¶ \r\n"
								+ "¶¶¶¶¶¶¶8__88______88__8¶¶¶¶¶ \r\n"
								+ "¶¶¶¶¶¶¶8__88______88__8¶¶¶¶¶ \r\n"
								+ "¶¶¶¶88¶8______888_____8¶¶¶¶¶ \r\n"
								+ "¶¶¶8__888____8_8_8___8¶¶¶¶¶¶ \r\n"
								+ "¶¶¶8_____8____888___8¶¶¶¶¶¶¶ \r\n"
								+ "¶¶¶8______88______888¶¶¶¶¶¶¶ \r\n"
								+ "¶¶¶88_______________88¶¶¶¶¶¶ \r\n"
								+ "¶¶¶¶¶88_______________8¶¶¶¶¶ \r\n"
								+ "¶¶¶¶¶¶¶8888____________8¶¶¶¶ \r\n"
								+ "¶¶¶¶¶¶¶¶¶¶8_____________8¶¶¶ \r\n"
								+ "¶¶¶¶888¶¶¶8______________8¶¶ \r\n"
								+ "¶¶¶8___8888______88888___8¶¶ \r\n"
								+ "¶¶¶8______8_____8_____8_8¶¶¶ \r\n"
								+ "¶¶¶8______8_____8_____88¶¶¶¶ \r\n"
								+ "¶¶¶8______8_____8_____8¶¶¶¶¶ \r\n"
								+ "¶¶¶8_______888888_____8¶¶¶¶¶ \r\n"
								+ "¶¶¶¶8___888¶¶¶¶¶8_____8¶¶¶¶¶\r\n"
								+ "¶¶¶¶¶888¶¶¶¶¶¶¶¶¶88888¶¶¶¶¶¶\r\n"
								+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
								+ "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
								+ "");
					}
					else {
						System.out.println("Oh no! Please try again you were so close!");
					}
					System.out.println("Thank you for playing the riddle game! Feel free to play again anytime!");
		}
	}
	public static void Riddle1() {
		Scanner scn = new Scanner(System.in);
		String guess;
		int hints;
		int chance = new Random().nextInt(2 - 1 + 1) + 1;
		if (chance ==1) {
			System.out.println("First riddle, 3 hints: ");
			System.out.println("2 people are playing chess at a tournament. The time is 11:20 when they start and yet both win, how?");
			String correct = "playing_seperate_matches";
			System.out.println("Would you like the first hint? Press 1 for yes, 2 to guess");
			hints=scn.nextInt();
			if(hints ==2) {
				System.out.println("Whats your guess?");
				guess = scn.next();
					if((guess.toLowerCase()).contains(correct)) {
						System.out.println("Congrats that was right!");
						pts += 50;
					}
					else {
						System.out.println("Im sorry that was not correct :(");
					}
			}
			if(hints == 1) {
				System.out.println("Theres a whole lot of people at a chess tournament...");
				hintcount ++;
				System.out.println("Would you like the second hint? Press 3 for yes, 2 to guess");
				hints=scn.nextInt();
				if(hints ==2) {
					System.out.println("Whats your guess?");
					guess = scn.next();
						if((guess.toLowerCase()).contains(correct)) {
							System.out.println("Congrats that was right!");
							pts += 30;
						}
						else {
							System.out.println("Im sorry that was not correct :(");
						}
				}
				if(hints == 3) {
					System.out.println("Many matches can be played at once");
					hintcount ++;
					System.out.println("Would you like the third hint? Press 4 for yes, 2 to guess");
					hints=scn.nextInt();
					if(hints ==2) {
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 20;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
					if(hints == 4) {
						System.out.println("I wonder if they're playing each other?...");
						hintcount ++;
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 10;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
				}
			}
		}
		if (chance ==2) {
			System.out.println("First riddle, 2 hints: ");
			System.out.println("What 2 words in the English Language contain the most letters?");
			String correct="post_office";
			System.out.println("Would you like the first hint? Press 1 for yes, 2 to guess");
			hints=scn.nextInt();
			if(hints ==2) {
				System.out.println("Whats your guess?");
				guess = scn.next();
					if((guess.toLowerCase()).contains(correct)) {
						System.out.println("Congrats that was right!");
						pts += 50;
					}
					else {
						System.out.println("Im sorry that was not correct :(");
					}
			}
			if(hints == 1) {
				System.out.println("Letters like abcd?");
				hintcount ++;
				System.out.println("Would you like the second hint? Press 3 for yes, 2 to guess");
				hints=scn.nextInt();
				if(hints ==2) {
					System.out.println("Whats your guess?");
					guess = scn.next();
						if((guess.toLowerCase()).contains(correct)) {
							System.out.println("Congrats that was right!");
							pts += 30;
						}
						else {
							System.out.println("Im sorry that was not correct :(");
						}
				}
				if(hints == 3) {
					System.out.println("I get letters in my mailbox too");
					hintcount ++;
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 20;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
				}
			}
		}
	public static void Riddle2() {
		Scanner scn = new Scanner(System.in);
		String guess;
		int hints;
		int chance = new Random().nextInt(2 - 1 + 1) + 1;
		if (chance ==1) {
			System.out.println("Second riddle, 3 hints: ");
			System.out.println("What has to be broken before you use it?");
			String correct = "egg";
			System.out.println("Would you like the first hint? Press 1 for yes, 2 to guess");
			hints=scn.nextInt();
			if(hints ==2) {
				System.out.println("Whats your guess?");
				guess = scn.next();
					if((guess.toLowerCase()).contains(correct)) {
						System.out.println("Congrats that was right!");
						pts += 50;
					}
					else {
						System.out.println("Im sorry that was not correct :(");
					}
			}
			if(hints == 1) {
				System.out.println("Something you probably have in your kitchen right now");
				hintcount ++;
				System.out.println("Would you like the second hint? Press 3 for yes, 2 to guess");
				hints=scn.nextInt();
				if(hints ==2) {
					System.out.println("Whats your guess?");
					guess = scn.next();
						if((guess.toLowerCase()).contains(correct)) {
							System.out.println("Congrats that was right!");
							pts += 30;
						}
						else {
							System.out.println("Im sorry that was not correct :(");
						}
				}
				if(hints == 3) {
					System.out.println("You probably keep it in your fridge");
					hintcount ++;
					System.out.println("Would you like the third hint? Press 4 for yes, 2 to guess");
					hints=scn.nextInt();
					if(hints ==2) {
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 20;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
					if(hints == 4) {
						System.out.println("You know what I love? Cake");
						hintcount ++;
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 10;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
				}
			}
		}
		if (chance ==2) {
			System.out.println("Second riddle, 1 hint: ");
			System.out.println("What gets wet while drying?");
			String correct= "towel";
			System.out.println("Would you like the first hint? Press 1 for yes, 2 to guess");
			hints=scn.nextInt();
			if(hints ==2) {
				System.out.println("Whats your guess?");
				guess = scn.next();
					if((guess.toLowerCase()).contains(correct)) {
						System.out.println("Congrats that was right!");
						pts += 50;
					}
					else {
						System.out.println("Im sorry that was not correct :(");
					}
			}
			if(hints == 1) {
				System.out.println("You keep it in your bathroom(hopefully)");
				hintcount ++;
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 30;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
			}
		}
	}
	public static void Riddle3() {
		Scanner scn = new Scanner(System.in);
		String guess;
		int hints;
		int chance = new Random().nextInt(2 - 1 + 1) + 1;
		if (chance ==1) {
			System.out.println("Third riddle, 1 hint: ");
			System.out.println("You walk into a dark room that contains a match, a kerosene lamp, a candle and a fireplace. What should you light first?");
			String correct = "match";
			System.out.println("Would you like the first hint? Press 1 for yes, 2 to guess");
			hints=scn.nextInt();
			if(hints ==2) {
				System.out.println("Whats your guess?");
				guess = scn.next();
					if((guess.toLowerCase()).contains(correct)) {
						System.out.println("Congrats that was right!");
						pts += 100;
					}
					else {
						System.out.println("Im sorry that was not correct :(");
					}
			}
			if(hints == 1) {
				System.out.println("What do you need to light the others?");
				hintcount ++;
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 40;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
				}
		if (chance ==2) {
			System.out.println("Third riddle, 3 hints: ");
			System.out.println("What is seen in the middle of March and April that can’t be seen at the beginning or end of either month?");
			String correct= "letter_r";
			System.out.println("Would you like the first hint? Press 1 for yes, 2 to guess");
			hints=scn.nextInt();
			if(hints ==2) {
				System.out.println("Whats your guess?");
				guess = scn.next();
					if((guess.toLowerCase()).contains(correct)) {
						System.out.println("Congrats that was right!");
						pts += 100;
					}
					else {
						System.out.println("Im sorry that was not correct :(");
					}
			}
			if(hints == 1) {
				System.out.println("November has no middle");
				hintcount ++;
				System.out.println("Would you like the second hint? Press 3 for yes, 2 to guess");
				hints=scn.nextInt();
				if(hints ==2) {
					System.out.println("Whats your guess?");
					guess = scn.next();
						if((guess.toLowerCase()).contains(correct)) {
							System.out.println("Congrats that was right!");
							pts += 60;
						}
						else {
							System.out.println("Im sorry that was not correct :(");
						}
				}
				if(hints == 3) {
					System.out.println("Do they mean the dates? Or something else");
					hintcount ++;
					System.out.println("Would you like the third hint? Press 4 for yes, 2 to guess");
					hints=scn.nextInt();
					if(hints ==2) {
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 40;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
					if(hints == 4) {
						System.out.println("March has 5 letters...");
						hintcount ++;
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 30;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
				}
			}
		}
	}
	public static void Riddle4() {
		Scanner scn = new Scanner(System.in);
		String guess;
		int hints;
		int chance = new Random().nextInt(2 - 1 + 1) + 1;
		if (chance ==1) {
			System.out.println("Fourth riddle, 2 hints: ");
			System.out.println("What is in seasons, seconds, centuries and minutes but not in decades, years or days?");
			String correct = "letter_n";
			System.out.println("Would you like the first hint? Press 1 for yes, 2 to guess");
			hints=scn.nextInt();
			if(hints ==2) {
				System.out.println("Whats your guess?");
				guess = scn.next();
					if((guess.toLowerCase()).contains(correct)) {
						System.out.println("Congrats that was right!");
						pts += 100;
					}
					else {
						System.out.println("Im sorry that was not correct :(");
					}
			}
			if(hints == 1) {
				System.out.println("I think moments has it too!");
				hintcount ++;
				System.out.println("Would you like the second hint? Press 3 for yes, 2 to guess");
				hints=scn.nextInt();
				if(hints ==2) {
					System.out.println("Whats your guess?");
					guess = scn.next();
						if((guess.toLowerCase()).contains(correct)) {
							System.out.println("Congrats that was right!");
							pts += 60;
						}
						else {
							System.out.println("Im sorry that was not correct :(");
						}
				}
				if(hints == 3) {
					System.out.println("ceNturies...");
					hintcount ++;
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 40;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
				}
			}
		}
		if (chance ==2) {
			System.out.println("Fourth riddle, 3 hints: ");
			System.out.println("What’s something that no matter how much you feed it it will always be hungry?");
			String correct= "fire";
			System.out.println("Would you like the first hint? Press 1 for yes, 2 to guess");
			hints=scn.nextInt();
			if(hints ==2) {
				System.out.println("Whats your guess?");
				guess = scn.next();
					if((guess.toLowerCase()).contains(correct)) {
						System.out.println("Congrats that was right!");
						pts += 100;
					}
					else {
						System.out.println("Im sorry that was not correct :(");
					}
			}
			if(hints == 1) {
				System.out.println("It doesnt have a mouth");
				hintcount ++;
				System.out.println("Would you like the second hint? Press 3 for yes, 2 to guess");
				hints=scn.nextInt();
				if(hints ==2) {
					System.out.println("Whats your guess?");
					guess = scn.next();
						if((guess.toLowerCase()).contains(correct)) {
							System.out.println("Congrats that was right!");
							pts += 60;
						}
						else {
							System.out.println("Im sorry that was not correct :(");
						}
				}
				if(hints == 3) {
					System.out.println("It's not very picky about it's food, but it does like oil");
					hintcount ++;
					System.out.println("Would you like the third hint? Press 4 for yes, 2 to guess");
					hints=scn.nextInt();
					if(hints ==2) {
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 40;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
					if(hints == 4) {
						System.out.println("Provoking it may stoke the flames...So to speak");
						hintcount ++;
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 30;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
				}
			}
		}
	}
	public static void Riddle5() {
		Scanner scn = new Scanner(System.in);
		String guess;
		int hints;
		int chance = new Random().nextInt(2 - 1 + 1) + 1;
		if (chance ==1) {
			System.out.println("Fifth riddle, 3 hints: ");
			System.out.println("Walk on the living, they don’t even mumble. Walk on the dead, they mutter and grumble. What are they?");
			String correct = "leaves";
			System.out.println("Would you like the first hint? Press 1 for yes, 2 to guess");
			hints=scn.nextInt();
			if(hints ==2) {
				System.out.println("Whats your guess?");
				guess = scn.next();
					if((guess.toLowerCase()).contains(correct)) {
						System.out.println("Congrats that was right!");
						pts += 200;
					}
					else {
						System.out.println("Im sorry that was not correct :(");
					}
			}
			if(hints == 1) {
				System.out.println("They also fall from the heavens");
				hintcount ++;
				System.out.println("Would you like the second hint? Press 3 for yes, 2 to guess");
				hints=scn.nextInt();
				if(hints ==2) {
					System.out.println("Whats your guess?");
					guess = scn.next();
						if((guess.toLowerCase()).contains(correct)) {
							System.out.println("Congrats that was right!");
							pts += 140;
						}
						else {
							System.out.println("Im sorry that was not correct :(");
						}
				}
				if(hints == 3) {
					System.out.println("It sounds all too biblical, the answer has to be on earth. Maybe in a park?");
					hintcount ++;
					System.out.println("Would you like the third hint? Press 4 for yes, 2 to guess");
					hints=scn.nextInt();
					if(hints ==2) {
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 80;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
					if(hints == 4) {
						System.out.println("Have you ever been outside in fall?");
						hintcount ++;
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 50;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
				}
			}
		}
		if (chance ==2) {
			System.out.println("Fifth riddle: ");
			System.out.println("You see a boat filled with people. It has not sunk, but when you look again you don’t see a single person on the boat. Why?");
			String correct="couples";
			System.out.println("Would you like the first hint? Press 1 for yes, 2 to guess");
			hints=scn.nextInt();
			if(hints ==2) {
				System.out.println("Whats your guess?");
				guess = scn.next();
					if((guess.toLowerCase()).contains(correct)) {
						System.out.println("Congrats that was right!");
						pts += 200;
					}
					else {
						System.out.println("Im sorry that was not correct :(");
					}
			}
			if(hints == 1) {
				System.out.println("Spooky! Are they ghosts? Or just weirdos");
				hintcount ++;
				System.out.println("Would you like the second hint? Press 3 for yes, 2 to guess");
				hints=scn.nextInt();
				if(hints ==2) {
					System.out.println("Whats your guess?");
					guess = scn.next();
						if((guess.toLowerCase()).contains(correct)) {
							System.out.println("Congrats that was right!");
							pts += 120;
						}
						else {
							System.out.println("Im sorry that was not correct :(");
						}
				}
				if(hints == 3) {
					System.out.println("Weirdos have dates in the strangest places...");
					hintcount ++;
					System.out.println("Would you like the third hint? Press 4 for yes, 2 to guess");
					hints=scn.nextInt();
					if(hints ==2) {
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 80;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
					if(hints == 4) {
						System.out.println("I hate it when people make it an emphasis to show theyre together...");
						hintcount ++;
						System.out.println("Whats your guess?");
						guess = scn.next();
							if((guess.toLowerCase()).contains(correct)) {
								System.out.println("Congrats that was right!");
								pts += 50;
							}
							else {
								System.out.println("Im sorry that was not correct :(");
							}
					}
				}
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		RunGame();
	}
}
