package net.fizzl.folderrenamer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length < 1) {
			Renamer renamer = new Renamer(".");
			renamer.renameAll();			
		}
		for(String arg : args) {
			Renamer renamer = new Renamer(arg);
			renamer.renameAll();
		}
	}
}
