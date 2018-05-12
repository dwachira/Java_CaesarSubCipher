/*Chanchai Lee
 *Caesar Substitution Cipher (09/29/2016)*/
import java.util.Scanner;
public class CaesarSubCipher {

	/*Flag for exit command*/
	static boolean exit_flag = false;

	/*data_dic original characters*/
	static char [] data_dic  = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	/*main*/
	public static void main(String[] args) {

		/*Create scanner object to read line from input*/
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("[Caesar Cipher]\nType \\q to quit the program");

		 /*While not exit*/
		 while (!exit_flag){

			/*Ask for input from console*/
			System.out.print("Please enter the message:");

			/*Create Object for read input*/
			String input_message = scanner.nextLine();


			/*If no input ; continue*/
			if(input_message.length()<=0){continue;}
			/*If exit command*/
			if(input_message.toLowerCase().equals("\\q")){

				System.out.println("Quit");
				/*Break the loop, end this program*/
				break;
				}

			System.out.print("The encryption message is : ");

			/*Create Index*/
			int i,x;

			/*Create loop for reading input message*/
			for(x=0;x<input_message.length();x++)
			{
				/*If character was not letter, then print that character*/
				if(!Character.isLetter(input_message.charAt(x))){

					System.out.print(input_message.charAt(x));
					}

				/*Create loop for compare each character from input_message with data_dic*/
				for(i=0;i<data_dic.length;i++){

					/*If character from input_message matched with data_dic, then print the cipher*/
					if(input_message.toLowerCase().charAt(x)==data_dic[i]){
						/*If character from input_message is UpperCase, then print UpperCase*/
						if(Character.isUpperCase(input_message.charAt(x))){

						System.out.print(Character.toUpperCase(data_dic[(i+3)%26]));
						}
						/*else*/
						else{
							System.out.print(data_dic[(i+3)%26]);
						}
					}

				}
			}
			System.out.println("\n\n");
		}
	}
}
