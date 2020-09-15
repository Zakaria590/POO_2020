package pfc;
/**
 * Aller
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */
//Constructeur de l'enum
public enum Choice{
	ROCK, PAPER, SCISSORS;
	/**
	 * Compare with other Choice and return 1 if stronger , 0 if same else return -1
	 * @param c Objet enum from Choice
	 * @return Compare with other Choice and return 1 if stronger , 0 if same else return -1
	 */
	public int compare(Choice c){
		if (this==c){
			return 0;
		}
		else if (this==ROCK){
			if (c==PAPER){
				return -1;
			}
			else {
				return 1;
			}
		}
		else if (this==PAPER){
			if (c==SCISSORS){
				return -1;
			}
			else {
				return 1;
			}
		}
		else if (c==ROCK){
			return -1;
		}
		return 1;
	}
}
